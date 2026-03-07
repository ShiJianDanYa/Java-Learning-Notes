package 练习.面向对象.女朋友01;

/**
 * ClassName: Girlfriend01
 * Package: 练习.面向对象
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/522:51
 * @Version1.0
 */
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class Girlfriend01 {
    //女朋友属性
    private String name;
    private int age;
    //私有化成员变量，需要提供get/set方法
    //get给成员变量赋值
    //set获取成员变量的值
    public void setName(String name){
        //成员变量和方法的变量名相同，
        //使用this关键字区分
        // this.name是成员变量，name局部变量
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
