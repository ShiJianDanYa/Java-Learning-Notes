package 课外作业.黑马员工;

/**
 * ClassName: Tutor
 * Package: 课外作业.黑马员工
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 10:21
 * @Version: v1.0
 *
 */
public class Tutor extends Teacher{
    public Tutor() {
    }
    public Tutor(int id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("助教工作帮助老师");
    }
}
