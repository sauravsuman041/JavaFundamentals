package mydemosamples;

/*
JaggedArray(array-of-arrays)::
 --We can create 2D arrays but with variable number of columns in each row!
ex: int a[][]=new int[2][3];//6 elements
ex: int a[][]=new int[2][];
*/

public class JaggedArray {
	public int[][] create2DArray()//Method returning 2D array
	{
		int[][] s=new int[4][];//jagged array
		s[0]=new int[4];//(0,0) (0,1) (0,2) (0,3)
		s[1]=new int[2];//(1,0) (1,1)
		s[2]=new int[3];//(2,0) (2,1) (2,2)
		s[3]=new int[1];//(3,0)
		for(int i=0;i<s.length;i++)//rowsize=>4
		{
			for(int j=0;j<s[i].length;j++)//columnsize=>4,2,3,1
			{
				s[i][j]=j+1;
			}
		}
		return s;//returning 2d array
	}//method closed
	public void dispArray()
	{
		int[][] g=create2DArray();//method called
		for(int i=0;i<g.length;i++)
		{
			for(int j=0;j<g[i].length;j++)
			{
				System.out.print(g[i][j]+ " ");
			}
			System.out.println();//next row
		}
		}
	public static void main(String[] args) {
		new JaggedArray().dispArray();
		
	}

}
/*
1 2 3 4 
1 2 
1 2 3 
1 
*/
