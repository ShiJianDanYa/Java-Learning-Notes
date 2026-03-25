package 课堂代码.面向对象.构造方法02;

/**
 * ClassName: Student
 * Package: 课堂代码.面向对象.构造方法02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/610:58
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class Student {
    //如果自己没写构造方法，那么系统会默认生成一个无参构造方法
    //一旦自己写了构造方法，系统就不再提供默认的无参构造方法
    /*public Student() {
        System.out.println("空参构造方法被调用了");
    }*/
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
  private String name;
  private int age;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age){
      this.age = age;
  }

}
