//import required packages
import java.util.Scanner;

class Faculty
{
  public void salary(int baseSalary)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: " + baseSalary);
  }
}
class CSE extends Faculty
{
  public void salary(int baseSalary)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(baseSalary+3000));
  }
}
class IT extends CSE
{
  public void salary(int baseSalary)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(baseSalary+5000));
  }
}
class ECE  extends IT
{
  public void salary(int baseSalary)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(baseSalary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int baseSalary = sc.nextInt();
    //implement your required concept here
	if(baseSalary > 0)
    {
    	Faculty obj1 = new Faculty();
    	obj1.salary(baseSalary);
    	CSE obj2 = new CSE();
    	obj2.salary(baseSalary);
    	IT obj3 = new IT();
    	obj3.salary(baseSalary);
    	ECE obj4 = new ECE();
    	obj4.salary(baseSalary);
    }
    else
    {
      System.out.println("null");
    }
  }
}