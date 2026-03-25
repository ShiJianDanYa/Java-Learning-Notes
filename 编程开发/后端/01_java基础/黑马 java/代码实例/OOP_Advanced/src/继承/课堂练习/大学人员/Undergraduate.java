package 继承.课堂练习.大学人员;

/**
 * ClassName: Undergraduate
 * Package: 继承.课堂练习.大学人员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 17:18
 * @Version: v1.0
 *
 */
public class Undergraduate extends  Student{
    //私有化 成员变量 无 没有独有
    //构造方法
    //空参构造
    public Undergraduate() {
    }
    //全参构造(间接父类+直接父类+自己)
    public Undergraduate(int age, String name, String grade) {
        super(age, name, grade);
    }
    //set/get方法
    //重写方法

    @Override
    public void study() {
        System.out.println("本科学生在学习本科内容");
    }
}
