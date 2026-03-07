package 课堂代码.面向对象.构造方法02;

/**
 * ClassName: StudentTest
 * Package: 课堂代码.面向对象.构造方法02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/611:00
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class StudentTest {
    public static void main(String[] args) {
        // 创建对象
        //调用空参构造方法
//        Student s1 = new Student();
        //开始调用带参构造方法
        Student s1 = new Student("小明", 18);
        // 输出对象信息
        System.out.println("姓名：" + s1.getName() + ", 年龄：" + s1.getAge());
        System.out.println("程序结束");
    }
}
