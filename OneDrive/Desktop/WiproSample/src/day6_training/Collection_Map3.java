package day6_training;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Prods
{
	int pno;
	String pname;
	float price;
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Prods(int pno, String pname, float price) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Prods [pno=" + pno + ", pname=" + pname + ", price=" + price + "]";
	}
}
public class Collection_Map3 {
	public static void main(String[] args) {
		Prods p1=new Prods(11,"Laptop",90800);
		Prods p2=new Prods(12,"Harddisk",9000);
		Prods p3=new Prods(1,"RAM",9800);
		Prods p4=new Prods(51,"SMPS",9500);

		//KEY->Integer,Value->Prods
		HashMap<Integer,Prods> hobj=new HashMap<Integer,Prods>();//Random order
		hobj.put(1001, p1);
		hobj.put(2001, p2);
		hobj.put(3001, p3);
		hobj.put(4001, p4);

		//Arrays1 a1=new Arrays1();
		//hobj.put(5001, a1);//invalid

		for(Map.Entry<Integer, Prods> s1: hobj.entrySet())
		{
		System.out.println("Key&Value:: "+s1.getKey() + " "+s1.getValue());
		}

		//updating
		p2.setPname("Inverter");
		p2.setPrice(34090.43f);
		for(Map.Entry<Integer, Prods> s1: hobj.entrySet())
		{
			System.out.println("(Update)Key&Value:: "+s1.getKey() + " "+s1.getValue());
		}

		//Iterator cannot be used in directly MAP interface!
		Iterator<Integer> i=hobj.keySet().iterator();//hobj.iterator()=>invalid
		while(i.hasNext())
		{
		int key1=i.next();
		System.out.println("Key:: "+key1 + " " + "Value:: "+hobj.get(key1));//get(1001),get(2001),get(3001),get(4001)
		}
		
		int searchId = 1003;
        Prods d = hobj.get(searchId);
        if (d != null) {
            System.out.println("Product found: " + d);
        } else {
            System.out.println("Product not found with ID: " + searchId);
        }
        
        hobj.remove(2001);//key
        System.out.println("After Deletion:: "+hobj);
	}

}
/*
Key&Value:: 2001 Prods [pno=12, pname=Harddisk, price=9000.0]
Key&Value:: 4001 Prods [pno=51, pname=SMPS, price=9500.0]
Key&Value:: 1001 Prods [pno=11, pname=Laptop, price=90800.0]
Key&Value:: 3001 Prods [pno=1, pname=RAM, price=9800.0]
(Update)Key&Value:: 2001 Prods [pno=12, pname=Inverter, price=34090.43]
(Update)Key&Value:: 4001 Prods [pno=51, pname=SMPS, price=9500.0]
(Update)Key&Value:: 1001 Prods [pno=11, pname=Laptop, price=90800.0]
(Update)Key&Value:: 3001 Prods [pno=1, pname=RAM, price=9800.0]
Key:: 2001 Value:: Prods [pno=12, pname=Inverter, price=34090.43]
Key:: 4001 Value:: Prods [pno=51, pname=SMPS, price=9500.0]
Key:: 1001 Value:: Prods [pno=11, pname=Laptop, price=90800.0]
Key:: 3001 Value:: Prods [pno=1, pname=RAM, price=9800.0]
Product not found with ID: 1003
After Deletion:: {4001=Prods [pno=51, pname=SMPS, price=9500.0], 1001=Prods [pno=11, pname=Laptop, price=90800.0], 3001=Prods [pno=1, pname=RAM, price=9800.0]}
*/