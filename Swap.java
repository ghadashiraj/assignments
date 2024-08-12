class Swap{
    public static void main (String[] args){

        int a = 5;
        int b = 6;
        int temp = 0;
        System.out.println("Previous value of a is : "+a);
        System.out.println("Previous value of b is : "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("new value of a is : "+a);
        System.out.println("new value of b is : "+b);
    }
}