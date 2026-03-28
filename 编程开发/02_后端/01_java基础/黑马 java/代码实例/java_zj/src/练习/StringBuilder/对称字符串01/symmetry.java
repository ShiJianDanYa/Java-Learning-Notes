package 练习.StringBuilder.对称字符串01;

import java.util.Scanner;

/**
 * ClassName: symmetry
 * Package: 练习.StringBuilder.对称字符串01
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1121:49
 * @Version1.0
 */
    
    /*
    需求如下
    键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
    对称字符串：123321、111
    非对称字符串：123123
*/
public class symmetry {
    public static void main(String[] args) {
        //使用stringBuilder的场景：
        //1.字符串的拼接
        //2.字符串的反转

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.next();
        //2.调用方法判断是否是对称字符串
        if(isSymmetry(line)){
            System.out.println("是");
        }else{
            System.out.println("否");
        }
        }
    //2.定义一个方法，判断是否是对称字符串
    public static boolean isSymmetry(String line){
        //3.将字符串反转
        //链式编程
        String reverse = new StringBuilder().append(line).reverse().toString();
        /*
        //new 对象
        StringBuilder sb = new StringBuilder();
        //添加元素
        sb.append(line);
        //反转
        sb.reverse();
        //变回字符串
         sb.toString();

         */


        if(line.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }

}

