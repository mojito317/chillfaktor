package StarGateGame;
 
import java.util.ArrayList;
 
public class SpecFal extends Mezo{
   
    static private ArrayList<Portal>portalok = new ArrayList<Portal>();
    static Portal a = null;
    static Portal b = null;
   
    private void Atjaro(Lovedek l) {
        // TODO - implement SpecFal.Atjaro
        throw new UnsupportedOperationException();
    }
 
    public void UjPortal(Portal PortalUj, int szin) {
        // TODO - implement SpecFal.UjPortal
        throw new UnsupportedOperationException();
    }
 
    public void Ralep(Szereplo sz, Palya p) {
        // TODO - implement SpecFal.Ralep
        System.out.println("SpecFal Ralep(Szereplo sz, Palya p) fuggvenye meghívódott");
       
        //a Ralep fv akkor csinál érdemlegeset, ha már mindkét portál nyitva (méretük 2)
        if(portalok.size()==2){
            int [] coord = this.GetPoz();
            sz.SetPoz(coord[0],coord[1]); //beállítja a szereplõ koordinátáit a specfaléra
               int[] a= sz.GetPoz();
               System.out.println("Telep elott koorodinata"+a[0]+","+a[1]);
           
            System.out.println("Innen:"+coord[0]+","+coord[1]);
           
            int [] tempcoord = portalok.get(0).GetPoz();
            if(tempcoord[0]==coord[0]){//ha a specfal koord azonos a 0. portál koordinátájával
                tempcoord=portalok.get(1).GetPoz();//legyen az ideiglenes változónk az 1. portál koordintája
                sz.SetPoz(tempcoord[0], tempcoord[1]);  //beállítjuk a szereplot a masik portal koordinatajara (1. szam portal)
            }else{
                tempcoord=portalok.get(0).GetPoz(); //ha a specfal az 1. szamu portal koordinatajaval azonos
                sz.SetPoz(tempcoord[0], tempcoord[1]);  // beallitjuk a szereplot a masik portal koordinatajara (0. szamu portal)
            }
           
            System.out.println("ide:"+tempcoord[0]+"," +tempcoord[1]);
        }
    }
 
    public void Rarak(Targy t) {
        System.out.println("SpecFal Rarak(Targy t) fuggvenye meghívódott");;
    }
 
    public void Ralo(Lovedek l, Palya p) {
        // TODO - implement SpecFal.Ralo
        System.out.println("SpecFal Ralo(Lovedek l, Palya p) fuggvenye meghivodott");
        int [] coord = this.GetPoz();
        l.SetPoz(coord[0],coord[1]);
        //lekerdezzuk a specfal koordinatajat, majd a lovedek koordinatajat beallitjuk ra
       
        //alapertelmezesben az a portal null, tehat ha ralonek a specfalra:
        if(a==null){
            a=new Portal(); //letrehozunk egy uj (a) portalt
            a.SetPoz(coord[0],coord[1]);//beallitjuk a specfal poziciojara
            System.out.println("Kinyilt az egyik portal a kovetkezo koordinatakkal:"+coord[0]+"," +coord[1]);
            portalok.add(a); //a portal static arrayt noveljuk
        }else{ //ha mar kinyilt az egyik portal:
            b=new Portal();//letrehozunk egy uj (b) portalt
            b.SetPoz(coord[0],coord[1]); //beallitjuk a b portal koordinatait a specfalera
            System.out.println("Kinyilt a masik  portal a kovetkezo koordinatakkal:"+coord[0]+"," +coord[1]);
            portalok.add(b); //a portal static arrayt noveljuk
        }
    }
}