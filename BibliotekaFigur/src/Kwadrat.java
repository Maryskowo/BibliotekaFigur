
public class Kwadrat{

	
	double obwod;
	double pole;
	double bok;
	
	public Kwadrat( double bok ){
		
		pole = bok * bok;
		obwod = 4 * bok;
		this.bok = bok;
	}

	void licz( ){
		pole = bok * bok;
		obwod = 4 * bok;
	}
	
	@Override
	public String toString() {
		return "Kwadrat\nobwod= " + obwod + ",\npole= " + pole + ",\nbok= " + bok
				+ ",";
	}
	
	void setBok( double bok ){
		this.bok = bok;
	}
	
}
