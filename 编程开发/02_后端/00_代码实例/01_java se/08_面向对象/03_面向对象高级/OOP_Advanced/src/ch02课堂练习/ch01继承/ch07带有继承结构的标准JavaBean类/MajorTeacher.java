package ch02课堂练习.ch01继承.ch07带有继承结构的标准JavaBean类;

/**
 * ClassName: MajorTeacher
 * Package: 继承.课堂练习.大学人员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 17:43
 * @Version: v1.0
 *
 */
public class MajorTeacher extends Teacher{
    //学科属性私有属性
    private String subject;
    //构造方法
    public MajorTeacher() {
    }

    public MajorTeacher(int age, String name, String subject) {
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

    @Override
    public void teach() {
        System.out.println("专业课老师正在传授"+subject+"课知识");
    }
}
