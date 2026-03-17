package 构造方法.注意事项;

/**
 * ClassName: matters
 * Package: 构造方法.注意事项
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/11 - 21:51
 * @Version: v1.0
 *
 */
public class matters {
    String name;
    int age;

    public matters() {
    }

    public matters(String name, int age) {
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
