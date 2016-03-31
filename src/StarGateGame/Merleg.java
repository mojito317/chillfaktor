package StarGateGame;
 
public class Merleg extends Mezo{
    private boolean dobozflag = false;                  // Van-e rajta doboz?
    private Ajto ajto;                                  // A merleg ajtoja
   
    public Merleg(Ajto ajto, boolean dobozflag){        // Konstruktor, amelyben a merleghez hozzarendelodik az ajto es egyben meg kell adni, hogy van-e rajta doboz
        this.ajto=ajto;
        this.dobozflag=dobozflag;
    }
 
    public void Aktivalodik() {                         // Aktivalja az ajtojat a merleg, ha meghivjak
        System.out.println("Merleg Aktivalodik() fuggvenye meghivodott");
        ajto.Nyilik();                                  // Nyilik az ajto
    }
   
    public void Deaktivalodik() {                       // Deaktivalja az ajtojat a merleg, ha meghivjak
        System.out.println("Merleg Deaktivalodik() fuggvenye meghivodott");
        ajto.Zarul();                                   // Zarul az ajto
    }
 
    public void Ralep(Szereplo sz, Palya p) {           // A merleg (mezore) lepes beallitja az ezredes poziciojat az overe, ha minden passzol
        sz.SetPoz(this.GetPoz()[0], this.GetPoz()[1]);  // SetPoz(int x, int y)
    }
 
    public void Rarak(Targy t) {                        // Specialis funkciokhoz
        // TODO - implement Merleg.Rarak
    }
 
    public void Ralo(Lovedek l, Palya p) {              // Ha lovedek eri a merleget
        // TODO - implement Merleg.Ralo
        System.out.println("Merleg Ralo(Lovedek l, Palya p) fuggvenye meghivodott");
        int [] coord = this.GetPoz();                   // Sajat pozicio
        l.SetPoz(coord[0],coord[1]);                    // lovedek poziciojanak atallitasa
       
        l.Mozog(1, p);                                  // Mozog(int irany, Palya p)
    }
 
    public void SetDobozFlag(Ezredes e, Doboz d, Palya p) {     // A dobozjelzo allitasa, es az aktualis allapot szerint felvetel vagy lerakas
        System.out.println("Merleg SetDobozFlag(Ezredes e, Doboz d) fuggvenye meghivodott");
        if(dobozflag){                                  // Vizsgalat
            dobozflag = false;                          // Flag allitas
            e.FelveszDoboz(d, p);                       // FelveszDoboz(Doboz d, Palya p)
        }
        else{
            dobozflag = true;                           // Flag allitas
            e.LerakDoboz(d, p);                         // LerakDoboz(Doboz d, Palya p)
        }  
    }
}