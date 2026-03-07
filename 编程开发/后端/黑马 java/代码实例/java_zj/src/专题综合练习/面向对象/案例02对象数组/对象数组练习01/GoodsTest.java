package 专题综合练习.面向对象.案例02对象数组.对象数组练习01;

/**
 * ClassName: GoodsTest
 * Package: 专题综合练习.面向对象.案例02对象数组
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/810:43
 * @Version1.0
 */
    
    /*
        定义数组存储3个商品对象。
        商品的属性：商品的id，名字，价格，库存。
        创建三个商品对象，并把商品对象存入到数组当中
*/
public class GoodsTest {
    public static void main(String[] args)
    {
        //创建数组
        Goods[] goods = new Goods[3];
        //开始创建商品对象
        Goods g1 = new Goods(001, "小米手机", 5999, 100);
        Goods g2 = new Goods(002, "苹果平板", 3999, 100);
        Goods g3 = new Goods(003, "机械革命笔记本", 1999, 100);
        //将商品添加到数组中
        goods[0] = g1;
        goods[1] = g2;
        goods[2] = g3;

        //遍历数组
        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getId() + "," + goods[i].getName() + "," + goods[i].getPrice() + "," + goods[i].getStock());
        }


    }
}
