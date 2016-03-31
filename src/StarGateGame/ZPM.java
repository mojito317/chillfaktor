package StarGateGame;
 
public class ZPM extends Targy{
    boolean ZPMFlag=false;              //minek? elfelejtettem eltünik p-nél úgyis töröljük
   
    public ZPM(){                       // Konstruktor
        System.out.println("ZPM konstruktora meghivodott");
    }
    public void Eltunik(Palya p) {                          // A ZPM eltunik a palyarol
        // TODO - implement ZPM.Eltunik
        System.out.println("ZPM Eltunik(Palya p) fuggvenye meghivodott");              
                           
 
        p.TorolTargy(this);                                 // Megszunik letezni
       
    }
 
    public void Felvettek(Ezredes e, Palya p) {             // Felvette az ezredes a ZPM-et
        // TODO - implement ZPM.Felvettek
 
        System.out.println("ZPM Felvettek(Ezredes e) fuggvenye meghivodott");
        ZPMFlag=true;                                       // Beallitjuk a flaget, hogy mar fel van veve
        e.FelveszZPM();                                     // Az ezredes tenylegesen felveszi
        Eltunik(p);                                         // Eltunik a palyarol a felvett ZPM
       
    }
 
    public void Leraktak(Ezredes e, Palya p, int irany) {   // Nincs megvalositva, igy nem lehet lerakni
        // TODO - implement ZPM.Leraktak
        throw new UnsupportedOperationException();
    }
}