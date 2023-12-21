//Parameterized Constructor
package myPackage;

public class Constructor3{
	
	String name;
	int id;
	public Constructor3(String name,int id) {
		this.name=name;
		this.id=id;
	}

	public static void main(String[] args) {
		Constructor3 S1 = new Constructor3("Archana",33);
		Constructor3 S2 = new Constructor3("Simran",26);
		System.out.println("Student 1\n Name : "+S1.name+"\n ID : "+S1.id);
		System.out.println("Student 2\n Name : "+S2.name+"\n ID : "+S2.id);
	}

}
