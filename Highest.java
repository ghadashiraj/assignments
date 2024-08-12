import java.util.Scanner;

class Highest {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i, max = Integer.MIN_VALUE; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements to find highest element from them: ");
        
        for(i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        for(i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        
        
        System.out.println("Highest element in the array is: " + max);
    }
}
