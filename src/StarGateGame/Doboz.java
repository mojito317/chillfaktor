package StarGateGame;

public class Doboz extends Targy{
	public Doboz(){   //A doboz konstruktora
		System.out.println("Doboz konstruktora meghivodott");
	}
	
	public void Megsemmisul(Palya p) {   //A doboz megsemmisul fuggvenye, kitorli az adott dobozt.
		// TODO - implement Doboz.Megsemmisul
		System.out.println("Megsemmisul(Palya p) fuggvenye meghivodott");
		
		p.TorolTargy(this);
		
	}

	public void Felvettek(Ezredes e, Palya p) {   // A doboz felvettek fuggvenye.
		// TODO - implement Doboz.Felvettek
		
		System.out.println("Doboz Felvettek(Ezredes e, Palya p) fuggvenye meghivodott");
		
		int[] actual=this.GetPoz();   //beallítja hogy az adott mezoben, ahonnan a dobozt elvettuk
		Mezo temp= p.GetMezo(actual);  //hogy ott nincs mar tobbe doboz.
		
		temp.SetDobozFlag(e, this, p);
	}

	public void Leraktak(Ezredes e, Palya p, int irany) {
		// TODO - implement Doboz.Leraktak

		System.out.println("Doboz Leraktak(Ezredes e, Palya p) fuggvenye meghivodott");
		
		int[] actual=e.GetPoz();
			
		if(irany == 1){    //iranytol fuggoen, lerakja a dobozt az ezredestol jobbra, vagy balra
			actual[0]++;				
		}
		else if (irany == 2){	
			actual[0]--;
		}
			
		Mezo temp= p.GetMezo(actual);    //beallitja az adott mezon, hogy kerult-e ra doboz.
	
		temp.SetDobozFlag(e, this, p);	
	}
}