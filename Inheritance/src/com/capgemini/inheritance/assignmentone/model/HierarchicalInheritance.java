/*	6)	Show the example of hierarchical inheritance with constructor invocation. */

package com.capgemini.inheritance.assignmentone.model;

	class FirstClass
	{
	
			public FirstClass()		//constructor of first class;
			{
				System.out.println("Constructor-First");
			}
	}
	class SecondClass extends FirstClass
	{
	
			public SecondClass() 	//second of first class;
			{
				System.out.println("Constructor-Second");
			}
	}

	class ThirdClass extends FirstClass
	{
			public ThirdClass()		//constructor of third class;
			{
				System.out.println("Constructor-Third");
			}
	}

	class FourthClass extends FirstClass
	{
	
			public FourthClass()	//constructor of fourth class;
			{
				System.out.println("Constructor-Fourth");
			}
	}
	public class HierarchicalInheritance 
	{
		public static void main(String[] args) {
			
			FirstClass firstClass = new SecondClass();	//object type- SecondClass, reference type-FirstClass;
			FirstClass secondClass = new ThirdClass();	//object type- ThirdClass, reference type-FirstClass;
			FirstClass thirdClass = new FourthClass();	//object type- FourthClass, reference type-FirstClass;
		
		}
}