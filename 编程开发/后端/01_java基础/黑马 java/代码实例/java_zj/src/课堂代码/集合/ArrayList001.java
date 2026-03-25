package 课堂代码.集合;

import java.util.ArrayList;

/**
 * ClassName: ArrayList001
 * Package: 课堂代码.集合
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1309:18
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class ArrayList001 {
    public static void main(String[] args) {
        //创建集合对象
        //泛型 :限定集合中存储数据的类型
        //ArrayList<String> list = new ArrayList<String>();
        //jdk7以后 后面可以不写泛型
        ArrayList<String> list = new ArrayList<>();
        //此时我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
        //这个类在底层做了一些处理
        //打印对象不是地址值，而是集合中存储数据内容
        //在展示的时候会拿[门把所有的数据进行包裹
        System.out.println(list);
        //对元素修改
        //会返回一个boolean值,判断是否成功
        //添加元素
        //添加什么都会成功
        list.add("张三");
        list.add("李四");
        list.add("王五");
        //删除元素
        list.remove("王五");
        //删除会返回被删除元素
        System.out.println(list.remove(0));
        //修改元素
        //会返回被修改之前的元素
        System.out.println(list.set(0,"赵六"));
        //查询元素
        //会返回对应索引的元素
        System.out.println(list.get(0));
        //集合长度 遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("程序结束");
    }
}
