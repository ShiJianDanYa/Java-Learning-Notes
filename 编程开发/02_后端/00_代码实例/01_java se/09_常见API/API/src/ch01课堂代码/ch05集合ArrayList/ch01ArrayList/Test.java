package ch01课堂代码.ch05集合ArrayList.ch01ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch05集合ArrayList.ch01ArrayList
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/3 - 15:20
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*ArrayList集合
		空参构造：
			ArrayList()         创建一个长度为0的集合
		常见方法：
		boolean add(E e)                                添加数据
		void add(int index, E e)                        添加数据
		boolean remove(E e)                         	删除元素
		E remove(int index)                             删除元素
		E set(int index,E e)                            修改元素
		E get(int index)                                获取元素
		int size()                                      集合长度
		*/

		//创建长度为0的ArrayList集合
		//int[] arr = new int[3]; --- int
		//问题：能判断集合中能存储什么类型的数据吗？
		//如果没有进行限定，此时集合里面可以存储任意数据类型的数据
		//泛型：限定集合当中的数据类型<数据类型>
		//ArrayList<String> list = new ArrayList<String>();
		//JDK7的时候，后面的泛型可以省略不写，但是见括号必须保留
		ArrayList<String> list = new ArrayList<>();

		System.out.println("============================================");
		//添加数据
		//细节1：ArrayList的add方法不管添加什么都添加成功，忽略返回值即可   true：添加成功 false:添加失败

		//此时add方法在任意情况下，都会添加成功，永远不会失败
		//因为在Java当中，有很多很多的集合HashSet（元素要唯一）  aaa(true) aaa(false)
		//设计：跟其他的集合保持统一（面向对象的思想）
		boolean hello = list.add("hello");
		System.out.println(hello);
		list.add("world");
		list.add("java");
		System.out.println(list);
		//细节2：如果集合长度为3，那么下面方法要添加的索引范围只能是0~3
		//0- 2已经存在的索引
		//3：把当前元素添加到集合的末尾，等同于一个参数的add方法
		//如果要添加的索引超出了这个范围，程序就会直接报错
		list.add(2,"插入");
		System.out.println(list);
		//非要求类型 直接报错
		//list.add(123);

		//细节3：在集合当中无法直接添加基本数据类型的（byte short int long float double char boolean）
		//只能添加引用数据类型（对象）
		//如果在集合里面一定要添加基本数据类型，那么可以转成其对应的包装类（下一个视频）
		System.out.println("============================================");

		//删除方法
		//boolean remove(E e)       根据元素删除
		//细节1：根据元素的内容进行删除的存在： 删除成功true         不存在：删除失败false
		boolean remove = list.remove("world");
		System.out.println(remove);
		System.out.println(list);
		//E remove(int index)       根据索引删除
		//细节2：根据索引进行删除的  会把被删除的元素进行返回  注意： 如果当前的索引不存在，代码会报错
		String remove1 = list.remove(1);
		System.out.println("删除元素为"+remove1);
		System.out.println(list);
		System.out.println("============================================");

		//E set(int index,E e)     将指定位置的数据，修改为新元素
		//细节1 ：把指定索引上的数据修改为新的数据，把被替换的元素进行返回 注意： 如果当前的索引不存在，代码会报错
		String set = list.set(1, "修改");
		System.out.println("被修改的元素为："+set);
		System.out.println(list);
		System.out.println("============================================");

		//E get(int index)                                获取元素
		//int size()                                      集合长度
		String get = list.get(1);
		System.out.println("获取的元素为："+get);
		System.out.println("集合长度为："+list.size());
		//集合遍历
		//遍历： get + size
		//遍历：把容器里面的数据一个一个的拿出来，打印，计算，处理
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		//只能看一看集合当中有什么，无法操作里面的每一个元素
		System.out.println( list);


	}
}
