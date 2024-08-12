import java.util.Scanner;
class Arithmatic{
    double add(double a, double b){
        return a+b;
    }
    double sub(double a, double b){
        return a-b;
    }
    double mul(double a, double b){
        return a*b;
    }
    double div(double a, double b){
        return a/b;
    }
    double mod(double a, double b){
        return a%b;
    }
    public static void main(String[] args){
        Arithmatic obj = new Arithmatic();

        double num1 = 10;
        double num2 = 5;

        double addition = obj.add(num1, num2);
        System.out.println("Addition is : "+addition);

         double substraction = obj.sub(num1, num2);
        System.out.println("Substraction is : "+substraction);

         double multiplication = obj.mul(num1, num2);
        System.out.println("Multiplication is : "+multiplication);

         double division = obj.div(num1, num2);
        System.out.println("Division is : "+division);

         double modulo = obj.mod(num1, num2);
        System.out.println("Modulo is : "+modulo);
    }
}