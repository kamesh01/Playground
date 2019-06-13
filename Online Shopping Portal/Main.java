public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      	Customers customerObj1 = new Customers(1001,"Saakshi",9000000000l,"Bangalore","16-Jul-1990",'F',"Lakme Kajal, Salwar");
		Customers customerObj2 = new Customers(1008,"Rahul",9000000001l,"Chennai","27-Jan-1992",'M',"T-Shirt, Jeans");
		Suppliers supplierObj1 = new Suppliers(7901,"ABC Traders",8000000000l,"Mumbai",10,"Paid",4.75f);
		Suppliers supplierObj2 = new Suppliers(7972,"XYZ Enterprises",8000000900l,"Kolkata",7, "Unpaid",4.35f);
		
		//For output 1	
		customerObj1.displayProfileDetails();
		customerObj2.displayProfileDetails();
		supplierObj1.displayProfileDetails();
		supplierObj2.displayProfileDetails();
		
		//For output 2
		customerObj1.editAddress("Coimbatore");
		supplierObj1.editAddress("Delhi");
		
		//For output 3
		customerObj1.placeOrder();
		
		//For output 4
		supplierObj1.increaseStockLevel(5);
		supplierObj2.increaseStockLevel(10);
    }	
}

class Users {
		//write the logic for the class Users	
  	int id;
	String name;
	long mobileNumber;
	String address;
	
	public void editAddress(String newAddress) {
		System.out.println(name+", "+address);
		address = newAddress;
		System.out.println(name+", "+address);
	}
	
	public void displayProfileDetails(){
		System.out.println(name+", "+mobileNumber);
	}
}

class Customers extends Users{
		//write the logic for the class Customers
  	private String dateOfBirth;
	private char gender;
	private String orderHistory;
	
	public Customers(int id,String name,long mobileNumber,String address, String dateOfBirth,char gender,String orderHistory) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.orderHistory = orderHistory;
	}
	
	public void placeOrder() {
		System.out.println("Order placed successfully!");
	}
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  	private int itemStock;
	private String paymentStatus;
	private float feedbackRating;
	
	public Suppliers(int id,String name,long mobileNumber,String address,int itemStock,String paymentStatus,float feedbackRating) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.itemStock = itemStock;
		this.paymentStatus = paymentStatus;
		this.feedbackRating = feedbackRating;
	}
	
	public void increaseStockLevel(int newStock) {		
		System.out.println(name+", "+(itemStock+newStock));		
	}
}