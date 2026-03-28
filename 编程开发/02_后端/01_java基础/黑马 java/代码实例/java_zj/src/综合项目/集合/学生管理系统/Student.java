package 综合项目.集合.学生管理系统;

/**
 * ClassName: Student
 * Package: 综合项目.集合.学生管理系统
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1311:11
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class Student  {
    /*学生类 属性如下
    * 1. id
    * 2.姓名
    * 3.年龄
    * 4.家庭住址
    * */
    private int id;
    private String name;
    private int phone;
    private String address;
    //空参构造
    public Student(){
    }
    //全参构造
    public Student(int id, String name, int phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
    //构造方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
