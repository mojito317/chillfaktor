package StarGateGame;
 
public class Lovedek {
    private int x;                          //A lovedek x koordinataja
    private int y;                          //A lovedek y koordinataja
    public void Nyit(int szin) {                    //A lovedek portal nyito metodusa
        // TODO - implement Lovedek.Nyit
        throw new UnsupportedOperationException();
    }
 
    public void Zar(int szin) {                 //A lovedek portal zaro metodusa
        // TODO - implement Lovedek.Zar
        throw new UnsupportedOperationException();
    }
 
    public void Mozog(int lovesirany, Palya p) {            //A lovedek Mozog fuggvenye, a lovedek mozgatasat vegzi.
        // TODO - implement Lovedek.Mozog
        //throw new UnsupportedOperationException();
        System.out.println("Lovedek Mozog(int lovesirany, Palya p) fuggvenye meghivodott");
        if(lovesirany==1){                  //Megvizsgalja a parameterkent kapott lovesiranyt, ha 1-es akkor jobbra, ha 2-es akkor balra megy a lovedek.
           
            int[] actual=this.GetPoz();         //Az aktualis pozicio lekerdezese es elmentese egy ideiglenes tombbe
           
            actual[0]++;                    //Megvaltoztatja a lovedek koordinatajat az ideiglenes tombben.
           
            Mezo temp= p.GetMezo(actual);           //Megnezzuk hogy az adott koordinatakon ahova a lovedek lepne, van e ervenyes mezo
               
            if(temp!=null)                  //Amennyiben van, meghivja az adott mezo Ralo() fuggvenyet, ha nincs akkor kiirja hogy nincs mar mezo jobbra.
                temp.Ralo(this,p);
            else
                System.out.println("Itt kiderülne, hogy már nincs mezõ jobbra..");
        }else{                         
           
            int[] actual=this.GetPoz();         //Ez ugyan az mint ami fent le van irva, csak az ellenkezo iranyban.
           
            actual[0]--;               
           
            Mezo temp= p.GetMezo(actual);
               
            if(temp!=null)
                temp.Ralo(this,p);
            else
                System.out.println("Itt kiderülne, hogy már nincs mezõ balra..");
        }              
    }
 
    public int[] GetPoz() {                                         //A lovedek koordinatainak a lekerdezeset vegzo fuggveny
        // TODO - TMezoPozicio a visszateresi ertek
        System.out.println("Lovedek GetPoz() fuggvenye meghivodott");
    int[] coords={x,y};                                         //egy ideiglenes tombben elhelyezi a lovedek aktualis koordinatait
        // TODO - implement Szereplo.GetPoz
    //  throw new UnsupportedOperationException();
        return coords;                                          //visszaadja a koordinatakat
    }
 
    public void SetPoz(int num_mezo_x, int num_mezo_y) {                            //A lovedek koordinatainak a beallitasa
        // TODO - implement Szereplo.SetPoz
        x=num_mezo_x;                                           //Az x koordinata beallitasa
        y=num_mezo_y;                                           //Az y koordinata beallitasa
        System.out.println("Lovedek SetPoz(int num_mezo_x, int num_mezo_y) fuggvenye meghivodott");
        //throw new UnsupportedOperationException();
    }
}