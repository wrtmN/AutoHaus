//Datenblatt: http://www.suv-cars.de/images/technische-datenblaetter/vw_tiguan/de_Tiguan_18_1.4_TSI_BMT,_Ottomotor_110_kW_6-Gang-Schaltgetriebe.pdf
public class SUV {

										//Punkte siehe Zettel
	private String marke;				//1
	private String modell;				//2
	private String turen;				//3
	private String zylinder;			//3.1
	private String leistung;			//4
	private String kraftstoffart;		//5
	private String kombkraftstoffv;		//5.1
	private String gange;				//6
	private String gewicht;				//7
	private String bodenfreiheit;		//8
	private String zuglast;				//9
	
	SUV	(String marke, String modell, String turen, String zylinder, String leistung, String kraftstoffart,
			String kombkraftstoffv, String gange, String gewicht,String bodenfreiheit, String zuglast ){
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
		this.zuglast = zuglast;
		}
	
	public void ausgebenmarke(){
		System.out.println("Mark: " + this.marke);
	}
	
	public void ausgebenmodell(){
		System.out.println("Modell: " + this.modell);
	}
	
	public void ausgebenturen(){
		System.out.println("Türen: " + this.turen);
	}
	
	public void ausgebenzylinder(){
		System.out.println("Zylinderanzahl: " + this.zylinder);
	}
	
	public void ausgebenleistung(){
		System.out.println("Leistung: " + this.leistung);
	}
	
	public void ausgebenkraftstoffart(){
		System.out.println("Kraftstoff: " + this.kraftstoffart);
	}
	
	public void ausgebenkombkraftstoffv(){
		System.out.println("Kombinierter Verbrauch: " + this.kombkraftstoffv);
	}
	
	public void ausgebengange(){
		System.out.println("Gänge: " + this.gange);
	}
	
	public void ausgebengewicht(){
		System.out.println("Gewicht: " + this.gewicht);
	}
	
	public void ausgebenbodenfreiheit(){
		System.out.println("Bodenfreiheit: " + this.bodenfreiheit);
	}
	
	public void ausgebenzuglast(){
		System.out.println("Zuglast: " + this.zuglast);
	}
	
	public String gibmarke(){
		return this.modell;
	}
	
}