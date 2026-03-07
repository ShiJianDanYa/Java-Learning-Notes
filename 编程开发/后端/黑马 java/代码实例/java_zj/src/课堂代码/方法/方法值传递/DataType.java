package 课堂代码.方法.方法值传递;

public class DataType {
    public static void main(String[] args) {
        int a= 10;
        int b= 29;
        System.out.println("交换前 a="+a+"b ="+b);
        change(a,b);
        System.out.println("交换后 a="+a+"b ="+b);
    }
    static void change(int a,int b) {
        int temp = a;
        a = b ;
        b = temp;
    }
}
