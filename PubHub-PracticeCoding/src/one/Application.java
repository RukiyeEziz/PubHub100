package one;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		
		p1.name = "Ruki";
		p1.age = 30;
		
		System.out.println(p1);				//one.Person@15db9742
		System.out.println("Person: " + p1.name + " Age: " + p1.age); //Person: Ruki Age: 30
		
		
		
	}

}
