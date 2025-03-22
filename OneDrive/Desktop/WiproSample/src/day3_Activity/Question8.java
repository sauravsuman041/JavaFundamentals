package day3_Activity;

//8.Create an enum of the six types of paper currency. Loop through the values( ) and print each value. 
//Write a switch statement for the enum.  For each case, output a description of that particular currency.


enum Currency {
    DOLLAR, RUPEE, EURO, DINAR, YEN, PESO;
}

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Available Currency Types:");
        for (Currency currency : Currency.values()) {
            System.out.println(currency);
        
            System.out.println("\nDescriptions of Each Currency:");
            switch (currency) {
                case DOLLAR:
                    System.out.println("It is used in America");
                    break;
                case RUPEE:
                    System.out.println("It is used in India");
                    break;
                case EURO:
                    System.out.println("It is used in Europe");
                    break;
                case DINAR:
                    System.out.println("It is used in Saudi Arab");
                    break;
                case YEN:
                    System.out.println("It is used in Japan");
                    break;
                case PESO:
                    System.out.println("It is used in Argentina");
                    break;
                default:
                    System.out.println("No Information!!");
            }
        }

	}

}
