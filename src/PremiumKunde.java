
public class PremiumKunde extends Kunde {

	private int bonuspunkte;
	
	PremiumKunde (int kundennummer, String name, String adresse, int punkte){
		super (kundennummer, name, adresse);
		this.bonuspunkte = punkte;
	}
	
	public void ausgabeBonuspunkte(){
		System.out.println("Kunde " + this.gibName()
				+ " hat " +this.bonuspunkte + " Bonuspunkte");
	}

}
