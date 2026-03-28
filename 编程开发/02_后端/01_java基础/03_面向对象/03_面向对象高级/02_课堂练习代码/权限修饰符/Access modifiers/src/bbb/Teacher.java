package bbb;

import aaa.Person;

/**
 * ClassName: Teacher
 * Package: bbb
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/27 - 16:58
 * @Version: v1.0
 *
 */
public class Teacher extends Person {
    //不同包下的子类
    public void show(){
        System.out.println(name);
        super.test();
    }
}
