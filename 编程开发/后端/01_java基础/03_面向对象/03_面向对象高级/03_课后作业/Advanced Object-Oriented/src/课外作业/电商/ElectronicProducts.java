package 课外作业.电商;

/**
 * ClassName: ElectronicProducts
 * Package: 课外作业.电商
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 11:29
 * @Version: v1.0
 *
 */
public class ElectronicProducts extends Commodity{
    //增加属性
    private String brand;
    private String model;
    //构造
    public ElectronicProducts() {

    }
    public ElectronicProducts(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }
    //get和set
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    //重写方法
    @Override
    public void showlnfo() {
        System.out.println("商品名称："+getName()+" 价格："+getPrice()+" 品牌："+brand+" 型号："+model);
    }
}
