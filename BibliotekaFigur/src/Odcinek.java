
public class Odcinek{

	double dlugosc;
	double punkt1;
	double punkt2;
	
	public Odcinek( double punkt1, double punkt2 ){
		
		if( punkt1 > punkt2 ){
			dlugosc = punkt1 - punkt2;
		}
		else{
			dlugosc = punkt2 - punkt1;
		}
		this.punkt1 = punkt1;
		this.punkt2 = punkt2;
	}

	void licz( ){
		
		if( punkt1 > punkt2 ){
			dlugosc = punkt1 - punkt2;
		}
		else{
			dlugosc = punkt2 - punkt1;
		}
	}

	@Override
	public String toString() {
		return "Odcinek\ndlugosc= " + dlugosc + ",\npunkt1=" + punkt1
				+ ",\npunkt2=" + punkt2 + ",";
	}
	
	
}
