import java.util.*;
public class Main<T> 
{ 
  // type your code here
  	private T t;
    public void insert(T t){
    	this.t = t;
    }
    public T get(){
    	return t;
    }
    
  public static void main(String[] args) 
     { 
       // type your code here
     	Scanner sc = new Scanner(System.in);
        // Adding Integer Value
         Main<Integer> n = new Main<Integer>();
         int num = sc.nextInt();
         n.insert(num);
        
        // Adding String Value
       	Main<String> s = new Main<String>();
        String str = sc.next();
        s.insert(str);
        
        // Adding Floating Value
        Main<Float>  f = new Main<Float>();
        float fl = sc.nextFloat();
        f.insert(fl);
        
        System.out.println("Integer Value: " + n.get());
        System.out.println("String Value: " + s.get());
        System.out.println("Float value: " + f.get());
     }
 }