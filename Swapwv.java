//Swap without using third variable
class Swapwv{
    public static void main(String[] args){
        int a, b;
        a = 10;
        b = 5;
        System.out.println("Numbers before swap: "+a+", b = "+ b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Numbers after swap: "+a+", b = "+ b);
    }
}