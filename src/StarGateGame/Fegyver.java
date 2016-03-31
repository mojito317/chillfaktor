package StarGateGame;

public class Fegyver {
	 
	public void Lo(Palya p, Ezredes e, int lovesirany) { //A fegyver lo fuggvenye.
		// TODO - implement Fegyver.Lo
		Lovedek l=new Lovedek();  //Letrehozza az uj lövedeket
		System.out.println("Fegyver Lo(Lovedek l, Palya p, Ezredes e) fuggvenye meghivodott");
		int[] xy= e.GetPoz();   //Elmenteni egy ideiglenes tombbe a jelenlegi poziciot
		l.SetPoz(xy[0], xy[1]); //Beallitja a lovedeknek a kezdopoziciojat
		l.Mozog(lovesirany, p); //Meghivja a lovedek Mozog() fuggvenyet, hogy meginduljon a lovedek 
	}

}