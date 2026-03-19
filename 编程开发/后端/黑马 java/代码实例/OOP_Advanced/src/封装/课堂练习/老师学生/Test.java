package 封装.课堂练习.老师学生;

/**
 * ClassName: Test
 * Package: 封装.课堂练习.老师学生
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/18 - 16:26
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args){
        //学生类
        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        s.grade = "高一";
        s.eat();
        s.study();
        System.out.println(s.name+" "+s.age+" "+s.grade);
        //老师类
        Teacher t = new Teacher();
        t.name = "王老师";
        t.age = 30;
        t.subject = "语文";
        t.eat();
        t.teach();
        System.out.println(t.name+" "+t.age+" "+t.subject);
    }
}
