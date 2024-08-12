class Fact{
public static int factorial(int a){
        int facto = 1;
        
            for(int i = 1;i <= a;i++){
                // facto *= i;
                facto = facto*i;
        }
        return facto;
}

    public static void main(String[] args){
        int f = 5;
        int ans = factorial(f);
        System.out.println(ans);
    }
}