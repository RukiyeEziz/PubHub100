package main;

import model.AwsomePerson;
import model.ReallyAwsomePerson;

public class Application {

	public static void main(String[] args) {
		AwsomePerson ap1 = new AwsomePerson();
		ap1.talk();
		
		ReallyAwsomePerson rap1 = new ReallyAwsomePerson();
		rap1.talk();
		
	}

}
