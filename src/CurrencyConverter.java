import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double usd = 1.0d;
		double nrs = 1.0d;
		double euro = 1.0d;

		System.out.print("Choose the  currency to conver(USD,NRS,EURO): ");
		String c = sc.next().toUpperCase();
		
		
		System.out.print("Choose the currency to get converted(USD, NRS, EURO): ");
		String c2 = sc.next().toUpperCase();
		
		System.out.print("Enter the amount: ");
		double a = sc.nextDouble();
		
		
		// call the api
		// get the currency rate 
		// use the currency rate below 
		
		if ( a < 0 ) {
			System.out.println("INVALID AMOUNT");
		} else {
		
			if(c.equals("USD") && c2.equals("NRS")) {
				System.out.println("NRS: Rs." + nrs * 131.6190*a);
				
			} else if (c.equals("USD") && c2.equals("EURO")) {
				System.out.println("EURO: " + euro*0.929*a);
				
			} else if (c.equals("EURO")&& c2.equals("USD")) {
				System.out.println("USD: $"+ usd*1.0765*a);
				
			} else if(c.equals("EURO") && c2.equals("NRS")) {
				System.out.println("NRS: Rs." +nrs*141.6299*a);
				
			} else if(c.equals("NRS") && c2.equals("USD")) {
				System.out.println("USD: $"+usd*0.0075769*a);
				
			} else if(c.equals("NRS") && c2.equals("EURO")) {
				System.out.println("EURO: "+ euro*0.00706101*a);
				
			} else {
				System.out.println("INVALID CURRENCY!");
			}

		}
		
		
		
	}

}

//ArrayList
//currency converter (without switch and with switch)
//OOPS concept - access modifier 

//level - Basic java is fundamental java (foundation) 
//level 2 -  tools and frameworks


