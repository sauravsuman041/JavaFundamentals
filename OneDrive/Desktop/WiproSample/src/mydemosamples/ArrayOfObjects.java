package mydemosamples;

import java.util.Scanner;

class AccDetails
{
	int accid;
	String acctype;
	//Rightclick->Source->Generate Getters and Setters ->select all variables!
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
}
public class ArrayOfObjects {
	public static void main(String[] args) {

		AccDetails accob=new AccDetails();// only one
		
		AccDetails accobj[]=new AccDetails[4];//array of objects(0 to 3)
		
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<accobj.length;i++)//4
		{
			System.out.println("Accno " +(i+1)+" :: ");
			int t=s1.nextInt();
			s1.nextLine();
			System.out.println("Acctype " +(i+1)+ " :: ");
			String t1=s1.nextLine();

			//accobj[0],accobj[1],accobj[2].....
			accobj[i]=new AccDetails();//********************0th index,1st index,2nd......
			accobj[i].setAccid(t);
			accobj[i].setAcctype(t1);
		}
		for(int i=0;i<accobj.length;i++)
		{
			System.out.println("AccHolder Details:: "+accobj[i].getAccid() + " "+accobj[i].getAcctype());
		}

	}

}
/*
Accno 1 :: 
1001
Acctype 1 :: 
FixedDeposit Account
Accno 2 :: 
1002
Acctype 2 :: 
Savings Account
Accno 3 :: 
1003
Acctype 3 :: 
NRI Account
Accno 4 :: 
1004
Acctype 4 :: 
RecurringDeposit Account
AccHolder Details:: 1001 FixedDeposit Account
AccHolder Details:: 1002 Savings Account
AccHolder Details:: 1003 NRI Account
AccHolder Details:: 1004 RecurringDeposit Account
*/
