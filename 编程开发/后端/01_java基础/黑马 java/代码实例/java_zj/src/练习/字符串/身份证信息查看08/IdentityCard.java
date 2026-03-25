package 练习.字符串.身份证信息查看08;

/**
 * ClassName: IdentityCard
 * Package: 练习.字符串.身份证信息查看08
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1120:26
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class IdentityCard {
    public static void main(String[] args) {
        //定义一个身份证号
        String id = "321281202001011234";
        //截取年
        String s1 = id.substring(6,10);
        //截取月
        String s2 = id.substring(10,12);
        //截取日
        String s3 = id.substring(12,14);
        //截取性别
        //char s4 = (char)id.substring(16 , 17);
        char s4 = id.charAt(16);

        //利用ascii码进行截取
        //48为0的ascii码
        int sex = s4-48;
        sex = sex%2;
        String xb =(sex==0?"女":"男");
        //开始打印
        System.out.println("出生日期：" + s1 + "年"+ "-" + s2 + "月"+ "-" + s3+ "日"+"性别"+ xb);



        System.out.println("程序结束");
    }
}
