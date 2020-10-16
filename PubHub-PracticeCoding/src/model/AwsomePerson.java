package model;

public class AwsomePerson extends Person{
	
	
	
	public AwsomePerson() {
		this.name = "awsome person";
		this.age = 30;
		System.out.println("In AwsomePerson class ...");
	}

	public void talk(){
		System.out.println("AwsomePerson name is:  " + this.name);
		
	}
}
