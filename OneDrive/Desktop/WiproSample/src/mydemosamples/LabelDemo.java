package mydemosamples;

//No GOTO statement but Label concept available

public class LabelDemo {
	//empty

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if (j==3)
				{
					break;//break the current inner for loop
				}
				System.out.println("Value i:: "+i + " "+ "Value j:: "+j);
			}
			System.out.println("Outside Inner For Loop");
		}//outer for loop completion
		System.out.println("Completed!");


		System.out.println();

		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if (j==3)
				{
					continue;
				}
				System.out.println("Value i:: "+i + " "+ "Value j:: "+j);
			}
			System.out.println("Outside Inner For Loop");
		}//outer for loop completion
		System.out.println("Completed!");
		
		System.out.println();

		System.out.println("BREAK WITH LABEL:::::::::::");
		//Labeled blocks can only be used with break and continue statements.
		WIPRO://label name of the outer for loop
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if (j==3)
				{
					break WIPRO;
				}
				System.out.println("Value i:: "+i + " "+ "Value j:: "+j);
			}
			System.out.println("Outside Inner For Loop");
		}//outer for loop completion
		System.out.println("Completed!");
		
		System.out.println();

		System.out.println("CONTINUE WITH LABEL:::::::::::");
		WIPRO_CH://label name of the outer for loop
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if (j==3)
				{
					continue WIPRO_CH;
				}
				System.out.println("Value i:: "+i + " "+ "Value j:: "+j);
			}
			System.out.println("Outside Inner For Loop");
		}//outer for loop completion
		System.out.println("Completed!");


	}

}

/*
* Value i:: 1 Value j:: 1
Value i:: 1 Value j:: 2
Outside Inner For Loop
Value i:: 2 Value j:: 1
Value i:: 2 Value j:: 2
Outside Inner For Loop
Value i:: 3 Value j:: 1
Value i:: 3 Value j:: 2
Outside Inner For Loop
Completed!

Value i:: 1 Value j:: 1
Value i:: 1 Value j:: 2
Value i:: 1 Value j:: 4
Outside Inner For Loop
Value i:: 2 Value j:: 1
Value i:: 2 Value j:: 2
Value i:: 2 Value j:: 4
Outside Inner For Loop
Value i:: 3 Value j:: 1
Value i:: 3 Value j:: 2
Value i:: 3 Value j:: 4
Outside Inner For Loop
Completed!

BREAK WITH LABEL:::::::::::
Value i:: 1 Value j:: 1
Value i:: 1 Value j:: 2
Completed!

CONTINUE WITH LABEL:::::::::::
Value i:: 1 Value j:: 1
Value i:: 1 Value j:: 2
Value i:: 2 Value j:: 1
Value i:: 2 Value j:: 2
Value i:: 3 Value j:: 1
Value i:: 3 Value j:: 2
Completed!

*/
