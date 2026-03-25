package 继承.课堂练习.大学人员;

/**
 * ClassName: MatserStudent
 * Package: 继承.课堂练习.大学人员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 17:27
 * @Version: v1.0
 *
 */
public class MatserStudent extends  Student{

    //构造方法
    public MatserStudent() {
    }

    public MatserStudent(int age, String name, String grade) {
        super(age, name, grade);
    }
    //重写方法

    @Override
    public void study() {
        System.out.println("硕士研究生在学习硕士内容");
    }
    //睡觉 升级

    @Override
    public void sleep() {
        System.out.println("在豪华版学生公寓睡觉");
    }
}
