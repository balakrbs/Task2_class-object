package task2;

//Question no::1.4

public class Person_inher {
	protected String name;
	protected int age;
	
	public Person_inher(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void displayinfo() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

}
