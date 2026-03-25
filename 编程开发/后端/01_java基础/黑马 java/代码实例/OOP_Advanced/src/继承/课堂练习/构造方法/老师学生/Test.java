package 继承.课堂练习.构造方法.老师学生;

/**
 * ClassName: Test
 * Package: 继承.课堂练习.构造方法.老师学生
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 09:01
 * @Version: v1.0
 *
 */
public class Test {
    /*
    学生:
    属性：姓名、年龄、年级

    老师:
    属性：姓名、年龄、学科

    继承体系中构造方法的小细节
    1. 子类构造方法第一行，有一个默认的super（），如果我们没有书写，JVM也会自动加上
    2. 如果想要访问父类的带参构造，super（参数）必须手动写上，不能省略
    3. 在创建对象的时候，先执行父类的构造方法，再执行子类的构造方法
    */
    public static void main(String[] args) {
        //创建对象
        Student s = new Student(18, "张三", "1班");
        System.out.println(s.name + " " + s.age + " " + s.className);
        System.out.println("---------------------------------------");
        Teacher t = new Teacher(18, "王五", "java");
        System.out.println(t.name + " " + t.age + " " + t.subject);
        System.out.println("---------------------------------------");
        Student s1 = new Student();

    }
}
