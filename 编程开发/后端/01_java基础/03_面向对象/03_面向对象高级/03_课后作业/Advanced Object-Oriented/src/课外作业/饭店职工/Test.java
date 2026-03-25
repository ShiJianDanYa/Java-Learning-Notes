package 课外作业.饭店职工;

/**
 * ClassName: Test
 * Package: 课外作业.餐饮菜品推荐
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 09:21
 * @Version: v1.0
 *
 */
public class Test {
    /*
    1.经理
    成员变量：工号，姓名，工资，管理奖金
    成员方法：工作（管理其他人），吃饭（吃米饭）

    2.厨师
    成员变量：工号，姓名，工资
    成员方法：工作(炒菜)，吃饭（吃米饭）
    */
    public static void main(String[] args) {
        //创建经理对象
        Manager s1 = new Manager(1234567890,"张三",5000,5000);
        //输出
        System.out.println("员工编号："+s1.getJob());
        System.out.println("员工姓名："+s1.getName());
        System.out.println("员工工资："+s1.getSalary());
        System.out.println("员工奖金："+s1.getBonus());
        s1.work();
        s1.eat();
        System.out.println("--------------------------------------------------");
        //创建厨师对象
        chef s2 = new chef(1234567891,"张三",5000);
        System.out.println("员工编号："+s2.getJob());
        System.out.println("员工姓名："+s2.getName());
        System.out.println("员工工资："+s2.getSalary());
        s2.work();
        s2.eat();

    }

}
