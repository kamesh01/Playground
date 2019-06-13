class MyModel1 {
     //write your logic here
  	int cameraPixels = 2;
    int displaySize = 5;
    
    public MyModel1() {
    	System.out.println("Features of MyModel 1");
        System.out.println("Camera mega pixels: "+cameraPixels);
    }
}
class MyModel2 extends MyModel1 {
     //write your logic here
  	int cameraPixels = 5;
    String lock = "Fingerprint";
        
    public MyModel2(){
    	System.out.println("Features of MyModel 2");
    	System.out.println("Camera mega pixels: "+cameraPixels);
    	System.out.println("Lock mechanism: "+lock);
    	System.out.println("Display size: "+displaySize);
    }
}
class MyModel2T extends MyModel2 {
     //write your logic here
  	int cameraPixels = 16;
  	int displaySize = 6;
  	
  	public MyModel2T(){
    	System.out.println("Features of MyModel 2T");
    	System.out.println("Camera mega pixels: "+cameraPixels);
    	System.out.println("Lock mechanism: "+lock);
    	System.out.println("Display size: "+displaySize);
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      	// creating object for MYmodel2T class
      	MyModel2T mobile = new MyModel2T();
    }
}