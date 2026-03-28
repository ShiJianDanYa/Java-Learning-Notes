package 练习.字符串.统计字符串03;

import java.util.Scanner;

/**
 * ClassName: statistics
 * Package: 练习.字符串.统计字符串03
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1117:16
 * @Version1.0
 */
    
    /*
    需求如下
    键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
    1. 
    2.
    3. 
*/
public class statistics {
    public static void main(String[] args) {
        //键盘录入字符串
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        statistics(s);

        System.out.println("程序结束");
    }
    //开始判断
    public static void statistics(String s) {
        //计数器
        //大写
        int bigCount = 0;
        //小写
        int smallCount = 0;
        //数字
        int numberCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //字符参与运算式会直接转换为ASCII码表对应的值
            if(c>='A'&&c<='Z'){
                bigCount++;
            }else if(c>='a'&&c<='z'){
                smallCount++;

            }else if(c>='0'&&c<='9'){
                numberCount++;
            }else{
                System.out.println("输入的什么东西？");
            }
        }
        System.out.println("大写字母出现的个数为："+bigCount);
        System.out.println("小写字母出现的个数为："+smallCount);
        System.out.println("数字出现的个数为："+numberCount);
    }
}
