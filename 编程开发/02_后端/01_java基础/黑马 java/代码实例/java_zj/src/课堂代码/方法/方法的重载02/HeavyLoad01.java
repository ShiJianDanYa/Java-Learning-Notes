package 课堂代码.方法.方法的重载02;

/**
 * ClassName: HeavyLoad01
 * Package: 课堂代码.方法.方法的重载02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/115:48
 * @Version1.0
 */

/* 要求使用重载的方法实现如下功能：
判断两个整数的大小
兼容所有整数类型（byte,short,int,long）
 */
public class HeavyLoad01 {
    public static void main(String[] args) {
        method(10,20);
        System.out.println("程序结束");
    }
    //方法重载
    /*
    一般是相同功能，取一样的名字
    1.定义方法可以不用太多单词
    2.调用时也不用那么多脑经
     */
    public static void method(byte a,byte b){
        if(a==b){
            System.out.println("两个数相等");
        }else{
            System.out.println("两个数不相等");
        }
    }
    public static void method(short a,short b){
        if(a==b){
            System.out.println("两个数相等");
        }else{
            System.out.println("两个数不相等");
        }
    }
    public static void method(int a,int b){
        if(a==b){
            System.out.println("两个数相等");
        }else{
            System.out.println("两个数不相等");
        }
    }
    public static void method(long a,long b){
        if(a==b){
            System.out.println("两个数相等");
        }else{
            System.out.println("两个数不相等");
        }
    }
}
