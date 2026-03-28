package fianl关键字.课堂练习.常量;

/**
 * ClassName: FianlTest
 * Package: fianl关键字.课堂练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/17 - 20:24
 * @Version: v1.0
 *
 */
public class FianlTest {
    /*
    final 修饰变量，此时叫做常量
    特点1：只能被赋值一次，一旦赋值，无法再次修改。
    特点2：常量名大写，多个单词之间用下划线隔开

    细节：
        基本数据类型：
            byte short int long float double char boolean
            变量里面记录的是真实的数据
            final int a=10；此时变量里面记录的数据无法发生改变
        引用数据类型：
            除了上面四类八种，其他所有的数据类型都是引用类型
            int[] Student Teacher...
            stu里面的记录对象的内存地址，不可改变的是stu记录的内存地址
            而对象里面的属性值，是可以发生改变
            final Student stu = new Student();
        综上所述：
            final修饰哪个变量，这个变量里面记录的内容就无法再次发生改变
    */
    public static void main(String[] args){
        //定义一个常量
        final int NUMBER = 100;
        //更改值
        //NUMBER = 200;

        //引用数据类型
        /*final Student stu = new Student("张三",18,"男");*/
        //修改对象地址值 报错
        //Student stu = new Student("李四",24,"男");

        //修改对象属性
        /*stu.setName("小芳");
        stu.setAge(19);
        stu.setSchool("女");*/
        //空参构造
        Student stu = new Student();

        //修改属性
        //stu.setName("小芳");

        //输出
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getSchool());
    }
}
