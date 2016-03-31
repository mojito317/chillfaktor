package StarGateGame;

import java.io.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Engine {

	private static Palya p01;
		// TODO - implement Engine
	
	public static void UjJatekIndit(){
		System.out.println("Engine osztaly 'void UjJatekIndit()' fuggvenye meghivodott");
		InditJatek();  //Elinditjuk a jatekot, létrehozzuk a megfelelõ számú és fajtájú szereplõket, mezõket, tárgyakat, stb
	}
	public static void InditJatek(){
		System.out.println("Engine osztaly 'void InditJatek()' fuggvenye meghivodott");
		//2db SimaMezo letrehozasa + 1 db Doboz letrehozasa + 1 db Ezredes letrehozasa + a poziciojukat beallitjuk a SetPozokkal
		p01 = new Palya();
		Mezo sm01=new SimaMezo(false);
		Mezo sm02=new SimaMezo(true);
		Targy d01=new Doboz();
		Szereplo e01=new Ezredes();
		
		p01.UjMezo(sm01); sm01.SetPoz(0, 0);
		p01.UjMezo(sm02); sm02.SetPoz(1, 0);
		p01.UjTargy(d01); d01.SetPoz(1, 0);
		p01.UjSzereplo(e01); e01.SetPoz(0, 0);
	}
	public static void Kilep(){
		System.out.println("Engine osztaly 'void Kilep()' fuggvenye meghivodott");
		p01.MegszunikPalya();
		//Ha kilepunk a jatekbok megszuntetjuk a palyat es a benne levo dolgokat(pl. mezoket), az ehhez szukseges torlofuggvenyeket meghivjuk
	}
	public static void KezdoKepernyo(){
		
		//A tesztesetek menuje, itt valaszthat a felhasznalo a megfelelo menupontok kozul, hogy miket akar teszteni, kiprobalni
		System.out.println("0. teszteset: A jatek inditasa, a palya betoltese, jatek bezarasa, jatek ujrainditasa");
		System.out.println("1. teszteset: Ezredes lep a palyan, majd beleesik egy szakadekba");
		System.out.println("2. teszteset: Ezredes lep a palyan, majd falba utkozik");
		System.out.println("3. teszteset: Doboz mozgatasa");
		System.out.println("4. teszteset: Ezredes felveszi a ZPMet, majd nyer");
		System.out.println("5. teszteset: Ezredes kinyitja a portalt es sikeresen atkel rajta");
		System.out.println("6. teszteset: Az Ezredes a doboz merlegre helyezesevel kinyitja az ajtot");
		System.out.println("7. teszteset: Az Ezredes kinyitja az ajtot, ugy hogy raall a merlegre, majd utkozik a bezarult ajtoval");
		System.out.println("8. teszteset: Az Ezredes ralo egy zart ajtora, majd ralep egy merlegre, ezt kovetoen pedig a nyitott ajtora fog loni portalt");
		System.out.println("Kerem a teszteset szamat 0-8:(Rossz szam eseten vege a tesztelesnek) \n \n");
		
	}
	
	public static void main(String [ ] args) throws IOException
	{
		//Meghivjuk a tesztesetek menujet
		KezdoKepernyo();
		
		//a felhasznalotol varunk egy billentyulenyomast 
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String teszteset = br.readLine();
		
		//Ha a felhasznalo a megfelelo gombot nyomta le, akkor a program odaugrik a megfelelo tesztesethez
		while (true){
			switch(teszteset){
			case "0":
				//Itt a jatekinditast, -bezarast es -ujrainditast teszteljuk
				System.out.println("Engine main(String [] args) fuggvenye meghivodott");
				System.out.println("0. teszteset\n");
				
				System.out.println("\n Elinditja a jatekot? i/n");
				while(!br.readLine().equals("i")){ //amig a usertol kapott sor nem "i"
					System.out.println("\n Elinditja a jatekot? i/n"); //folyamatosan kerdezem ugyanazt a kerdest
				}
				//ha 'i' a valasz, letrehozunk egy palyat, azon egy ezredest, 2 db simamezot es 1 db dobozt
				//poziciojukat is beallitva (nyilvan ez nem manualisan fog a kesobbiekben tortenni, hanem egy fajlbol, de
				//mivel a tesztpalyaink igen kicsik, ezt kezzel is be lehet allitani)
				
				
				UjJatekIndit(); // meghivjuk az UjJatekIndit() fuggveny
				
				System.out.println("\n Bezarja a jatekot? i/n");
				while(!br.readLine().equals("i")) {//amig a usertol kapott sor nem "i"
					System.out.println("\n Bezarja a jatekot? i/n");//folyamatosan kerdezem ugyanazt a kerdest
				}
				Kilep(); //meghivjuk a Kilep() fuggvenyt 
				
				System.out.println("\n ujrainditja a jatekot? i/n");
				while(!br.readLine().equals("i")){ //amig a usertol kapott sor nem "i"
					System.out.println("\n ujrainditja a jatekot? i/n"); //folyamatosan kerdezem ugyanazt a kerdest
				}
				UjJatekIndit(); //meghivjuk az UjJatekIndit() fuggvenyt
				
				break;
			case "1":
				System.out.println("Engine main(String [] args) fuggvenye meghivodott");
				System.out.println("1. teszteset");
				//Letrehozzuk a Palyat 2 Mezovel es 1 szakadekkal, majd ezeknek megadjuk a kezdopoziciojukat
				Palya p = new Palya();
				Mezo sm=new SimaMezo(false);
				Mezo sm2=new SimaMezo(false);
				Szakadek sz=new Szakadek();
				
				p.UjMezo(sm);	sm.SetPoz(0, 0);
				p.UjMezo(sm2);	sm2.SetPoz(1, 0);
				p.UjMezo(sz);	sz.SetPoz(2, 0);
				
				//Letrehozunk egy Ezredest is, akinek szinten beallitjuk a kezdopoziciojat
				Szereplo e= new Ezredes();
				
				p.UjSzereplo(e); e.SetPoz(0, 0);
				
				System.out.println("\n Lepjen az Ezredes jobbra, egy ures mezore? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lepjen az Ezredes jobbra, egy ures mezore? i/n");
				}
				e.Lep(1, p); //Lepunk az Ezredessel jobbra 
				
				System.out.println("\n Lepjen az Ezredes jobbra, egy szakadekba? (Ha belelep, az Ezredes meghal) i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lepjen az Ezredes jobbra, egy szakadekba? (Ha belelep, az Ezredes meghal) i/n");
				}
				e.Lep(1, p); //Megint jobbra lepunk az ezredessel
				
				break;
			case "2":
				System.out.println("2. teszteset");
				
				//Letrehozunk 1 Ezredest, a palyat, 2 SimaMezot, 1 Falat
				//Ezt kovetoen beallitjuk az Ezredesnek, a SimaMezoknek es a Falnak a kezdopoziciojat
				Szereplo ezredes2 = new Ezredes();
				Palya p2 = new Palya();
				Mezo simamezo21 = new SimaMezo(false);
				Mezo simamezo22 = new SimaMezo(false);
				Mezo fal1 = new Fal();
				p2.UjMezo(simamezo21); simamezo21.SetPoz(0, 0);
				p2.UjMezo(simamezo22); simamezo22.SetPoz(1, 0);
				p2.UjMezo(fal1);	fal1.SetPoz(2, 0);
				p2.UjSzereplo(ezredes2); ezredes2.SetPoz(0, 0);
				
				System.out.println("\n Lepjen az Ezredes jobbra, egy ures mezore? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lepjen az Ezredes jobbra, egy ures mezore? i/n");
				}
				ezredes2.Lep(1, p2); //Lepunk az Ezredessel
				
				System.out.println("\n Lépjen az ezredes jobbra, hogy nekiütközzün egy falnak? i/n?");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lépjen az ezredes jobbra, hogy nekiütközzün egy falnak? i/n?");
				}
				ezredes2.Lep(1, p2); //Lepunk az Ezredessel
				
				break;
			case "3":
				System.out.println("3.teszteset");
				
				////Letrehozunk 1 Ezredest, a palyat, 3 SimaMezot, 1 Szakadekot es 1 Dobozt
				//Ezt kovetoen beallitjuk az Ezredesnek, a SimaMezoknek a Szakadeknak es a Doboznak a kezdopoziciojat
				Ezredes ezredes3 = new Ezredes();
				Palya p3 = new Palya();
				SimaMezo simamezo31 = new SimaMezo(false);
				SimaMezo simamezo32 = new SimaMezo(true);
				SimaMezo simamezo33 = new SimaMezo(false);
				Szakadek szakadek3 = new Szakadek();
				Doboz doboz3 = new Doboz();
				
				p3.UjMezo(simamezo31); simamezo31.SetPoz(0, 0);
				p3.UjMezo(simamezo32); simamezo32.SetPoz(1, 0);
				p3.UjMezo(simamezo33); simamezo33.SetPoz(2, 0);
				p3.UjMezo(szakadek3); szakadek3.SetPoz(3,0);
				p3.UjTargy(doboz3); doboz3.SetPoz(1, 0);
				p3.UjSzereplo(ezredes3);
				
				System.out.println("\nFelvegye az ezredes a dobozt? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\nFelvegye az ezredes a dobozt? i/n");
				}
				ezredes3.Lep(1, p3); //Lepunk az Ezredessel + majd ralepunk a dobozra es mivel van helyunk, felvesszuk a dobozt
				
				System.out.println("\n Lepjen az ezredes jobbra? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lepjen az ezredes jobbra? i/n");
				}
				ezredes3.Lep(1, p3); //Megint lepunk az Ezredessel
				System.out.println("\nBelerakja az ezredes a dobozt a szakadekba? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\nBelerakja az ezredes a dobozt a szakadekba? i/n");
				}
				
				ezredes3.Lerak(p3); //Lerakjuk az elobb felvett dobozt (majd ez a doboz meg is fog semmisulni , mert szakadekba tettuk)
				
				break;
			case "4":
				System.out.println("4. teszteset");
				//Letrehozzuk a dolgokat, majd beallitjuk a kezdopoziciojukat
				Szereplo e2=new Ezredes();
				Palya p4 = new Palya();
				Mezo sm3= new SimaMezo(false);
				Mezo sm4= new SimaMezo(false);
				Targy zpm = new ZPM();
				
				p4.UjMezo(sm3);		sm3.SetPoz(0, 0);
				p4.UjMezo(sm4);		sm4.SetPoz(1, 0);
				p4.UjTargy(zpm);	zpm.SetPoz(1, 0);
				p4.UjSzereplo(e2);	e2.SetPoz(0, 0);
				
				System.out.println("\n Felvegye az Ezredes az elõtte lévõ ZPM-et? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Felvegye az Ezredes az elõtte lévõ ZPM-et? i/n");
				}
				e2.Lep(1, p4); //Lepunk az Ezredessel (es majd felveszi a ZPM-et mert erzekeli, hogy ott van egy ZPM)
				
				break;
				
			case "5":
				System.out.println("Engine main(String [] args) fuggvenye meghivodott");
				System.out.println("5. teszteset");
				//Letrehozzuk a dolgokat, majd beallitjuk a kezdopoziciojukat
				Palya p05 = new Palya();
				SpecFal spf1=new SpecFal();
				SimaMezo sm51= new SimaMezo(false);
				SpecFal spf2=new SpecFal();
				Fegyver f5=new Fegyver();
				Ezredes e5=new Ezredes();
				p05.UjMezo(spf1);		spf1.SetPoz(0, 0);
				p05.UjMezo(sm51);		sm51.SetPoz(1, 0);
				p05.UjMezo(spf2);		spf2.SetPoz(2, 0);
				p05.UjSzereplo(e5);		e5.SetPoz(1, 0);
				
			
				System.out.println("\n Lepjen az Ezredes balra? i/n");
				while(!br.readLine().equals("i")){ //amig a usertol kapott sor nem "i"
					System.out.println("\n Lepjen az Ezredes balra? i/n"); //folyamatosan kerdezem ugyanazt a kerdest
				}
				
				e5.Lep(2, p05); //Lepunk balra az Ezredessel
				
				System.out.println("\n Lojon az ezredes egy sarga portalt? i/n");
				while(!br.readLine().equals("i")) {//amig a usertol kapott sor nem "i"
					System.out.println("\n Lojon az ezredes egy sarga portalt? i/n");//folyamatosan kerdezem ugyanazt a kerdest	
				}
				e5.Lo(2, p05); //Lovunk az Ezredessel
				
				System.out.println("\n Probaljon meg atkelni a portalon az Ezredes? i/n");
				while(!br.readLine().equals("i")){ //amig a usertol kapott sor nem "i"
					System.out.println("\n Probaljon meg atkelni a portalon az Ezredes? i/n"); //folyamatosan kerdezem ugyanazt a kerdest
				}
				e5.Lep(2, p05); //Lepunk az Ezredessel
				
				System.out.println("\n Lepjen az Ezredes jobbra? i/n");
				while(!br.readLine().equals("i")){ //amig a usertol kapott sor nem "i"
					System.out.println("\n Lepjen az Ezredes jobbra? i/n"); //folyamatosan kerdezem ugyanazt a kerdest
				}
				e5.Lep(1, p05); //Lepunk az Ezredessel
				
				System.out.println("\n Lojon az Ezredes jobbra egy kek portalt? i/n");
				while(!br.readLine().equals("i")){ //amig a usertol kapott sor nem "i"
					System.out.println("\n Lojon az Ezredes jobbra egy kek portalt? i/n"); //folyamatosan kerdezem ugyanazt a kerdest
				}
				e5.Lo(1, p05); //Lovunk az Ezredessel
				
				System.out.println("\n Probaljon meg atkelni a portalon az Ezredes? i/n");
				while(!br.readLine().equals("i")){ //amig a usertol kapott sor nem "i"
					System.out.println("\n Probaljon meg atkelni a portalon az Ezredes? i/n"); //folyamatosan kerdezem ugyanazt a kerdest
				}
				e5.Lep(1, p05); //Lepunk az Ezredessel
				e5.Lep(1, p05);//Lepunk az Ezredessel
				
				break;
			case "6":
				System.out.println("6. teszteset");
				//Letrehozzuk a dolgokat, majd beallitjuk a kezdopoziciojukat
				Ezredes e6 = new Ezredes();
				SimaMezo m61 = new SimaMezo(true);
				SimaMezo m62 = new SimaMezo(false);
				SimaMezo m63 = new SimaMezo(false);
				Ajto a6 = new Ajto();
				Doboz d6 = new Doboz();
				Merleg mer6 = new Merleg(a6, false);
				Palya p6 = new Palya();
				
				p6.UjMezo(mer6);	mer6.SetPoz(0, 0);
				p6.UjMezo(m61);	m61.SetPoz(1, 0);
				p6.UjMezo(m62);	m62.SetPoz(2, 0);
				p6.UjMezo(a6);	a6.SetPoz(3, 0);
				p6.UjMezo(m63);	m63.SetPoz(4, 0);
				p6.UjTargy(d6);	d6.SetPoz(1, 0);
				p6.UjSzereplo(e6);	e6.SetPoz(2, 0);
				
				System.out.println("\n Felvegye az Ezredes az elõtte levõ dobozt? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Felvegye az Ezredes az elõtte levõ dobozt? i/n");
				}
				e6.Lep(2, p6); //Lepunk az Ezredessel
				
				System.out.println("\nLerakja az Ezredes a dobozt maga elé, a mérlegre? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\nLerakja az Ezredes a dobozt maga elé, a mérlegre? i/n");
				}
				e6.Lerak(p6); //Lerakja az Ezredes a dobozat
				
				System.out.println("\n Lépjen az Ezredes háromszor jobbra? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lépjen az Ezredes háromszor jobbra? i/n");
				}
				e6.Lep(1, p6); //Lepunk az Ezredessel
				e6.Lep(1, p6); //Lepunk az Ezredessel
				e6.Lep(1, p6); //Lepunk az Ezredessel
				break;
			case "7":
				System.out.println("7. teszteset");
				//Letrehozzuk a dolgokat, majd beallitjuk a kezdopoziciojukat		
				SimaMezo m7 = new SimaMezo(false);
				Ajto a7 = new Ajto();
				Ezredes e7 = new Ezredes();
				Palya p7 = new Palya();
				Merleg mer7 = new Merleg(a7, false);
				
				p7.UjMezo(mer7);	mer7.SetPoz(0, 0);
				p7.UjMezo(m7);	m7.SetPoz(1, 0);
				p7.UjMezo(a7);	a7.SetPoz(2, 0);
				p7.UjSzereplo(e7);	e7.SetPoz(1, 0);
				
				System.out.println("\n Lépjen rá az Ezredes az elõtte levõ mérlegre? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lépjen rá az Ezredes az elõtte levõ mérlegre? i/n");
				}
				e7.Lep(2, p7); //Lepunk az Ezredessel
				
				System.out.println("\n Lépjen kétszer jobbra az Ezredes? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lépjen kétszer jobbra az Ezredes? i/n");
				}
				e7.Lep(1, p7); //Lepunk az Ezredessel
				e7.Lep(1, p7); //Lepunk az Ezredessel
				break;
			case "8":
				System.out.println("8. teszteset");
				//Letrehozzuk a dolgokat, majd beallitjuk a kezdopoziciojukat
				Palya p8 = new Palya();
				Ezredes e8=new Ezredes();
				Mezo s12 = new SimaMezo(false);
				Mezo s8= new SimaMezo(false);
				Ajto s10 = new Ajto();
				Mezo s9 = new Merleg(s10, false);
				Mezo s11=new Fal();
				
				p8.UjMezo(s8);		s8.SetPoz(0, 0);
				p8.UjMezo(s12);		s12.SetPoz(1, 0);
				p8.UjMezo(s9);		s9.SetPoz(2, 0);
				p8.UjMezo(s10);		s10.SetPoz(3, 0);
				p8.UjMezo(s11);		s11.SetPoz(4, 0);
				
				p8.UjSzereplo(e8);	e8.SetPoz(0, 0);
				
				System.out.println("\n Lépjen az Ezredes jobbra, egy üres mezõre? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lépjen az Ezredes jobbra, egy üres mezõre? i/n");
				}
				e8.Lep(1, p8); //Lepunk az Ezredessel
				
				System.out.println("\nLõjön az Ezredes a zárt ajtóra? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\nLõjön az Ezredes a zárt ajtóra? i/n");
				}
				e8.Lo(1,p8); //Lovunk az Ezredessel (majd zart ajtora es megakad a lovedek)
				
				System.out.println("\n Lépjen az Ezredes jobbra, egy mérlegre? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lépjen az Ezredes jobbra, egy mérlegre? i/n");
				} 
				e8.Lep(1,p8); //Lepunk az Ezredessel
				
				System.out.println("\n Lõjön az Ezredes a nyitott ajtóra? i/n");
				while(!br.readLine().equals("i")) {
					System.out.println("\n Lõjön az Ezredes a nyitott ajtóra? i/n");
				}
				e8.Lo(1,p8); //Lovunk az Ezredessel (most majd nyitott ajtora es atmegy a lovedek)
			}	
			KezdoKepernyo(); //ujrakezdjuk a tesztmenut
			teszteset = br.readLine(); //bekerjuk ujra, hogy milyen tesztet akarunk futtatni
		}		
	}
	
	/*private class Key implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			int key=e.getKeyCode();
			if(key==KeyEvent.VK_RIGHT){
				
			}
		}

		@Override
		! Ezek nem kellenek, implement·lni kell
		public void keyReleased(KeyEvent arg0) {
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
		}
		
	}*/  // Ezek egyelore nem kellenek, majd esetleg kesobb
	
}