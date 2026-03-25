package 专题综合练习.面向对象.案例03学生;

/**
 * ClassName: pupil
 * Package: 专题综合练习.面向对象.案例03学生
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/820:34
 * @Version1.0
 */
    
    /*
   学生对象
*/
public class pupil {
    private int id;
    private String name;
    private int age;

    public pupil() {
    }

    public pupil(int id,String name, int age ) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
