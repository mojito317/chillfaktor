package StarGateGame;
 
import java.util.*; //ArrayList hasznalatahoz szukseges import
 
public class Palya{
    public Palya(){
        System.out.println("Palya konstruktora meghivodott");
    }
   
    //Szukseges tarolok a Palya elemeinek osszefogasahoz
    private ArrayList<Mezo>mezok = new ArrayList<Mezo>();   //Osszes mezo objektumunk
    private ArrayList<Targy>targyak = new ArrayList<Targy>();   //osszes Targy objektumunk
    private ArrayList<Szereplo>szereplok = new ArrayList<Szereplo>();   //osszes Szereplo objektumunk
   
    //egyelore nem hasznaltuk ezt a feltoltest, mert az Engineben hoztuk lészre az objektumokat a kulonbozo tesztesetekre, es tettuk bele a tarolokba, majd ha automatizalva lesz, itt lesz megvalositva
    private void FeltoltMezovel(){
 
 
    }
   
    ///egyelore nem hasznaltuk ezt a feltoltest, mert az Engineben hoztuk lészre az objektumokat a kulonbozo tesztesetekre, es tettuk bele a tarolokba, majd ha automatizalva lesz, itt lesz megvalositva
    private void FeltoltTarggyal(){
       
    }
 
    //Attributumkent atadott Mezo objektum mezok tarba helyezese
    public void UjMezo(Mezo mezoUj){
   
        System.out.println("Palya osztaly UjMezo(Mezo mezoUj) fuggvenye meghivodott");
        mezok.add(mezoUj);
       
    }
   
    //Mezo objektum visszateresu fuggveny, ez szalad vegig a mezok taron, es keresi meg hogy van-e a keresett koordinata alatt mezo
    public Mezo GetMezo(int [] xy){
        System.out.println("Palya GetMezo(int [] xy) fuggvenye meghivodott");
        //return mezok.get(i);
        Mezo m= null;
        Mezo temp;
        int tempkoord[];
        int i=0;
        boolean l=false;
        while(i<mezok.size() && !l){    //amig tart a tomb
            temp=mezok.get(i);
            tempkoord=temp.GetPoz();    //lekerjuk a GetPoz segitsegevel a helyzetet
            if(tempkoord[0]==xy[0]){    //osszehasonlitjuk az atadott koordinatankkal
                m=temp;
                l=true;                 //ha van ilyen, kilepunk a ciklusbol es visszaterunk vele
            }
            i++;
        }
        return m;                       //mindenkepp visszaterunk, ha nem talalt a koordinatan elemet, null-al, ez jo lesz a palya vegenek ellenorzesere
    }
   
    //van e az adott szereplo a a szereplok listaban
    public boolean GetSzereplo(Szereplo sz){
        System.out.println("Palya GetSzereplo(Szereplo sz) fuggvenye meghivodott");
        return szereplok.contains(sz);
    }
   
    //Targy objektum visszateresu fuggveny, ez szalad vegig a targyak taron, es keresi meg hogy van-e a keresett koordinata alatt mezo
    public Targy GetTargy(int [] xy){
        System.out.println("Palya GetTargy(int i) fuggvenye meghivodott");
        Targy t= null;
        Targy temp;
        int tempkoord[];
        int i=0;
        boolean l=false;
        while(i<targyak.size() && !l){  //amig tart a tomb
            temp=targyak.get(i);
            tempkoord=temp.GetPoz();    //lekerjuk a GetPoz segitsegevel a helyzetet
            if(tempkoord[0]==xy[0]){    //osszehasonlitjuk az atadott koordinatankkal
                t=temp;
                l=true;                 //ha van ilyen, kilepunk a ciklusbol es visszaterunk vele
            }
            i++;
        }
        return t;                       //mindenkepp visszaterunk, ha nem talalt a koordinatan elemet, null-al, es akkor az azt jelenti, hogy nincs az adott pozicion targy.
    }
   
     //Attributumkent atadott Targy objektum targyak tarba helyezese
    public void UjTargy(Targy targyUj){
       
        targyak.add(targyUj);
        System.out.println("Palya osztaly UjTargy(Targy targyUj, int targyPozX, int targyPozY) fuggvenye meghivodott");
    }
 
     //Attributumkent atadott Szereplo objektum szereplok tarba helyezese
    public void UjSzereplo(Szereplo szereploUj){
       
        System.out.println("Palya UjSzereplo(Szereplo szereploUj, int kezdoPozX, int kezdoPozY) fuggvenye meghivodott");
        szereplok.add(szereploUj);
   
    }
   
    //Attributumkent atadott Targy objektum targyak tarbol torlese
    public void TorolTargy(Targy targyTorlendo){
       
        System.out.println("Palya TorolTargy(Targy targyTorlendo) fuggvenye meghivodott");
        szereplok.remove(targyTorlendo);
 
    }
   
    //Attributumkent atadott Szereplo objektum szereplok tarbol torlese
    public void TorolSzereplo(Szereplo szerTorlendo){
        System.out.println("Palya TorolSzereplo() fuggvenye meghivodott");
        szereplok.remove(szerTorlendo);
       
    }
   
    //Attributumkent atadott Mezo objektum mezok tarbol torlese
    private void TorolMezo(Mezo mezoTorlendo){
        System.out.println("Palya TorolMezok() fuggvenye meghivodott");
        mezok.remove(mezoTorlendo);
    }
   
    //Palya osszes listajanak elemeinek torlese, amikor a jatek veget er stb.
    public void MegszunikPalya(){
        System.out.println("Palya MegszunikPalya() fuggvenye meghivodott");
       
        //beallitjuk a tarunk meretet egy valtozoba
        int j=mezok.size();
       
        //vegigiteralunk a taron, es a TorolMezo segitsegevel toroljuk az aktualis elemet onnan.
        while(j>0){
            TorolMezo(mezok.get(mezok.size()-1));
            j--;
        }
       
        //beallitjuk a tarunk meretet egy valtozoba
        j=targyak.size();
 
        //vegigiteralunk a taron, es a TorolTargy segitsegevel toroljuk az aktualis elemet onnan.
        while(j>0){
            TorolTargy(targyak.get(targyak.size()-1));
            j--;
        }
       
        //beallitjuk a tarunk meretet egy valtozoba
        j=szereplok.size();
 
        //vegigiteralunk a taron, es a TorolSzereplo segitsegevel toroljuk az aktualis elemet onnan.
        while(j>0){
            TorolSzereplo(szereplok.get(szereplok.size()-1));
            j--;
        }
    }
}