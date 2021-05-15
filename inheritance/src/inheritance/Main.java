package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		individualCustomer inCustomer = new individualCustomer();
		inCustomer.customerNumber = "123";
		
		CorparateCustomer coCustomer = new CorparateCustomer();
		coCustomer.customerNumber = "456";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(inCustomer);
		customerManager.add(coCustomer);
		

	}

}
