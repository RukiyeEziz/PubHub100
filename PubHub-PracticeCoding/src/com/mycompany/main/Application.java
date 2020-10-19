package com.mycompany.main;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, sum;
		
		StaticClass sc = new StaticClass();
		sum = sc.computeSum(10, 100);
		System.out.println(sum);			//110.0
		
		n1 = 100.11f;
		n2 = 1221.234f;
		
		System.out.println("sum of these: " + StaticClass.computeSum(n1, n2));	//sum of these: 1321.344
		
		//String s1 = Finalclass.myConstant;  error
		FinalClass fc = new FinalClass();
		System.out.println("in main, calling FinalClass and printing final constant: " + fc.myConstant);
		//from FinalClass printing final constant: My Constant Variable
		
		ConcreteClass cc = new ConcreteClass();
		System.out.println("in main, calling ConcreteClass and printing run: ");
		cc.run();
		
		
		

	}

}
