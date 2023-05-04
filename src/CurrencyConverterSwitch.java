import java.util.Scanner;

public class CurrencyConverterSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []currency = {"USD ", " EURO ", " NRS"};
		
		for (int i=0; i<currency.length; i++ )
			System.out.print(currency[i]);
	
		
		System.out.println("");
		
		System.out.println("Select the from currency:");
		String x = sc.next().toUpperCase();
		
		System.out.println("Select the to currency: ");
		String y = sc.next().toUpperCase();
		
		if(x.equals(y)) { // true  // false 
			System.out.println("Invalid selection.");
		} else {
		
		System.out.println("Enter the amount:");
		double amount = sc.nextDouble();
		sc.close();
		
		if(amount<0) { // true huda if ma gayo
			System.out.println("Invalid amount");
		} else {
			
			//USD to EURO
			//USD to NRS
		
		switch(x) {
		case "USD":
			if(y.equals("EURO")) {
				usd_to_euro(amount); // line 40 ko code run huda, x = USD , Y = EUR0
			} else if (y.equals("NRS")) {
				usd_to_nrs(amount);
			}
			break;
			
		case "EURO":
			if(y.equals("USD")) {
				euro_to_usd(amount);
			} else if (y.equals("NRS")) {
				euro_to_nrs(amount);
			}
			break;
			
		case "NRS":
			if(y.equals("USD")) {
				nrs_to_usd(amount);
			} else if (y.equals("EURO")){
				nrs_to_euro(amount);
			}
			break;
			}
		///switch bata bahira
		
		}
		} // main method ends here
		
		}
	
	//methods
	public static void euro_to_usd (double amt) {
		System.out.println("USD: " + amt*1.0765);
	}
	
	public static void nrs_to_usd (double amt) {
		System.out.println("USD: " + amt*0.0075769);
	}
	public static void usd_to_euro (double amt) {
		System.out.println("EURO: " + amt*0.93);
	}
	public static void nrs_to_euro (double amt) {
		System.out.println("EURO: " + amt*0.00706101);
	}
	public static void usd_to_nrs (double amt) {
		System.out.println("NRS: " + amt*131.6190);
	}
	public static void euro_to_nrs (double amt) {
		System.out.println("NRS: " + amt*142.13);
	}
	
	
}
// review currency converter - without switch & with review 
//access modifiers ? why we use this in java ? - OOPS concept - very imp 
// after OOPS, basic/foundational java - Monday, Tuesday. 
// Git - wednesay, thursday ( we are going to do project in github)




