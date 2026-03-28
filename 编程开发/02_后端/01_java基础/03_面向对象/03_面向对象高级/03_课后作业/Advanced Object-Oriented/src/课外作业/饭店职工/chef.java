package 课外作业.饭店职工;

/**
 * ClassName: chef
 * Package: 课外作业.餐饮菜品推荐
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 09:06
 * @Version: v1.0
 *
 */
public class chef extends staff {
    public chef() {
    }

    public chef(int job, String name, double salary) {
        super(job, name, salary);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
