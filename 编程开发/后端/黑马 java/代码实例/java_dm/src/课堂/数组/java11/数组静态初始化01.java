package 课堂.数组.java11;

/**
 * ClassName: 数组静态初始化01
 * Package: 课堂.数组.java11
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3119:26
 * @Version1.0
 */

/*
数组的静态初始化
 */
public class 数组静态初始化01 {
    public static void main(String[] args)
    {
        /*
        静态初始化
        格式： 课堂.数据类型[] 数组名 = new 课堂.数据类型[]{元素1,元素2,元素3...};
        简化格式： 课堂.数据类型[] 数组名 = {元素1,元素2,元素3...};
         */

        //存储五个学生的年龄
        int[] arr = new int[]{10,20,30,40,50};
        int []arr2= {10,20,30,40,50};
        //直接用数组名输出，输出的是地址
        System.out.println(arr);
        //结果 [I@b4c966a
        //含义 ：
        // [代表是一个数组
        // I代表int类型，
        // @间隔符号
        // b4c966a代表地址值]
        System.out.println("程序结束");
    }
}
