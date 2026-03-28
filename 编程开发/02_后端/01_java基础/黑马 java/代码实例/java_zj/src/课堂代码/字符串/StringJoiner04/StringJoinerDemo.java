package 课堂代码.字符串.StringJoiner04;

import java.util.StringJoiner;

/**
 * ClassName: StringJoinerDemo
 * Package: 课堂代码.字符串.StringJoiner04
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1122:21
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class StringJoinerDemo {
    public static void main(String[] args) {
        //创建一个StringJoiner对象
        StringJoiner sj = new StringJoiner(",", "[", "]");
        //添加元素
        sj.add("aaa").add("bbb").add("ccc");
        //输出
        System.out.println(sj);
        //个数
        System.out.println(sj.length());
        //转为字符串
        String s = sj.toString();
        System.out.println(s);

        System.out.println("程序结束");
    }
}
