package StarGateGame;

public abstract class Szereplo {
	public Szereplo(){
		System.out.println("Szereplo konstruktora meghivodott");
	}
	
	private int x; //a szerepl� poz�ci�j�nak x koordin�t�j�t hivatott mutatni
	private int y; //a szerepl� poz�ci�j�nak y koordin�t�j�t hivatott mutatni
	public abstract void Lep(int irany, Palya p); //ez majd az adott szerepl�kn�l m�shogy �s m�shogy lesz implement�lva
	public abstract void Meghal(Palya p);  //ez majd az adott szerepl�kn�l m�shogy �s m�shogy lesz implement�lva
	 

	public int[] GetPoz() {  //a pozici�it adja vissza adott szereplonek 
		// TODO - TMezoPozicio a visszateresi ertek
		System.out.println("Szereplo GetPoz() fuggvenye meghivodott");
	int[] coords={x,y};
		// TODO - implement Szereplo.GetPoz
		return coords;
	}

	public void SetPoz(int num_mezo_x, int num_mezo_y) { //a poz�ci�j�t allitja be adott szereplonek
		// TODO - implement Szereplo.SetPoz
		x=num_mezo_x;
		y=num_mezo_y;
		System.out.println("Szereplo SetPoz(int num_mezo_x, int num_mezo_y) fuggvenye meghivodott");
	}
}