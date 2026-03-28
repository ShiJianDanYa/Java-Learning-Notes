package 课外作业.黑马员工;

/**
 * ClassName: Test
 * Package: 课外作业.黑马员工
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 10:25
 * @Version: v1.0
 *
 */
public class Test {
   /*
   在黑马程序员中有很多员工(Employee)
    按照工作内容不同分教研部员工(Teacher)和行政部员工(AdminStaff)
    1.教研部根据教学的方式不同又分为讲师(Lecturer)和助教(Tutor)
    2.行政部根据负责事项不同,又分为维护专员(Maintainer),采购专员(Buyer)
    3.公司的每一个员工都编号，姓名和其负责的工作
    4.每个员工都有工作的功能，但是具体的工作内容又不一样
   */

    public static void main(String[] args) {
        //创建对象
        Lecturer l=new Lecturer();
        l.setName("张三");
        l.setId(2138);
        //输出
        System.out.println("员工编号："+l.getId());
        System.out.println("员工姓名："+l.getName());
        //调用方法
        l.work();
        System.out.println("-----------------------------");

        Tutor t=new Tutor();
        t.setName("李四");
        t.setId(523716);
        System.out.println("员工编号："+t.getId());
        System.out.println("员工姓名："+t.getName());
        t.work();
        System.out.println("-----------------------------");

        Buyer b=new Buyer();
        b.setName("王五");
        b.setId(529916);
        System.out.println("员工编号："+b.getId());
        System.out.println("员工姓名："+b.getName());
        b.work();
        System.out.println("-----------------------------");

        Maintainer m=new Maintainer();
        m.setName("赵六");
        m.setId(5454856);
        System.out.println("员工编号："+m.getId());
        System.out.println("员工姓名："+m.getName());
        m.work();

    }

}
