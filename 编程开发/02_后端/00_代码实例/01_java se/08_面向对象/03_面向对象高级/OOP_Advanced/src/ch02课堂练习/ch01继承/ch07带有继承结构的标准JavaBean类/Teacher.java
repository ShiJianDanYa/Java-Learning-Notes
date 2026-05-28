package ch02课堂练习.ch01继承.ch07带有继承结构的标准JavaBean类;

/**
 * ClassName: Teacher
 * Package: 继承.课堂练习.大学人员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 17:12
 * @Version: v1.0
 *
 */
public class Teacher extends Person{
    //构造方法
    //空参构造
    public Teacher() {
    }
    //全参构造
    public Teacher(int age, String name) {
        super(age, name);
    }
    //行为
    public void teach(){
        System.out.println("老师正在教书");
    }
}
