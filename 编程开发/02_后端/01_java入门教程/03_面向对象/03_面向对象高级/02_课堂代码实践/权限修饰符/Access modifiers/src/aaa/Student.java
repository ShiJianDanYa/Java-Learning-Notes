package aaa;

/**
 * ClassName: Student
 * Package: aaa
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/27 - 16:58
 * @Version: v1.0
 *
 */
public class Student extends  Person{
    //本包子类
    //本包中的其他类(子类+无关类是一个逻辑)
    public void show(){
        System.out.println(name);
        super.test();
    }
}
