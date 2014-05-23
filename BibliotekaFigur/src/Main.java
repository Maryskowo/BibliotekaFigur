
public class Main {

	public static void main(String[] args) {
		
		Trojkat trojkat = new Trojkat(3, 5, 7);
		
		System.out.println(trojkat.toString());
		trojkat.setDlugosc1(4);
		trojkat.setDlugosc2(6);
		trojkat.setDlugosc3(8);
		trojkat.licz();
		System.out.println(trojkat.toString());
		
		Kwadrat kwadrat = new Kwadrat(4);
		System.out.println(kwadrat.toString());
		kwadrat.setBok(5);
		kwadrat.licz();
		System.out.println(kwadrat.toString());

	}

}
