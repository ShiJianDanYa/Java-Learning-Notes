package 课外作业.黑马员工;

/**
 * ClassName: Buyer
 * Package: 课外作业.黑马员工
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 10:25
 * @Version: v1.0
 *
 */
public class Buyer extends AdminStaff{
    public Buyer() {
    }
    public Buyer(int id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("采购物品");
    }
}

