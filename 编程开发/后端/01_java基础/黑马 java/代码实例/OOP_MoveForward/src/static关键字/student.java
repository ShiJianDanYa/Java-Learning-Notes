package static关键字;

/**
 * ClassName: student
 * Package: static关键字
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/14 - 17:24
 * @Version: v1.0
 *
 */
public class student {
    /*
    学生有如下属性：姓名，年龄，老师
    一个班级中，所有学生都是共享同一个老师
    第一名学生：小诗诗，19岁
    第二名学生：小丹丹，20岁
    最初都是小雯老师上课，有一天小丹丹申请换老师，换成了阿玮老师
    */
    //姓名
    private String name;
    //年龄
    private int age;
    //老师姓名
    //static 是否添加的先觉条件(是否被所有对象共享)
    static String teacher;

    //构造方法

    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //获取/修改方法

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

    public static String getTeacher() {
        return teacher;
    }

    public static void setTeacher(String teacher) {
        student.teacher = teacher;
    }
}
