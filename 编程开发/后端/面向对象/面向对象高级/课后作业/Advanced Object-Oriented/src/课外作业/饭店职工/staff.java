package 课外作业.饭店职工;

/**
 * ClassName: staff
 * Package: 课外作业.餐饮菜品推荐
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 08:54
 * @Version: v1.0
 *
 */
public class staff {
    //员工 属性
    private int job;
    private String name;
    private double salary;
    //构造方法

    public staff() {
    }

    public staff(int job, String name, double salary) {
        this.job = job;
        this.name = name;
        this.salary = salary;
    }
    //set和get方法

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //行为
    public void work(){
        System.out.println("工作");
    }

    public void eat(){
        System.out.println("吃米饭");
    }
}
