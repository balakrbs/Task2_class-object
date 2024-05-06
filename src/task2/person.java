package task2;

//Question no::1.1

public class person {
	private String name;
	private int age;
	

	public person() {
		this.age=18;
	}
	
	public void display() {
		System.out.println("NAme : "+name);
		System.out.println("Age : "+age);
	}
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public class person_test {

		public static void main(String[] args) {
			person obj=new person("rahul",22);
			obj.display();

		}
	

}}
