package 继承.课堂练习.大学人员;

/**
 * ClassName: Person
 * Package: 继承.课堂练习.大学人员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 15:27
 * @Version: v1.0
 *
 */
public class Person {
    //标准的javaBean
    //属性
    private String name;
    private int age;
    //构造方法 空参构造 全参构造


    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //对应的get和set方法

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

    //行为
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
