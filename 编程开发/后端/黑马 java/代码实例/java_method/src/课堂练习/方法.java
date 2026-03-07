package 课堂练习;

/**
 * ClassName: 方法
 * Package: 课堂练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/4 - 09:52
 * @Version: v1.0
 *
 */
public class 方法 {
    /*
    练习：定义一个方法，求两个数的和

    格式：
    public static 返回值类型 方法名（参数1，参数2...）{
    方法体；
    return 返回值；
    }

    调用格式：
    方法名（参数1，参数2...）；
    注意点：
    1.方法跟方法之间是平级关系，不能互相嵌套
    2.方法不会主动运行的，需要被调用才可以
    3.小括号中的参数需要一一对应（个数，类型）
    */
    public static void main(String[] args){
        //调用方法
        System.out.println(getSum(10,20));
    }
    public static int getSum(int a,int b){
        return a + b;
    }
}
