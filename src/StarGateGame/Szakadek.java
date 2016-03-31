package StarGateGame;
 
public class Szakadek extends Mezo{
    public Szakadek(){                                              //A Szakadek konstruktora
        System.out.println("Szakadek konstruktora meghivodott");
    }
    public void Ralep(Szereplo sz, Palya p) {                                   //A Szakadek Ralep fuggvenye
        // TODO - implement Szakadek.Ralep
        System.out.println("Szakadek Ralep(Szereplo sz) fuggvenye meghivodott");
       
        int [] coord = this.GetPoz();                                       //Ideiglenes tomb megkapja a szakadek koordinatait
        sz.SetPoz(coord[0],coord[1]);                                       //Beallitja a szereplonek a koordinatajat a tombben taroltra
       
        sz.Meghal(p);                                               //Meghivja a parameterben atadott szereplo Meghal() fuggvenyet
    }
 
    public void Rarak(Targy t) {                                            //A szakadek Rarak fuggvenye
        // TODO - implement Szakadek.Rarak
        System.out.println("Szakadek Rarak(Targy t) fuggvenye meghivodott");                   
    }
 
    public void Ralo(Lovedek l, Palya p) {                                      //A szakadek Ralo fuggvenye
        // TODO - implement Szakadek.Ralo
        throw new UnsupportedOperationException();                              //Mint egy SimaMezo ugy fog viselkedni
    }
 
    public void SetDobozFlag(Ezredes e, Doboz d, Palya p) {                             //A szakadek SetDobozFlag fuggvenye
        // TODO - implement Szakadek.SetDobozFlag
        System.out.println("Szakadek SetDobozFlag(Ezredes e, Doboz d, Palya p) fuggvenye meghivodott");
       
        d.Megsemmisul(p);                                           //Meghivja a paramterben kapott doboz Megsemmisul() fuggvenyet
    }
}