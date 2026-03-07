package 练习.字符串.手机号屏蔽07;

/**
 * ClassName: perl
 * Package: 练习.字符串.手机号屏蔽07
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1120:19
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class perl {
    public static void main(String[] args) {
        //获取手机号码
        String phone = "13812345678";

        //开始截取号码前三位
        String s1 = phone.substring(0,3);
        //开始截取号码后四位
        String s2 = phone.substring(7);
        //开始拼接
        String s3 = s1 + "****" + s2;
        System.out.println(s3);


        System.out.println("程序结束");
    }
}
