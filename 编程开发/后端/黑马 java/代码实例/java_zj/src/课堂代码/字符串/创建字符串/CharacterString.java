package 课堂代码.字符串.创建字符串;

/**
 * ClassName: CharacterString
 * Package: 课堂代码.字符串
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/916:23
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class CharacterString {
    public static void main(String[] args) {
        //字符串创建方式
        //1.直接赋值.
        String str1 = "abc";
        System.out.println(str1);
        System.out.println("===============");
        //使用new关键字
        //空参构造

        String str2 = new String();
        System.out.println(str2);
        System.out.println("===============");
        //有参构造
        String str3 = new String("abc");
        System.out.println(str3);
        System.out.println("===============");
        //传递一个字符数组
        char[]chars = {'a','b','c'};
        String str4 = new String(chars);
        System.out.println(str4);
        System.out.println("===============");
        //传递一个字节数组
        byte[]bytes = {97,98,99};
        String str5 = new String(bytes);
        System.out.println(str5);




        System.out.println("程序结束");
    }
}
