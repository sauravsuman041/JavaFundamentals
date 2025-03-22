package mydemosamples;

class PurchaseException extends Exception 
{
	 public PurchaseException(String message) {
	        super(message);//Object class
	    }
}
/*
Are user defined exceptions checked or unchecked in Java?

User Defined exceptions are checked exceptions because they are extended with Exception class 
which is super class 
for all the exceptions occured,where as unchecked exceptions are extended with run time Exceptions.
*/

public class UserDefinedException1 {
    public void makePurchase(int itemStock, double balance, double price) throws PurchaseException 
    {
        if (itemStock <= 0) {
            throw new PurchaseException("Item is out of stock!");
        }
        if (balance < price) {
            throw new PurchaseException("Insufficient funds for this purchase.");
        }
        // If no exception, proceed with purchase
        System.out.println("Purchase successful!");
    }
	public static void main(String[] args) 
	{
		UserDefinedException1 obj4=new UserDefinedException1();
        try 
        {
        		obj4.makePurchase(0, 100.0, 50.0);
        } 
        catch (PurchaseException e)
        {
            System.out.println("Purchase failed: " + e.getMessage());
            System.out.println("Purchase failed: " + e);//Object class toString()
            
        }
        try 
        {
            obj4.makePurchase(5, 30.0, 50.0);
        } 
        catch (PurchaseException e) 
        {
            System.out.println("Purchase failed: " + e.getMessage());
        }    

	}

}
/*
 * Purchase failed: Item is out of stock!
Purchase failed: mywiprodemos.PurchaseException: Item is out of stock!
Purchase failed: Insufficient funds for this purchase.
*/