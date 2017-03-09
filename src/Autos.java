
public class Autos {
	
	private int baujahr;
	private String kfzbezeichnung;
	private String kfzname;
	
	Autos (String kfzname, String kfzbezeichnung, int baujahr){
		this.baujahr = baujahr;
		this.kfzbezeichnung = kfzbezeichnung;
		this.kfzname = kfzname;
		}
	
	public void ausgebenkfzbezeichnung(){
		System.out.println("Kfz Bezeichnung: " + this.kfzbezeichnung);
	}
	
	public void ausgebenbaujahr(){
		System.out.println("Baujahr: " + this.baujahr);
	}
	
	public String gibkfzname(){
		return this.kfzname;
		}
	
}