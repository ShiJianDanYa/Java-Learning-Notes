package 自我练习.字符串.案例01打乱字符串;

import java.util.Scanner;

/**
 * ClassName: disorganize
 * Package: 自我练习.字符串.案例03打乱字符串
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1211:20
 * @Version1.0
 */
    
    /*
    需求如下 键盘输入任意字符串，打乱里面的内容
*/
public class disorganize {
    public static void main(String[] args) {
        //⌨️输入任意字符串
        System.out.println("请输入任意字符串");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        /*打乱里面的内容
        修改字符串里面的内容：
        1.substring
        2.变成字符数组
         */
        //变成字符数组
        char[] chars = s.toCharArray();
        //开始打乱 每一个元素都跟随机索引交换位置
        chars = disor(chars);
        //字符数组变回字符串
        String s1 = new String(chars);
        //输出
        System.out.println(s1);



        System.out.println("程序结束");
    }
    //定义一个方法，用来打乱字符串
    public static char[]  disor(char[] c){
        for(int i=0;i<c.length;i++){
            //随机索引
            int index = (int) (Math.random()*c.length);
            //交换
            char temp = c[i];
            c[i] = c[index];
            c[index] = temp;
        }
        return c;
    }
}
