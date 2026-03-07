package 课堂.数据类型.数据类型格式;

/**
 * ClassName: variate
 * Package: 课堂.数据类型.java03
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2616:18
 * @Version1.0
 */

public class variate {
    public static void main(String[] args){
        /*
        课堂.数据类型（限制数据类型） 变量名（存储空间名字） = 数据值（实际存储的值）；
        int 整数 double 小数

        = 赋值 将右边的数据赋值给左边
         */
        //用法1 打印输出
        int a = 10;
        System.out.println(a);

        //用法2 参与计算
        int b = 20;
        int c = a + b;
        System.out.println("a+b的值为"+c);
        //用法3 修改记录的值
         c = 1999999;

         System.out.println("c的值为"+c);

         //变量注意事项
        //一条语句，可以定义多个变量
        int q = 100, w = 200 ,e = 300;
        System.out.println("q="+q+"\n"+"w="+w);

        //变量在使用之前一定要进行赋值
        int x;
        /*System.out.println(x);
        建议：定义变量时，直接进行赋值
         */


    }
}
