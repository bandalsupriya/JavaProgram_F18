package generalization;

public class Gpay implements UPI
{

	public static void main(String[] args) 
	{
		
		Gpay g=new Gpay();
		g.B2BPayments();
		g.BalanceCheck();
		g.M2MPayments();
		g.QRCodePayment();
	}
	
	
	@Override
	public void QRCodePayment() 
	{
		System.out.println("Gpay QR");
		
	}

	@Override
	public void B2BPayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BalanceCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void M2MPayments() {
		// TODO Auto-generated method stub
		
	}

	

}
