import java.util.Scanner;

class Arravg {
    public static void main(String[] args) {
        int a[] = new int[5]; 
        int i;
        float sum = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 int numbers");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        float avg = sum / a.length; 

        System.out.println("Average is: " + avg); 
    }
}
