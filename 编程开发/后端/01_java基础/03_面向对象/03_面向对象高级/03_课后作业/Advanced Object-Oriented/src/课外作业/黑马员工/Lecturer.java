package 课外作业.黑马员工;

/**
 * ClassName: Lecturer
 * Package: 课外作业.黑马员工
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 09:55
 * @Version: v1.0
 *
 */
public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }
    //重写方法

    @Override
    public void work() {
        System.out.println("讲师讲课");
    }
}
