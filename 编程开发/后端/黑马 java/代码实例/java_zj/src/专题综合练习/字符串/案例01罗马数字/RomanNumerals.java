package 专题综合练习.字符串.案例01罗马数字;

import java.util.Scanner;

/**
 * ClassName: RomanNumerals
 * Package: 专题综合练习.字符串.案例01罗马数字
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1209:42
 * @Version1.0
 */
/*
    键盘录入一个字符串，
    要求1：长度为小于等于9
    要求2：只能是数字
        将内容变成罗马数字
    下面是阿拉伯数字跟罗马数字的对比关系：
    I-1、II-2、III-3、IV-4、V-5、Vl-6、VIl-7、Vl-8、IX-9
    注意点：
    罗马数字里面是没有0的
    如果键盘录入的数字包含0，可以变成””(长度为0的字符串)
*/
public class RomanNumerals {
    public static void main(String[] args) {

        //开始录入数字
        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        //开始校验输入合法性
        String str;

        while(true){
             str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                //校验通过
                break;
            }
            System.out.println("输入不合法，请重新输入");
        }
        //查表法，转换为罗马数字
        String kong = "";
        StringBuilder sum = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c!='0'){
                sum.append(convertToRomanNumerals(c - '0'));
            }else{
                sum.setLength(0);
            }
        }
        System.out.println(sum);


        System.out.println("程序结束");
    }
    public static boolean checkStr(String str){
        //判断长度
        if(str.length()>9){
            return false;
        }
        //判断是否是数字
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
            //不能写在这里，这里只会次判断第一个字符
        }
        return true;
    }
    //查表法，转换为罗马数字
    public static String convertToRomanNumerals(int str) {
        String[] arr = {"", "Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ","Ⅹ"};
        return arr[str];
    }
}
