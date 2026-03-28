package 练习.集合.添加学生对象02;

/**
 * ClassName: student
 * Package: 练习.集合.添加学生对象02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1309:50
 * @Version1.0
 */
    
    /*
    定义一个集合，添加一些学生对象，并进行遍历
    学生类的属性为：姓名，年龄。

*/
public class student {
    private String name;
    private int age;
    public student() {
    }
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
