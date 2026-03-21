package 课外作业.黑马员工;

/**
 * ClassName: Employee
 * Package: 课外作业.黑马员工
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 09:42
 * @Version: v1.0
 *
 */
public class Employee {
    //属性
    private int id;
    private String name;
    //构造 方法

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //get和set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //行为
    public void work(){
        System.out.println("员工在工作");
    }
}
