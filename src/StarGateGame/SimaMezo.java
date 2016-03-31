package StarGateGame;

public class SimaMezo extends Mezo{
	private boolean dobozflag = false;  //Hogy van-e a mezon doboz, vagy nincs
	
	public SimaMezo(boolean dobozflag){ //Mezo konstruktora, parameterkent megkapja hogy van-e rajta doboz.
		System.out.println("SimaMezo konstruktora meghivodott");
		this.dobozflag = dobozflag;   //Beallitja a dobozflaget
	}
	
	public void Ralep(Szereplo sz, Palya p) {    //A mezo ralep fuggvenye
		// TODO - implement SimaMezo.Ralep

		System.out.println("SimaMezo Ralep(Szereplo sz) fuggvenye meghivodott");
		
		int [] coord = this.GetPoz();   //Egy ideiglenes tombben eltaroljuk a mezo koordinatait.
		sz.SetPoz(coord[0],coord[1]);   //A parameterkent kapott ezredesnek meghivja a SetPoz() fv-et, es beallitja benne a mezo koordinatait.
	}

	public void Rarak(Targy t) { //A mezo rarak fuggvenye
		// TODO - implement SimaMezo.Rarak

	}

	public void Ralo(Lovedek l, Palya p) {  //A mezo ralo fuggvenye
		// TODO - implement SimaMezo.Ralo

		System.out.println("SimaMezo Ralo(Lovedek l, Palya p)  fuggvenye meghivodott");
		
		int [] coord = this.GetPoz();     //Ideiglenes tombben elmentjuk a koordinatait a mezonek
		l.SetPoz(coord[0],coord[1]);      //Beallitja a lovedek koordinatait az elobb elmentett ideiglenes tomb alapjan
		
		l.Mozog(1, p);       //Meghivja a lovedek Mozog fuggvenyet
	}

	public void SetDobozFlag(Ezredes e, Doboz d, Palya p) {
		// TODO - implement SimaMezo.SetDobozFlag

		System.out.println("SimaMezo SetDobozFlag(Ezredes e, Doboz d) fuggvenye meghivodott");
		if(dobozflag){              //Ha az adott mezon a dobozflag be van allitva,
			dobozflag = false;		 //Akkor azt false-ra allitja, es meghivja
			e.FelveszDoboz(d, p);	 //Az ezredes FelveszDoboz() metodusat.
		}
		else{ 						//Maskulonben,
			dobozflag = true;         //Beallitja a mezo dobozflaget true-ra,
			e.LerakDoboz(d, p);			 //Es meghivja az ezredes LerakDoboz() metodusat
		}
	}

	public void SetZPMFlag() {     //A mezo ZPMFlagjet beallito fuggveny
		// TODO - implement SimaMezo.SetZPMFlag

	}
}