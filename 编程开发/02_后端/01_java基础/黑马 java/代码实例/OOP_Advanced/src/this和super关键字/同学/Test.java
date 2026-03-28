package this和super关键字.同学;

/**
 * ClassName: Test
 * Package: this和super关键字.同学
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 10:38
 * @Version: v1.0
 *
 */
public class Test {
    /*
    按照下面的需求书写一个JavaBean学生：
    属性：姓名、年龄
    当我们在学校里面不认识一个同学的时候，都会称呼对方同学
    所以现在认为学生的默认名字为：同学，默认年龄为18岁

    this作用调用本类其他构造方法
    小细节
    1. 如果子类中有多个构造方法的时候，
    不能用this（）互动调用，一定要预留一个调用父类
    2. 如果构造方法当中写上了this（）,
    就不能再写super（），JVM也不会自动添加super（）：
    3. 在老版本中this（）只能写在构造方法第一行，
    但是在新版本当中去掉了这一限制
    */
    public static void main(String[] args){
        //创建对象
        Schoolmate sm = new Schoolmate();
        System.out.println(sm.name + " " + sm.age);


    }
}
