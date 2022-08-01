package ObjectOrientedProgramming;

public class GoingPlaces {
	
	private String name;
	private String capital;

	public static void main(String[] args) {
		
	    GoingPlaces country = new GoingPlaces();
	    country.name = "France";
	    country.capital = "Paris";
	    System.out.println("Country:  " + country.name);
	    System.out.println("Capital:  " + country.capital);
}
	
	public class Country{
    
    public String name;
    public String capital;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return this.capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [name=" + this.name + ", capital=" + this.capital + "]";
	}
    
    
}
}

