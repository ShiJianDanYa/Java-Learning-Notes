package ch12运算符.课堂练习.ch07三元运算符;

/**
 * ClassName: 运算_三元_三人最高08
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2811:59
 * @Version1.0
 */
/*
三个和尚 身高 210 165 150
求最高身高
 */
public class 三人最高 {
    public static void main(String[] args) {
        int a = 210,b = 165,c = 150;
        //这段代码的功能是找出三个整数 a、b 和 c 中的最大值，并将其打印到控制台。逻辑分解如下：
        //首先比较 a 和 b，如果 a > b，则继续比较 a 和 c，输出较大的值。
        //如果 a <= b，则比较 b 和 c，输出较大的值。
        //a>b?(a>c?a:c):(b>c?b:c)
        System.out.println(a>b?a>c?a:c:b>c?b:c);

    }
}
