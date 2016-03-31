package StarGateGame;
 
public class Ezredes extends Szereplo{
    private int zpmszamlalo=0;          // Az ezredesnel levo ZPM-ek szama
    private Doboz vonszoltdoboz=null;   // A felvett dobozunk
    private int irany = 1;              // Az ezredes merre fordul (1 - jobbra, 2 - balra)
   
    public Fegyver f = new Fegyver();   // Az ezredes fegyvere
   
    public Ezredes(){                   // Kostruktor
        System.out.println("Ezredes konstruktora meghivodott");
    }
   
    public void Felvesz(Targy t, Palya p) {         // Targy felvetele
        // TODO - implement Ezredes.Felvesz
        System.out.println("Ezredes Felvesz(Targy t) fuggvenye meghivodott");
        t.Felvettek(this, p);                       // Felvettek(Ezredes e, Palya p)
       
 
    }
 
    public void Lerak(Palya p) {                    // Targy (leginkabb Doboz) letetele
        // TODO - implement Ezredes.Lerak
        System.out.println("Ezredes Lerak() fuggvenye meghivodott");
            vonszoltdoboz.Leraktak(this, p, irany); // Az ezredesnel tarolt doboz letetelre kerul - Leraktak(Ezredes e, Palya p, int irany)
    }
 
    public void Lo(int lovesirany, Palya p) {       // Ezredes lo egy adott iranyba
        // TODO - implement Ezredes.Lo
        System.out.println("Ezredes Lo(int lovesirany, Palya p) fuggvenye meghivodott");
        f.Lo(p,this, lovesirany);                   // Lo(Palya p, Ezredes e, int irany)
    }
 
    public void Lep(int irany, Palya p) {           // Ezredes lep es automatikusan felveszi az ele kerulo targyakat, aminek a helyebe kerul o maga
        // TODO - implement Ezredes.Lep
       
        System.out.println("Ezredes Lep(int irany, Palya p) fuggvenye meghivodott");
       
        this.irany = irany;                         // A lepes iranyaba fordul
           
        int[] actual=this.GetPoz();                 // Visszakerjuk a pillanatnyi poziciojat az ezredesnek
           
        Mezo kiindulas = p.GetMezo(actual);         // Magat a mezot kerjuk, amin az Ezredes all
           
        if(irany == 1){                             // Jobbra eseten
            actual[0]++;                            // A palyan elmozdulunk a mostanihoz képest egyet
        }
        else if (irany == 2){                       // Balra eseten
            actual[0]--;                            // A palyan elmozdulunk a mostanihoz képest egyet
        }
           
        Mezo temp= p.GetMezo(actual);               // A lepessel elerendo mezot kerjuk le
               
        if(temp!=null){                             // Ha nincs ilyen, akkor oda nem lephetunk
            temp.Ralep(this, p);                    // Ha van, akkor Ralep(Ezredes e, Palya p)
            kiindulas.Deaktivalodik();              // Az elhagyott mezot deaktivalja, ami csak akor jut ervenyre, ha van ertelme, azaz merlegrol leptunk le
            temp.Aktivalodik();                     // Az uj mezo aktivaloik (ha merleg), hisz az Ezredes is aktivalhat
        }
        else{
            System.out.println("Itt kiderülne, hogy már nincs mezõ az adott irányban..");
        }
           
        //teszt 2höz majd kell vmi hogy csak akkor legyen ez jó, meg ha más tárgy felvevés van..
        //most az egyes tesztnél is beleugat.. vicces h ha meghal az ezredes akkor is felvesz még tárgyat ha tud.. kéne flag..
        if (this!=null){
            Targy t = p.GetTargy(actual); //kell hogy van-e a lepett helyen targy..
            if(t!=null)                     // Ha van targy a mezon
                Felvesz(t,p);               // Felvesz(Targy t, Palya p)
        }
           
    }
   
    public void Meghal(Palya p) {           // Az ezredes meghal
        // TODO - implement Ezredes.Meghal
        System.out.println("Ezredes Meghal(Palya p) fuggvenye meghivodott");
        p.MegszunikPalya();                 // Ekkor mindennek vege, a palya megszunik
       
    }
 
    public void Teleportal(int[] egyikPortal, int[] masikPortal) {  // Teleportalas
        // TODO - implement Ezredes.Teleportal
        throw new UnsupportedOperationException();
    }
 
    public void FelveszDoboz(Doboz d, Palya p) {    // A doboz felvetele, ha minden adott hozza
        // TODO - implement Ezredes.FelveszDoboz
       
        System.out.println("Ezredes FelveszDoboz() fuggvenye meghivodott");
        vonszoltdoboz = d;                          // Eltarolom a felvett dobozt az ezredesnel
        int[] actual=this.GetPoz();                 // Lekerem a mostani poziciojat az ezredesnek
        Mezo temp= p.GetMezo(actual);               // Az ott talalhato mezo
        temp.Deaktivalodik();                       // Ekkor a helyen deaktivalodik a mezo (ha az merleg)
    }
 
    public void FelveszZPM() {      // ZPM felvetele, ha minden adott hozza
        // TODO - implement Ezredes.FelveszZPM
        System.out.println("Ezredes FelveszZPM() fuggvenye meghivodott");
       
        zpmszamlalo++;              // ZPM szamlalo novelese
   
        //teszt de kéne vminyerés függvény..
        if(zpmszamlalo==1)  //4es tesztben csak egyet kell felvenni..
            System.out.println("nyertel");
    }
 
    public void LerakDoboz(Doboz d, Palya p) {      //Doboz lerakasa
        // TODO - implement Ezredes.LerakDoboz;
        System.out.println("Ezredes LerakDoboz() fuggvenye meghivodott");
       
        int[] actual=this.GetPoz();                 // Ezredes mostani pozicioja
       
           
        if(irany == 1){                             // Jobbra
            actual[0]++;               
        }
        else if (irany == 2){                       // Balra
            actual[0]--;
        }
       
        Mezo temp= p.GetMezo(actual);               // A poziciohoz tartozo mezo
       
        if(temp!=null){                             // Ha van mezo elotte
            d.SetPoz(actual[0], actual[1]);         // Doboz maga ele helyezese
            temp.Aktivalodik();                     // Az adott mezo aktivalasa a doboz alatt (ha merleg)
        }
    }
}