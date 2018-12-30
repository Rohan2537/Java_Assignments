/*	Attributes:
	Id
	name
	monthlyBasic
	Behaviours/Interfaces/Services: 
	getAnnualBasic() //(return 12 * monthlyBasic;)
	getMonthlyGrossSalary()//(monthlyBasic + hra + medical + conveyance)
	getAnnualGrossSalary() //(12 * MonthlyGrossSalary)
	getMonthlyDeductions() //(pf + esic + profTax)
	getMonthlyTakeHome() //(MonthlyGrossSalary- MonthlyDeductions)
	getAnnualTakeHome() //(12 * MonthlyTakeHome)
	setPFRate(float f)  and getPFRate()

	HRA = 50% of basic, medical allowance = Rs 1250, conveyance allowance = Rs 800
	PF = 10% of  monthly basic or 6500 whichever is lower.
	ESIC = 4.75% of monthly basic if monthly basic <= 5000
	professional tax: if monthly gross <= 10000 then Rs 50, else Rs 100*/
package com.capgemini.classesandobjects.employee;

public class Employee {
	
	private final int id;
	private String name;
	private double monthlyBasic;
	static private double pfRate = 10;
	private static double medical = 1250;
	private static double conveyance = 800;
	
	public int getId() 
	{	
		return id;
	}

	 Employee(int id) 
	 {			//constructor for id;
		this.id = id;
	}

	public String getName() 	//getter for name;
	{
		return name;
	}

	public void setName(String name) 		//setter for name;
	{
		this.name = name;
	}

	public double getMonthlyBasic()		//getter for monthly  basic;
	{
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) 		//setter for monthly basic;
	{
		this.monthlyBasic = monthlyBasic;
	}

	double getAnnualBasic()			//getter for annual basic;
	{	
		if(monthlyBasic <= 0)
		{
			return 0;
		}
		return (12 * monthlyBasic);	
	}

	double getMonthlyGrossSalary()		//getter for monthly gross salary;
	{
		double hra = 0.50*monthlyBasic;				//50% of monthlyBasic
		return (monthlyBasic + hra + medical + conveyance);
	}
	
	double getAnnualGrossSalary()		//getter for annual gross salary;
	{
		return (12*getMonthlyGrossSalary()) ;
	}
	
	double getMonthlyDeductions()		//getter for monthly deductions;
	{
		double PF = (getMonthlyBasic()*getPFRate()/100)<=6500 ? getMonthlyBasic()*getPFRate()/100 : 6500;			//10% of monthlyBasic
		double esic = getMonthlyBasic()<=5000 ? (getMonthlyBasic()*4.75/100) : 0;					//4.75% of monthlyBasic
		double profTax = (getMonthlyGrossSalary()<=10000)? 50 :100;
		System.out.println("PF value is: " +PF);
		System.out.println("profTax value is: " +profTax);
		System.out.println("esic value is " +esic);
		System.out.println("Monthly deductions = " +(PF + esic + profTax));
		return PF + esic + profTax;
	}
	
	private static double getPFRate()	//getter for PFRate;
	{
		return pfRate;
	}

	private static void setPFRate(double rate)		//setter for PFRate;
	{
		Employee.pfRate=rate;
	}

	double getMonthlyTakeHome()		//getter for monthly take home;
	{
		return (getMonthlyGrossSalary()-getMonthlyDeductions());
	}
	
	double getAnnualTakeHome()		//getter for annual take home;
	{
		return (12 * getMonthlyTakeHome());	
	}
	
}
