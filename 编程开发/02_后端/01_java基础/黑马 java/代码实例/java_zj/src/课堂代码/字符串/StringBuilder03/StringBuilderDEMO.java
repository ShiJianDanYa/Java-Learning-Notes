package 课堂代码.字符串.StringBuilder03;

/**
 * ClassName: StringBuilderDEMO
 * Package: 课堂代码.字符串.StringBuilder03
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1121:34
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class StringBuilderDEMO {
    public static void main(String[] args) {
        //创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder("abc");
        //输出
        //因为stringBuilder是Java已经写好的类
        //java在底层对他做了一些特殊处理。
        //打印对象不是地址值而是属性值。

        //添加元素
        sb.append("def");
        sb.append("123");
        sb.append(true);
        //反转
        sb.reverse();
        //获取长度
        int length = sb.length();
        System.out.println(length);
        //变回字符串
        String s = sb.toString();

        System.out.println(s);

        System.out.println("程序结束");
    }
}
