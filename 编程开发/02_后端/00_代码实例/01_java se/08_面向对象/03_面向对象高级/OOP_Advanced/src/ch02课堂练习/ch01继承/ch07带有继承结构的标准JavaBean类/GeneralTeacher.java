package ch02课堂练习.ch01继承.ch07带有继承结构的标准JavaBean类;

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

    public GeneralTeacher(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("通识课老师正在教授通识知识");
    }
}
