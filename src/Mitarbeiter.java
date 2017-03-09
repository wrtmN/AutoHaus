
public class Mitarbeiter implements Ausgeben {
	
	private String name;
	private String adresse;
	
	Mitarbeiter (String name, String adresse){
		this.name = name;
		this.adresse = adresse;
	}
	
	public void ausgebenname(){
		System.out.println("Name: " + this.name);
	}
	
	public void ausgebenadresse(){
		System.out.println("Adresse: " + this.adresse);
	}
	
	public String gibname(){
		return this.name;
	}

	@Override
	public void ausgebenNamen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ausgebenAdresse() {
		// TODO Auto-generated method stub
		
	}
}
