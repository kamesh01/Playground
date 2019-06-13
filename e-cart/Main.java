//import required packages here
import java.util.Scanner;

class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int price){
  	this.price = price;
  }
  public int getPrice(){
  	return price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product){
  	this.product = product;
  }
  public void setQuantity(int quantity){
  	this.quantity = quantity;
  }
  public String getProduct(){
  	return product;
  }
  public int getQuantity(){
  	return quantity;
  }
}

class Bill
{
  //implement your logic to calculate total price
  public int result(int price, int quantity){
  	int result = price * quantity;
    return result;
  }
}
class Main
{
  public static void main(String[] args)
  {
    //write the logic here
    Scanner sc = new Scanner(System.in);
    String product = sc.next();
    int price = sc.nextInt();
    int quantity = sc.nextInt();
    
    Item i = new Item();
    Customer c = new Customer();
    i.setPrice(price);
    c.setQuantity(quantity);
    int q = c.getQuantity();
    int p =	i.getPrice();
    Bill obj = new Bill();
    int r = obj.result(p,q);
    System.out.println("Total Price is : " + r);
  }
}