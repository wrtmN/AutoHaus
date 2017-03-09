
// http://www.informatikzentrale.de/getter-setter-java.html
public class Kunde {
	
	private int kundennummer;
	private String name;
	private String adresse;
	
	private String kunde1;
	private String kunde2;

	
	Kunde (int kundennummer, String name, String adresse){
		this.kundennummer = kundennummer;
		this.name = name;
		this.adresse = adresse;
		}
	
	
	Kunde (String kunde1, String kunde2){
		this.kunde1 = "Werner";
		this.kunde2 = kunde2;
	}
	
	public void ausgebenKundennummer(){
		System.out.println("Kundennummer: " + this.kundennummer);
	}
	
	
	public void ausgebenadresse(){
		System.out.println("Adresse: " + this.adresse);
	}
	
	
	public void ausgebbenkunde1(){
		System.out.println(kunde1 + " " + this.kunde2);
	}
	
	
	public String gibKunde1(){
		return this.kunde1;
	}

	public String gibName(){
		return this.name;
		}
	
}