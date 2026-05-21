package ch01课堂代码.ch01继承.ch01老师学生;

/**
 * ClassName: Teacher
 * Package: 封装.课堂练习.老师学生
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/18 - 16:09
 * @Version: v1.0
 *
 */
public class Teacher extends  Person{
    //也是子类特有内容
    //属性 学科
    String subject;

    //行为 教书
    public void teach(){
        System.out.println("教课");
    }
}
