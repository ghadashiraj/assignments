import java.util.Scanner;
class Rect{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Area obj = new Area();
        System.out.println("Enter value of length of rectangle");
        int l = sc.nextInt();
        System.out.println("Enter value of breadth of rectangle");
        int b = sc.nextInt();
        int area = areCalc(l, b);
        int perimeter = periCalc(l, b);
        System.out.println("area of circle is : "+area);
        System.out.println("Cercumference of circle is : "+perimeter);

    }
    
   public static int areCalc(int l,int b){
        return l*b;
        
    }
   public static int periCalc(int l,int b){
        return (2*l)+(2*b);
        
    }
}