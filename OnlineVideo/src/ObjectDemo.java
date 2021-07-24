
public class ObjectDemo {

	public static void main(String[] args) {
		 Calc obj; // Creating reference
		 
		 obj = new Calc(); // Creation object of class
		 
		 obj.num1=10; // Object reference of class
		 obj.num2=6;
		 obj.num3=4;
		 
		 obj.perform();
		 
		 System.out.println(obj.results1);
		 System.out.println(obj.results2);
		 System.out.println(obj.results3);

	}

}
