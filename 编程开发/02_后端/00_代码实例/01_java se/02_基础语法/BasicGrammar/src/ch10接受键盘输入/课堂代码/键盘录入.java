package ch10接受键盘输入.课堂代码;

/**
 * ClassName: 键盘录入
 * Package: 课堂.键盘录入.java05
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2716:50
 * @Version1.0
 */
//课堂.键盘录入
//导包动作必须出现在类定义上面
import java.util.Scanner;
public class 键盘录入 {
    public static void main(String[] args) {
        // 创建对象  sc 是可变得 其他都是固定的
        Scanner sc = new Scanner(System.in);
        System.out.println("请为数据赋值，只能为整数");
        //接受数据 只有i 是可变得
        //i 接受你输入的数据
        int i = sc.nextInt();
        System.out.println("数据的值为"+i);
        //关闭Scanner
        sc.close();
        }
    }
