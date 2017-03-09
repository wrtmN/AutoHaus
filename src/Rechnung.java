//Zeile 138 Classe "main"
//Keine Funktion!

public class Rechnung {
	
	
	public static int nummer = 0;
	private String name;
	private String adresse;
	private int summe;
	
	
	
	Rechnung(){
		Rechnung.nummer++;
	}
	
	
	
	public static int gibAktuelleNummer(){
		return Rechnung.nummer;
	}

	
	
}
