
public class Interessent implements Ausgeben {

	private String name;
	private String adresse;
	
	Interessent (String name, String adresse){
		this.name = name;
		this.adresse = adresse;
	}
		
	public void ausgebenName(){
		System.out.println("Name: " + this.name);
	}
	
	public void ausgebenAdresse(){
		System.out.println("Adresse: " + this.adresse);
	}

	@Override
	public void ausgebenNamen() {
		// TODO Auto-generated method stub
		
	}

	public String gibName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}