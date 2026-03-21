package 课外作业.电商;

/**
 * ClassName: Clothing
 * Package: 课外作业.电商
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 11:49
 * @Version: v1.0
 *
 */
public class Clothing extends  Commodity{
    //私有属性
    private String size;
    private String color;
    //构造

    public Clothing() {
    }

    public Clothing(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    //get和set

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //重写方法
    @Override
    public void showlnfo() {
        System.out.println("商品名称: "+getName()+" 商品价格: "+getPrice()+" 商品尺寸: "+getSize()+" 商品颜色: "+getColor());
    }
}
