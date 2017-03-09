//Datenblatt: http://www.mercedes-benz.de/content/germany/mpc/mpc_germany_website/de/home_mpc/passengercars/home/new_cars/models/e-class/_a207/facts_/technicaldata/models.html
public class Cabrio {

										//Punkte siehe Zettel
	private String marke;				//1
	private String modell;				//2
	private String turen;				//3
	private String zylinder;			//4
	private String leistung;			//5
	private String kraftstoffart;		//6
	private String kombkraftstoffv;		//7
	private String gange;				//8
	private String gewicht;				//9
	private String bodenfreiheit;		//10
	private String kofferraumv;			//11
	
	Cabrio	(String marke, String modell, String turen, String zylinder, String leistung, String kraftstoffart,
			String kombkraftstoffv, String gange, String gewicht, String bodenfreiheit, String kofferraumv ){
		this.marke = marke;
		this.modell = modell;
		this.turen = turen;
		this.zylinder = zylinder;
		this.leistung = leistung;
		this.kraftstoffart = kraftstoffart;
		this.kombkraftstoffv = kombkraftstoffv;
		this.gange = gange;
		this.gewicht = gewicht;
		this.bodenfreiheit = bodenfreiheit;
		this.kofferraumv = kofferraumv;
		}
	
	public void ausgebenmarke(){
		System.out.println("Marke: " + this.marke);
	}
	
	public void ausgebenmodell(){
		System.out.println("Modell: " + this.modell);
	}

	public void ausgebenturen(){
		System.out.println("Türen: " + this.turen);
	}
	
	public void ausgebenzylinder(){
		System.out.println("Zylinder: " + this.zylinder);
	}
	
	public void ausgebenleistung(){
		System.out.println("Leistung: " + this.leistung);
	}
	
	public void ausgebenkraftstofart(){
		System.out.println("Kraftstoff: " + this.kraftstoffart);
	}
	
	public void ausgebenkombkraftstoffv(){
		System.out.println("Kombinierter Verbrauch: " + this.kombkraftstoffv);
	}
	
	public void ausgebengange(){
		System.out.println("Gänge: " + this.gange);
	}
	
	public void ausgebengewicht(){
		System.out.println("Gewicht: " +this.gewicht);
	}
	
	public void ausgebenbodenfreiheit(){
		System.out.println("Bodenfreiheit: " + this.bodenfreiheit);
	}
	
	public void ausgebenkoferraumv(){
		System.out.println("Kofferraumvolumen: " + this.kofferraumv);
	}
	
	public String gibmarke(){
		return this.modell;
	}
	
}