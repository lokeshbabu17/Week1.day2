package week1.day2;

public class Mymobile {
	String model="REALME X7";
	int cost=12000;
	
	public void makeCall()
	{
		System.out.println("Make call");
		
	}
	
	public void sendMsg()
	{
		System.out.println("Send msg");
	}
	
	private void payBills()
	{
		System.out.println("Paying Bills");
	}
	
	public static void main(String[] args) {
	
		Mymobile obj=new Mymobile();
		
		obj.makeCall();
		obj.sendMsg();
		obj.payBills();
		System.out.println("model=" +obj.model);
	}
}
