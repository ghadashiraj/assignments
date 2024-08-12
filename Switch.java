import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int l, b, r;
        float ar, pr, arc, cc;
        int ch1, ch2;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Rectangle \n2. Circle");
        System.out.println("Enter your choice");
        ch1 = sc.nextInt();
        switch (ch1) {
            case 1: {
                System.out.println("Enter length");
                l = sc.nextInt();
                System.out.println("Enter Breadth");
                b = sc.nextInt();
                System.out.println("1. Area \n2. Perimeter");
                System.out.println("Enter your choice");
                ch2 = sc.nextInt();
                switch (ch2) {
                    case 1: {
                        ar = l * b;
                        System.out.println("area of rectangle: " + ar);
                        break;
                    }
                    case 2: {
                        pr = 2 * (l + b);
                        System.out.println("perimeter of rectangle: " + pr);
                        break;
                    }
                    default: {
                        System.out.println("You have selected wrong option...");
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Enter radius");
                r = sc.nextInt();
                System.out.println("1. Area \n2. Circumference");
                System.out.println("Enter your choice");
                ch2 = sc.nextInt();
                switch (ch2) {
                    case 1: {
                        arc = (float) (3.14 * r * r);
                        System.out.println("area of Circle: " + arc);
                        break;
                    }
                    case 2: {
                        cc = (float)(2 * (3.14 * r));
                        System.out.println("circumference of Circle: " + cc);
                        break;
                    }
                    default: {
                        System.out.println("You have selected wrong option...");
                        break;
                    }
                }
                break;
            }
            default: {
                System.out.println("You have selected wrong option...");
                break;
            }
        }
    }
}
