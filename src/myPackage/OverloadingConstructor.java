package myPackage;

public class OverloadingConstructor {
	
	String name;
	int age;
	long id;
	
	//one-arg constructor
	 OverloadingConstructor(String n) {
		name = n;
	}
	
	//two-arg constructor 
	 OverloadingConstructor(String n, int a) {
		name = n;
		age = a;
	}
	
	 OverloadingConstructor(long l) {
		id = l;
	}
	
	void display() {
		System.out.println(name+" "+age+" "+id);
	}

	public static void main(String[] args) {
		OverloadingConstructor o1=new OverloadingConstructor("John");
		OverloadingConstructor o2=new OverloadingConstructor("Rosy",20);
		o1.display();
		o2.display();
		o3.display();
	}

}
