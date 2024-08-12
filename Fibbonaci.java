import java.util.Scanner;
class Fibbonaci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int f=0, s=1, i, ans;
        for(i=1; i<=num; i++){
             ans = f+s;
            if(ans==num || ans>num)
                break;
            System.out.println(ans);
            f=s;
            s=ans;

        }
        
    }
}