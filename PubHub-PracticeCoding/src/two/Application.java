package two;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivatePerson pr1 = new PrivatePerson();
		
		pr1.setName("JJ");
		pr1.setAge(40);
		
		System.out.println("Private Person: " + pr1.getName() + " Age: " + pr1.getAge());
	}

}
