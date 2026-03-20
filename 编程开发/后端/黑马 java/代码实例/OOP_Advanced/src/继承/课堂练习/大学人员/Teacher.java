package 继承.课堂练习.大学人员;

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
    //属性
    private String subject;
    //构造方法

    public Teacher() {

    }

    public Teacher(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }
    //get/set

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    //行为
    public void teach(){
        System.out.println("老师正在教书");
    }

}
