package 课堂.数据类型.字面量;

/**
 * ClassName: sjlx02
 * Package: 课堂.数据类型.java02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2615:41
 * @Version1.0
 */

public class sjlx02 {
    //叫做main方法 是程序的入口

        public static void main(String[] args){
            //目标：掌握数据类型在代码中如何书写

            //整数
            System.out.println(666);
            System.out.println(-777);

            //小数
            System.out.println(1.93);
            System.out.println(-3.71);

            //字符串
            System.out.println("你好啊，世界");

            //字符
            System.out.println('Ů');

            //布尔型
            System.out.println(true);
            System.out.println(false);

            //空类型
            System.out.println("null");
            //null 不能被直接打印，必须以字符串形式打印

            //\t 制表符 将前面字符串长度补齐到8 ，或者8的整数倍
            //自动补齐 长度 便于后面内容对齐 只会针对前面字符串
            System.out.println("8"+'\t'+"123");
            System.out.println("88"+'\t'+"12345");
            System.out.println("888"+'\t'+"123456");
            System.out.println("8888"+'\t'+"123456");

            System.out.println("--------------------------------------------------------");
            System.out.println("name"+'\t'+"age");
            System.out.println("tom"+'\t'+"23");

        }
    }
