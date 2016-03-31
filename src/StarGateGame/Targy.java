package StarGateGame;
 
public abstract class Targy {
    private int x;
    private int y;
    //a targy pozicioinak koordinatai
   
    public Targy(){
        System.out.println("Targy konstruktora meghivodott");
    }
    public abstract void Felvettek(Ezredes e, Palya p);//leszarmazott implemental
 
    public abstract void Leraktak(Ezredes e, Palya p, int i);//leszarmazott implemental
 
    public int[] GetPoz() {//le lehet vele kerdezni a targy pozicioit
        int[] temp={x,y};//tempbe berak x, y
        System.out.println("Targy Getpoz() fuggvenye meghivodott");
        return temp;//visszater az ertekukkel
       
    }
 
    public void SetPoz(int num_mezo_x, int num_mezo_y) {//be lehet allitani vele a targy pozicioit
        x=num_mezo_x;//x beallit
        y=num_mezo_y;//y beallit
        System.out.println("Targy SetPoz(int num_mezo_x, int num_mezo_y) fuggvenye meghivodott");
       
    }
}