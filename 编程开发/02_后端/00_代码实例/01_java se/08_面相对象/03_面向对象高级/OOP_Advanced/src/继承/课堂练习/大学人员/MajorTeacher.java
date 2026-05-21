package 继承.课堂练习.大学人员;

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
    public MajorTeacher() {
    }

    public MajorTeacher(int age, String name, String subject) {
        super(age, name, subject);
    }

    @Override
    public void teach() {
        System.out.println("专业课老师正在传授专业课知识");
    }
}
