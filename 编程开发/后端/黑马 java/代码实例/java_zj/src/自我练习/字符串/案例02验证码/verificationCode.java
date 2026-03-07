package 自我练习.字符串.案例02验证码;

import java.util.Random;

/**
 * ClassName: verificationCode
 * Package: 自我练习.字符串.案例02验证码
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1211:33
 * @Version1.0
 */
    
    /*
    需求如下
    内容：可以是小写字母，也可以是大写字母，还可以是数字
    规则：
    长度为5
    内容中是四位字母，1位数字。
    其中数字只有1位，但是可以出现在任意的位置。
*/
public class verificationCode {
    public static void main(String[] args) {
        //创建字符数组
        char[] chs = new char[5];
        //前四位随机字母
        for(int i=0;i<chs.length-1;i++){
            //前四位随机字母
            //调用随机字母方法
            chs[i] = randomLetter();
        }
        //最后一位随机数字 ＋换位
        //调用随机数字方法
        chs = randomNumber(chs);
        //字符数组变成字符串
        String s = new String(chs);
        //输出
        System.out.println(s);
        System.out.println("程序结束");
        }
        //随机字母
        public static char randomLetter(){
            //随机索引
            Random Random = new Random();
            //随机两个数
            int a = Random.nextInt(100);
            int b = Random.nextInt(100);
            //大于等于b，返回小写字母，小于b返回大写字母
            if(a>=b){
            int index = (int) (Math.random()*26);
            return (char) ('a'+index);
            }else{
                int index = (int) (Math.random()*26);
                return (char) ('A'+index);
            }
            }
            //随机数字加换位
            public static char[] randomNumber(char[] arr){
                Random rd = new Random();
                int a = rd.nextInt(10);
                char b = (char)(a+'0');
                //随机数字赋值到最后一位
                arr[arr.length-1] = b;
                //随机索引
                int sy = rd.nextInt(arr.length-1);
                //开始交换
                char temp = arr[sy];
                arr[sy] = arr[arr.length-1];
                arr[arr.length-1] = temp;
                return arr;
            }

}
