package StarGateGame;

public class Ajto extends Fal {
	boolean nyitva = false;
	
	public Ajto(){ //Ajto konstruktor fuggvenye
		System.out.println("Ajto konstruktora meghivodott");
	}

	public void Nyilik() { //Ez a fuggvény atallitja az ajto nyitva flagjet ha meghivodik igazra, ezaltal az ajto kinyilik
		System.out.println("Ajto Nyilik() fuggvenye meghivodott");
		nyitva = true;
	}

	public void Zarul() { //Az elozo fuggveny ellenkezojet vegzi, az ajto nyitva flagjet hamisra allitja, ezaltal az ajto becsukodik
		System.out.println("Ajto Zarul() fuggvenye meghivodott");
		nyitva = false;
	}

	public void Ralep(Szereplo sz, Palya p) {   //A palya ralep fuggvenye
		System.out.println("Ajto Ralep(Szereplo sz) fuggvenye meghivodott");
		
		if (nyitva == true){  //Ha az ajto nyitva van, akkor meghivja a ralepo szereplo SetPoz() fuggvenyet,
			int [] coord = this.GetPoz();
			sz.SetPoz(coord[0],coord[1]);
		}
		else{  // Ha az ajto zarva van, akkor nem hivodik meg a szereplo SetPoz() fuggvenye, csak vissza ad egy szoveget, hogy az ajto zarva van.
			System.out.println("Az ajtó zárva van, marad a szereplõ a helyén.");
		}
			
		// TODO - implement Ajto.Ralep
	}

	public void Rarak(Targy t) { //Az ajto rarak fuggvenye. Ha az ajto zarva van, ugy fog viselkedni mint egy fal, ha nyitva akkor ugy mint egy simamezo.
		// TODO - implement Ajto.Rarak
		throw new UnsupportedOperationException();
	}

	public void Ralo(Lovedek l, Palya p) {   //Az ajto Ralo fuggvenye.
		// TODO - implement Ajto.Ralo
		// throw new UnsupportedOperationException();
		System.out.println("Ajto Ralo(Lovedek l, Palya p) fuggvenye meghivodott");
		
		if(nyitva){    //Amennyiben az ajto nyitva van, a lovedek koordinatajat atallitja az ajto koordinatajara,
			int [] coord = this.GetPoz();   //majd meghivja a lovedek Mozog() fuggvenyet, amely a lovedek tovabblepteteseert felel.
			l.SetPoz(coord[0],coord[1]);
			l.Mozog(1, p);
		}else{
			System.out.println("ajto zarva volt dirrdurrcsittcsatt");   //Az ajto zarva van, a lovedek neki utkozik, itt az eletenek a vege.
		}
	}

}