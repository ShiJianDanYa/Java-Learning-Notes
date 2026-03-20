package 继承.课堂练习.大学人员;

/**
 * ClassName: Student
 * Package: 继承.课堂练习.大学人员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 17:05
 * @Version: v1.0
 *
 */
public class Student extends Person{
    private String grade;

    //构造方法

    public Student() {
    }

    public Student(int age, String name, String grade) {
        super(age, name);
        this.grade = grade;
    }
    //get/set方法

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    //行为
    public void study(){
        System.out.println("学生正在学习");
    }
}
