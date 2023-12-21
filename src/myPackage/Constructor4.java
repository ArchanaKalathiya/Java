//Copy Constructor Implementation
// Copy Constructor is passed with another object which copies the data available from passed object to the newly created object.
package myPackage;

public class Constructor4 {
	
	String name;
	int id;
	public Constructor4(String name,int id) {
		this.name=name;
		this.id=id;
	}
	Constructor4(Constructor4 OBJ){
		this.name = OBJ.name;
		this.id = OBJ.id;
	}

	public static void main(String[] args) {
			
		Constructor4 obj1=new Constructor4("Archana",33);
		System.out.println("First Object \n Name : "+obj1.name+"\n ID : "+obj1.id);
		
		Constructor4 obj2=new Constructor4(obj1);
		System.out.println("Copy Construtor used Second Object\n Name : "+obj2.name+"\n ID : "+obj2.id);
	}

}
