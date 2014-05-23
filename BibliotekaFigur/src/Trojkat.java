
public class Trojkat{

	double obwod;
	double pole;
	double dlugosc1;
	double dlugosc2;
	double dlugosc3;
	
	public Trojkat( double dlugosc1, double dlugosc2, double dlugosc3 ){
			if( dlugosc1 > dlugosc2 + dlugosc3 || 
					dlugosc2 > dlugosc1 + dlugosc3 || 
					dlugosc3 > dlugosc1 + dlugosc2){
				System.out.println("Nie mo¿na narysowaæ takiego trójk¹ta");
			}
			else{
				obwod = dlugosc1 + dlugosc2 + dlugosc3;
				
				pole = Math.sqrt( obwod/2 * ( (obwod/2 - dlugosc1)*(obwod/2 -dlugosc2)*(obwod/2 - dlugosc3) ) );
			}
			this.dlugosc1 = dlugosc1;
			this.dlugosc2 = dlugosc2;
			this.dlugosc3 = dlugosc3;
		}
	
	void licz(  ){
		//super( dlugosc1, dlugosc2, dlugosc3 );
		
		if( dlugosc1 > dlugosc2 + dlugosc3 || 
				dlugosc2 > dlugosc1 + dlugosc3 || 
				dlugosc3 > dlugosc1 + dlugosc2){
			System.out.println("Nie mo¿na narysowaæ takiego trójk¹ta");
		}
		else{
			obwod = dlugosc1 + dlugosc2 + dlugosc3;
			
			pole = Math.sqrt( obwod/2 * ( (obwod/2 - dlugosc1)*(obwod/2 -dlugosc2)*(obwod/2 - dlugosc3) ) );
		}
	}


	public String toString() {
		return "Trojkat\nobwod= " + obwod + ",\npole=" + pole + ",\ndlugosc1= " + dlugosc1
				+ ",\ndlugosc2= " + dlugosc2 + ",\ndlugosc3= " + dlugosc3 + ",";
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
}
