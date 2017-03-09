
public class main {	
	
	
	private static final String String = null;

	public static void main(String[] args) {
		
		System.out.println("");
		
	//Kunde:
		System.out.println("Kunde: ");
		Kunde neukunde = new Kunde (1234, "Mark Harwardt",
				"Ruhrblick, 58239 Schwerte");
		neukunde.ausgebenKundennummer();
		String kundenname = neukunde.gibName();
		System.out.println("Name: " + kundenname); 
		neukunde.ausgebenadresse();
		
			System.out.println("");
			System.out.println("----------------------------------------");
			System.out.println("");
		
	//PremiumKunde:
		System.out.println("Bonuspunkte:");
		PremiumKunde neuerKunde = new PremiumKunde(5555, "Harwardt", "Dortmund", 1000);
		neuerKunde.ausgabeBonuspunkte();
			
			System.out.println("");
			System.out.println("----------------------------------------");
			System.out.println("");
			
	//Autos:	
		System.out.println("Kunden Auto(s):");
		Autos neukfz = new Autos ("E500", "W124", 2008);
		neukfz.ausgebenkfzbezeichnung();
		String Autobezeichnung = neukfz.gibkfzname();
		System.out.println("Name: " + Autobezeichnung);
		neukfz.ausgebenbaujahr();
		
			System.out.println("");
			System.out.println("----------------------------------------");
			System.out.println("");
		
	//SUV: 
		System.out.println("SUV:");
		SUV neumarksuv = new SUV ("Volkswagen", "Tiguan 1.4 TSI BMT", "4", "4", "150PS", "Super 95", 
				"6,4l/100km", "6", "1.500kg", "20cm", "2000kg");
		neumarksuv.ausgebenmarke();
		String Modellsuv = neumarksuv.gibmarke();
		System.out.println("Modell: " + Modellsuv);
		neumarksuv.ausgebenturen();
		neumarksuv.ausgebenleistung();
		neumarksuv.ausgebenzylinder();
		neumarksuv.ausgebenkraftstoffart();
		neumarksuv.ausgebenkombkraftstoffv();
		neumarksuv.ausgebengange();
		neumarksuv.ausgebengewicht();
		neumarksuv.ausgebenbodenfreiheit();
		neumarksuv.ausgebenzuglast();
			
			System.out.println("");
			System.out.println("----------------------------------------");
			System.out.println("");
			
		//Cabrio:
		System.out.println("Cabrio:");
		Cabrio neumarkcabrio = new Cabrio ("Mercedes-Benz", "E500", "2", "V8", "400PS", "Super 95",
				"9,2l/100km", "7G-TRONIC PLUS", "1,945kg", "15cm", "320l");
		neumarkcabrio.ausgebenmarke();
		String Modellcabrio = neumarkcabrio.gibmarke();
		System.out.println("Modell: " + Modellcabrio);
		neumarkcabrio.ausgebenturen();
		neumarkcabrio.ausgebenleistung();
		neumarkcabrio.ausgebenzylinder();
		neumarkcabrio.ausgebenkraftstofart();
		neumarkcabrio.ausgebenkombkraftstoffv();
		neumarkcabrio.ausgebengange();
		neumarkcabrio.ausgebengewicht();
		neumarkcabrio.ausgebenbodenfreiheit();
		neumarkcabrio.ausgebenkoferraumv();
		
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
		
		//Interface in Java:
		//Interessent.java
		System.out.println("Interessent: ");
		Ausgeben person = new Interessent("Harwardt", "Essen");
		person.ausgebenNamen();
		person.ausgebenAdresse();
		Mitarbeiter mitarbeiter = new Mitarbeiter ("Lawrence", "Hollywood");
		person = mitarbeiter;
		person.ausgebenAdresse();
		person.ausgebenNamen();
		
		
		
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
		
		//Array Kunden:
		String[] stringArray = new String[6];
		stringArray[0] = "Peter";
		stringArray[1] = "Detlef";
		stringArray[2] = "Karl";
		stringArray[3] = "Heinz";
		stringArray[4] = "Werner";
		stringArray[5] = "Jürgen";
		
		int i = 0;
//		System.out.println("Array-While:");
//		System.out.println("");
		
//		while(i < stringArray.length){
//			System.out.println(stringArray[i]);
//			i++;
//		}	
		
		//Array
		String[] stringArray1 = new String[10];
		stringArray1[0] = "Peter";
		stringArray1[1] = "Detlef";
		stringArray1[2] = "Karl";
		stringArray1[3] = "Heinz";
		stringArray1[4] = "Werner";
		stringArray1[5] = "Jürgen";
		stringArray1[6] = "Dieter";
		stringArray1[7] = "Sebastian";
		stringArray1[8] = "Felix";
		stringArray1[9] = "Mannfred";
		
		int a = 0;
		System.out.println("Do-while:");
		System.out.println("");
		
		do{
			System.out.println(stringArray1[a]);
			a++;
		}while(a < stringArray1.length);
		


		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("");
	
	System.out.println("Kunden: ");
	Kunde kundenkomb = new Kunde ("", "Schmitz");
	kundenkomb.ausgebbenkunde1();
	
	
	
	
		
		
		
		} 
	
}
