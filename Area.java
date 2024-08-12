import java.util.Scanner;
class Area{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();
        System.out.println("Enter value of radius");
        double r = sc.nextFloat();
        double area = obj.areaCalc(r);
        double cercumference = obj.cercumCalc(r);
        System.out.println("area of circle is : "+area);
        System.out.println("Cercumference of circle is : "+cercumference);

    }
    
    double areaCalc(double p){
        return 3.14*p*p;
        
    }
     double cercumCalc(double s){
        return 2*3.14*s;
        
    }
}