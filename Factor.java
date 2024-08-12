import java.util.*;
class Factor{
    public static void main(String[] args){
       double a = 6;
       double b = -18;
       double c = -3;
       double d = b*b-4*a*c;

       double root1 = (-b+Math.sqrt(d))/(2*a);
       double root2 = (-b-Math.sqrt(d))/(2*a);
       System.out.println("roots of euation are : "+root1 +" and "+root2);
    }
}