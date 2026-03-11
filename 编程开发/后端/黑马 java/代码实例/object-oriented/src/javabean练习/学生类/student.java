package javabean练习.学生类;

/**
 * ClassName: student
 * Package: javabean练习.学生类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/11 - 21:22
 * @Version: v1.0
 *
 */
public class student {
    //属性:姓名,年龄
    private String name;
    private int age;
    //构造方法
    public student(){
    }
    //全参构造
    public student(String name,int age){
        this.name = name;
        this.age = age;

    }
    //setter和getter方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    //方法 学习 吃饭 睡觉
    public void study(){
        System.out.println("学习");
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
