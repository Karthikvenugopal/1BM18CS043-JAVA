import java.util.*;
class Gen<T,V>{
	T ob;
	V ob1;
	Gen(T a, V b){
		ob = a;
		ob1 = b;
	}
	void show(){
		System.out.println("Object 1 is : " + ob.getClass().getName() + "\nObject 2 is : " + ob1.getClass().getName());
	}
}
class GenericsDemo{
	public static void main(String args[]){
		int choice, choice1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the datatype of parameter 1\n1. Integer\n2. String");
		choice = sc.nextInt();
		System.out.println("Enter the datatype of parameter 2\n1. Integer\n2. String");
		choice1 = sc.nextInt();
		switch(choice){
			case 1: switch(choice1){
						case 1: Gen<Integer, Integer> genob = new Gen<Integer, Integer>(1, 2);
								genob.show();
								break;
						case 2: Gen<Integer, String> genob1 = new Gen<Integer, String>(1, "Hi");
								genob1.show();
								break;
					}
					break;
			case 2: switch(choice1){
						case 1: Gen<String, Integer> genob2 = new Gen<String, Integer>("Hi", 1);
								genob2.show();
								break;
						case 2: Gen<String, String> genob3 = new Gen<String, String>("Hi", "Hi1");
								genob3.show();
								break;
					}
					break;
		}
	}
}