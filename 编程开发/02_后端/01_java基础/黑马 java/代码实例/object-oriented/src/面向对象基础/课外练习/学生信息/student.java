package 面向对象基础.课外练习.学生信息;

/**
 * ClassName: student
 * Package: 面向对象基础.课外练习.学生信息
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 21:33
 * @Version: v1.0
 *
 */
public class student {
    /*
    在校学生有属性：姓名、年龄、身高、体重。行为：学习。
    实现以下需求
    要求1：大一新生，张三，18岁，183cm，60kg，刚进大学努力学习。要求2：大二期间张三体重增加了10kg
    要求3：大三期间张三减肥成功，身高增加2cm，体重减少3kg要求4：打印大学毕业之后，张三的所有信息
    */
    //姓名
    private String name;
    //年龄
    private int age;
    //身高
    private double height;
    //体重
    private double weight;
    //提供 get/set方法
    //赋值方法
    //姓名
    public void setName(String value){
        name = value;
    }
    //年龄
    public void setAge(int value){age = value;}
    //身高
    public void setHeight(double value){height = value;}
    //体重
    public void setWeight(double value){weight = value;}
    //体重增减
    //增加
    public void gainWeight(double value){
        weight += value;
    }
    //减少
    public void clossOfWeight(double value){
        weight -= value;
    }
    //身高增加
    public void gainHeight(double value){
        height += value;
    }
    //获取方法
    //姓名
    public String getName(){
        return name;
    }
    //年龄
    public int getAge(){
        return age;
    }
    //身高
    public double getHeight(){
        return height;
    }
    //体重
    public double getWeight(){
        return weight;
    }
    //行为 学习
    public void study(){
        System.out.println("正在学习");
    }
}
