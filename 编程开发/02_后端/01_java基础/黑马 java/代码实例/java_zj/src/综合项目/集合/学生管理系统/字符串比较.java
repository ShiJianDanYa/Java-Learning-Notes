package 综合项目.集合.学生管理系统;

import java.util.Scanner;

/**
 * ClassName: 字符串比较
 * Package: 综合项目.集合.学生管理系统
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1410:03
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class 字符串比较 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String cr =sc.next();
        if(cr.equals(0)){
            System.out.println("==");
        }else{
            System.out.println("!=");
        }
        System.out.println("程序结束");
    }
}
