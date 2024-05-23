package salaryinheritance;

public class CalculateSalary extends SalaryClass1
{
	public void salarybreaking() 
	{
	 
		double hra = (basicpay/100)*5;
		double pf = (basicpay/100)*20;

		double totalSalary= basicpay + hra - pf - deduction + bonus;
		
		
		
	
	}
	
	public static void main(String[] args) {
		CalculateSalary s= new CalculateSalary();
		s.salarybreaking();
		s.salary();
		

	}

}
