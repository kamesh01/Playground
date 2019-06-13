import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      	Scanner sc = new Scanner(System.in);
      	int option = sc.nextInt();
        switch(option)
        {
            // For square
          	case 1:
                int side = sc.nextInt();
                int area_square = side * side;
                System.out.println(area_square);
                break;
            // For Rectangle
            case 2:
                int length = sc.nextInt();
                int breadth = sc.nextInt();
                int area_rec = length * breadth;
                System.out.println(area_rec);
                break;
            // For Triangle
            case 3:
                int heigth = sc.nextInt();
                int base = sc.nextInt();
                int area_tri = (heigth * base) / 2;
                System.out.println(area_tri);
                break;
            // For Circle
            case 4:
                int radius = sc.nextInt();
                double area_cir = 3.14 * radius * radius;
                System.out.println(area_cir);
                break;
        }
    }
}