package fianl关键字.课堂练习.常量;

/**
 * ClassName: Student
 * Package: fianl关键字.课堂练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/17 - 20:37
 * @Version: v1.0
 *
 */
public class Student {
    final String name="张三";
    final int age=23;
    final String school="男";

    public Student() {
    }

    /*public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }*/

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public int getAge() {
        return age;
    }

    /*public void setAge(int age) {
        this.age = age;
    }*/

    public String getSchool() {
        return school;
    }

    /*public void setSchool(String school) {
        this.school = school;
    }*/
}
