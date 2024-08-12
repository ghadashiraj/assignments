import java.util.Scanner;
class Find{
    public static void main(String[] args){
        int a[] = {2,5,3,7,8,2};
        int i;
        int r;
        int ans=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to find : ");
            r = sc.nextInt();
            for(i=0;i<a.length;i++){
                if(r==a[i]){
                    
                    ans = a[i];
                    
                    System.out.println("Your element is mathched : "+ans+" present at index : "+i);
                    break;
                }
                if(r!=a[i]){
                    System.out.println("Sorry your element is not presen at : "+i);
                }
            }
    }
}
        