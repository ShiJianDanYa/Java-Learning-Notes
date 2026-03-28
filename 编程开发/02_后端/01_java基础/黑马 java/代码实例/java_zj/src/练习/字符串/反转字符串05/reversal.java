package 练习.字符串.反转字符串05;

import java.util.Scanner;

/**
 * ClassName: reversal
 * Package: 练习.字符串.反转字符串05
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1117:50
 * @Version1.0
 */
    
    /*
    需求如下
    定义一个方法，实现字符串反转。
    键盘录入一个字符串，调用该方法后，在控制台输出结果
    例如，键盘录入abc，输出结果cba
*/
public class reversal {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //调用方法
        String s1 = reversal(s);
        System.out.println("反转结果为："+s1);
    }
    //开始编反转
    public static String reversal(String s){
        //健壮性建设
        if(s == null){
            return "输入为空";
        }
        if(s.length() == 0){
            return "输入为空";
        }
        String s1 = "";
        for(int i = s.length()-1; i >= 0; i--){
            s1 = s1 + s.charAt(i-1);
        }
        return s1;
    }
}
