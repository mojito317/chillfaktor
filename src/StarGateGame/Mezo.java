package StarGateGame;
 
public abstract class Mezo {
    private int x;          // Pozicio x
    private int y;          // Pozicio y
   
    public Mezo(){          // Konstruktor
        System.out.println("Mezo konstruktora meghivodott");
    }
    public abstract void Ralep(Szereplo sz, Palya p);           // Abstract fuggveny lepeshez mezore
 
    public abstract void Rarak(Targy t);                        // Abstract fuggveny lerakashoz mezore
 
    public abstract void Ralo(Lovedek l, Palya p);              // Abstrac fuggveny loveshez mezore
   
    public void SetDobozFlag(Ezredes e, Doboz d, Palya p){};    // A Dobozt jelzo flaget allito es lerakast/felvetelt vezerlo fuggveny altalanos, ures, szukseges esetben felulirhato valtozata
   
    //
    public void Aktivalodik(){};                                // Aktivalodas ures, felulirhato valtozata
   
    //
    public void Deaktivalodik(){};                              // Deaktivalodas ures, felulirhato valtozata
 
    public int[] GetPoz() {                                     // Mezo poziciojanak lekerese
        // TODO - TMezoPozicio a visszateresi ertek
        System.out.println("Mezo GetPoz() fuggvenye meghivodott");
        int[] coords={x,y};                                     // Tombos formaban kapjuk vissza
        // TODO - implement Szereplo.GetPoz
        return coords;
    }
 
    public void SetPoz(int num_mezo_x, int num_mezo_y) {        // A mezo poziciojanak beallitasa
        // TODO - implement Szereplo.SetPoz
        System.out.println("Mezo SetPoz(int num_mezo_x, int num_mezo_y) fuggvenye meghivodott");
        x=num_mezo_x;
        y=num_mezo_y;
       
    }
 
}