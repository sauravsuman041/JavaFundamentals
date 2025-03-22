package mydemosamples;

//A java file can have 'n' number of java classes
//Only one java class(main()) can be declared as PUBLIC!

//public class A//invalid
class A
{
	
}
class B
//public class B//invalid
{
	
}
class Test
{
	public int x;
	private int data;

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

}
public class DataAbstraction_EncapsulationDemo 
{
	//store product details
		int prodid;
		String productname;
		float price;	

		//Data hiding(Getters and Setters)::
		//set-assign a value
		//get - return or display the value
		//Rightclick->Source->Generate Getters and Setters ->select all variables!

		
	public int getProdid() {
			return prodid;
		}

		public void setProdid(int prodid) {
			this.prodid = prodid;
		}

		public String getProductname() {
			return productname;
		}

		public void setProductname(String productname) {
			this.productname = productname;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

	public static void main(String[] args) {
		DataAbstraction_EncapsulationDemo obj1=new DataAbstraction_EncapsulationDemo();
		//obj1.prodid=100;//VALID SYNTAX BUT DONT DO LIKE THIS in realtime platform
		obj1.setProdid(1001);
		obj1.setProductname("Laptop");
		obj1.setPrice(90000.70f);

		System.out.println("Product Details:: "+obj1.getProdid() + " "+obj1.getProductname() + " "+obj1.getPrice());

		DataAbstraction_EncapsulationDemo obj2=new DataAbstraction_EncapsulationDemo();

		obj2.setProdid(101);
		obj2.setProductname("Bluetooth");
		obj2.setPrice(9000.70f);

		System.out.println("Product Details:: "+obj2.getProdid() + " "+obj2.getProductname() + " "+obj2.getPrice());

		Test t1=new Test();
		t1.x=100;
		//t1.data=3493;//not visible error!

		//Private data member visible in another class bcos of PUBLIC SETTER AND GETTER

		t1.setData(1000);
		System.out.println("TEST::: "+t1.getData());

	}

}

/*
Product Details:: 1001 Laptop 90000.7
Product Details:: 101 Bluetooth 9000.7
TEST::: 1000
*/
