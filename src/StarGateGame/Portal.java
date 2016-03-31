package StarGateGame;

public class Portal extends SpecFal{
	static int portalSzam;   //A nyitva levo portalok szamat tartja szamon
	static Mezo sargaPortal, kekPortal;
	
	public void Letrejon() {   //A portal letrejoveseert felelos metodus
		// TODO - implement Portal.Letrejon
		portalSzam++;    //Megnoveli a nyitva levo portalok szamat
	}

	public void Megszunik() {    //A portal bezarasaert felelos metodus
		// TODO - implement Portal.Megszunik
		portalSzam--;    //Csokkenti a nyitva levo portalok szamat.
	}
}