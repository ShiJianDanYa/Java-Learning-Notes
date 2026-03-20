package 继承.课堂练习.大学人员;

/**
 * ClassName: GeneralTeacher
 * Package: 继承.课堂练习.大学人员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 17:45
 * @Version: v1.0
 *
 */
public class GeneralTeacher extends  Teacher{
    public GeneralTeacher() {
    }

    public GeneralTeacher(int age, String name, String subject) {
        super(age, name, subject);
    }

    @Override
    public void teach() {
        System.out.println("通识课老师正在教授通识知识");
    }
}
