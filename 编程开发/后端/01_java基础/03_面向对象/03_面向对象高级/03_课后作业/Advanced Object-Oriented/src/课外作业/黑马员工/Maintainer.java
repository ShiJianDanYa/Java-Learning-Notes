package 课外作业.黑马员工;

/**
 * ClassName: Maintainer
 * Package: 课外作业.黑马员工
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 10:23
 * @Version: v1.0
 *
 */
public class Maintainer extends AdminStaff{
    public Maintainer() {
    }
    public Maintainer(int id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("维护设备");
    }
}
