package generalization;

public class BHIM implements UPI
{

	public static void main(String[] args) 
	{
		BHIM b=new BHIM();
		b.B2BPayments();
		b.BalanceCheck();
	
		b.QRCodePayment();
		b.M2MPayments();

	}

	
	public void QRCodePayment() 
	{
		System.out.println("BHIM QR");
		
	}

	
	public void B2BPayments() 
	{
		System.out.println("BHIM B2B");
		
	}

	
	public void BalanceCheck() 
	{
		System.out.println("BHIM BALANCE CHECK");
		
	}

	
	public void M2MPayments() 
	{
		System.out.println("BHIM M2M");
		
	}

}
