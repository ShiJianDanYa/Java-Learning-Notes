package 课外作业.饭店职工;

/**
 * ClassName: Manager
 * Package: 课外作业.餐饮菜品推荐
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 09:01
 * @Version: v1.0
 *
 */
public class Manager extends staff {
    //经理特有属性 奖金
    double bonus;
    //构造方法
    public Manager() {
    }

    public Manager(int job, String name, double salary, double bonus) {
        super(job, name, salary);
        this.bonus = bonus;
    }
    //get和set方法

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //行为

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
