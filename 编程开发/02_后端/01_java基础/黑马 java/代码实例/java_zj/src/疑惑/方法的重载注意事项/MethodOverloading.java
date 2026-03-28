package 疑惑.方法的重载注意事项;

public class MethodOverloading {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println( getSum(a,b));

    }
    /*public static double getSum(int a,int b){
        return a+b;
    }*/
    /*public static double getSum(double a,int b){
        return a+b;
    }
    public static double getSum(int a,double b){
        return a+b;
    }*/
    public static double getSum(double a,double b){
        return a+b;
    }
}
