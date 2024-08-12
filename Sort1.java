import java.util.Scanner;

class Sort1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i;

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter elements to find highest element from them: ");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        
        System.out.print("Sorted elements are: ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    
    }
}
