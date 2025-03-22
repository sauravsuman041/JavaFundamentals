package day4_Activity;

//8.Create a class such that it resets the value of the objects it used to null after its usage in all 
//cases.(use finally)

class ResetValue{
	private String str;

    public ResetValue(String str) {
        this.str = str;
    }

    public void use() {
        try {
            System.out.println("Using the object with value: " + str);

        } catch (Exception e) {
            System.out.println("An error occurred!!");
        } finally {
            str = null;
        }
    }


    public String getValue() {
        return str;
    }
}


public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ResetValue obj = new ResetValue("Hello, World!");
		System.out.println("Value before reset: " + obj.getValue());
        obj.use();
        System.out.println("Value after reset: " + obj.getValue());

	}

}
