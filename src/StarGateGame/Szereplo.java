package StarGateGame;

public abstract class Szereplo {
	public Szereplo(){
		System.out.println("Szereplo konstruktora meghivodott");
	}
	
	private int x; //a szereplõ pozíciójának x koordinátáját hivatott mutatni
	private int y; //a szereplõ pozíciójának y koordinátáját hivatott mutatni
	public abstract void Lep(int irany, Palya p); //ez majd az adott szereplõknél máshogy és máshogy lesz implementálva
	public abstract void Meghal(Palya p);  //ez majd az adott szereplõknél máshogy és máshogy lesz implementálva
	 

	public int[] GetPoz() {  //a pozicióit adja vissza adott szereplonek 
		// TODO - TMezoPozicio a visszateresi ertek
		System.out.println("Szereplo GetPoz() fuggvenye meghivodott");
	int[] coords={x,y};
		// TODO - implement Szereplo.GetPoz
		return coords;
	}

	public void SetPoz(int num_mezo_x, int num_mezo_y) { //a pozícióját allitja be adott szereplonek
		// TODO - implement Szereplo.SetPoz
		x=num_mezo_x;
		y=num_mezo_y;
		System.out.println("Szereplo SetPoz(int num_mezo_x, int num_mezo_y) fuggvenye meghivodott");
	}
}