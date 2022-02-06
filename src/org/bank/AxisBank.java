package org.bank;

public class AxisBank extends BankInfo
{
	@Override
	public void savings() {
		System.out.println("95% from salary");
	}
		public static void main(String[] args)

		{
	       AxisBank ab =new AxisBank();
	       ab.savings();
	       ab.fixed();
	       ab.deposit();
	       
		
		
	}
}
	





/*@override
	public void deposit()
	{
	System.out.println("95% from salary");
}
	public static void main(String[] args)

	{
       AxisBank ab =new AxisBank();
       ab.savings();
       ab.fixed();
       ab.deposit();
       
	}
	}
*/