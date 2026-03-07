package 练习.字符串.遍历字符串02;

import java.util.Scanner;

/**
 * ClassName: StringDemo
 * Package: 练习.字符串.遍历字符串02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1116:54
 * @Version1.0
 */
    
    /*
    需求如下 键盘输入一个字符串 遍历该字符串
    1. 
    2.
    3. 
*/
public class StringDemo {
    public static void main(String[] args) {
        //键盘录入字符串
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //遍历字符串
       for (int i = 0; i < s.length(); i++) {
           System.out.println("第"+(i+1)+"个字符是"+s.charAt(i));
       }
    }
}
