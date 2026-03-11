package 构造方法.课堂练习;

/**
 * ClassName: student
 * Package: 构造方法.课堂练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/11 - 20:11
 * @Version: v1.0
 *
 */
public class student {
    //定义一个javabean类描述学生
    // 属性:姓名,年龄,性别,身高
    private String name;
    private int age;
    private char sex;
    private double height;
    //构造方法
    //习惯有两个
    //无参构造
    public student(){}
    //全参构造
    public student(String name,int age,char sex,double height){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;

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
    public void setSex(char sex){
        this.sex = sex;
    }
    public char getSex(){
        return sex;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

}
