package 练习.输出;

/**
 * ClassName: 输出_老师信息02
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2710:38
 * @Version1.0
 */
/*
练习 输出老师信息
姓名 黑马谢广坤
年龄 18
性别 男
身高 180.5
是否单身 是
 */
public class 输出_老师信息02 {
    public static void main(String[] args){

        //string 字符串 定义名字
        String xm ="黑马谢广坤";
        //整数 年龄
        int nl = 18;
        //字符 性别
        char xb = '男';
        //小数 定义身高
        double sg = 180.5;
        //布尔定义，是否单身
        boolean ds = true;

        System.out.println("信息如下");
        System.out.println("姓名"+xm);
        System.out.println("年龄"+nl);
        System.out.println("性别"+xb);
        System.out.println("身高"+sg);
        System.out.println("是否单身"+ds);


    }
}
