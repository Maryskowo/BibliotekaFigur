
public class Figury {

	double punkt1;
	double punkt2;
	double dlugosc1;
	double dlugosc2;
	double dlugosc3;
	double bok;
	
	public Figury( double punkt1, double punkt2 ){
		this.punkt1 = punkt1;
		this.punkt2 = punkt2;
	}
	
	public Figury( double dlugosc1, double dlugosc2, double dlugosc3 ){
		this.dlugosc1 = dlugosc1;
		this.dlugosc2 = dlugosc2;
		this.dlugosc3 = dlugosc3;
	}
	
	public Figury( double bok ){
		this.bok = bok;
	}

	@Override
	public String toString() {
		return "Figury\npunkt1= " + punkt1 + ",\npunkt2= " + punkt2
				+ ",\ndlugosc1= " + dlugosc1 + ",\ndlugosc2= " + dlugosc2
				+ ",\ndlugosc3= " + dlugosc3 + ",\nbok= " + bok
				+ super.toString() + "]";
	}
	
	void setPunkt1( double punkt1 ){
		this.punkt1 = punkt1;
	}
	
	void setPunkt2( double punkt2 ){
		this.punkt2 = punkt2;
	}
	
	void setDlugosc1( double dlugosc1 ){
		this.dlugosc1 = dlugosc1;
	}
	
	void setDlugosc2( double dlugosc2 ){
		this.dlugosc2 = dlugosc2;
	}
	
	void setDlugosc3( double dlugosc3 ){
		this.dlugosc3 = dlugosc3;
	}
	
	void setBok( double bok ){
		this.bok = bok;
	}
}
