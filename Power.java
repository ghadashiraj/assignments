import java.util.Scanner;
class Power{
public static int pov(int a, int b){
        int res = 1;
        
            for(int i = 1;i <= b;i++){
                res *= a;
                
        }
        return res;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find power: ");
        int x = sc.nextInt();
        System.out.println("Enter number of exponential: ");
        int y = sc.nextInt();
        int ans = pov(x, y);
        System.out.println(ans);
    }
}