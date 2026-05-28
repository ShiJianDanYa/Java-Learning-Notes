package ch03课外作业.ch01继承.ch05物流快递费;

/**
 * ClassName: Expressage
 * Package: 课外作业.快递费计算
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/21 - 12:05
 * @Version: v1.0
 *
 */
public class Expressage {
    //属性
    private String singleNumber ;
    private int weight ;
    private String recipient ;
    //构造

    public Expressage() {
    }

    public Expressage(String singleNumber, int weight, String recipient) {
        this.singleNumber = singleNumber;
        this.weight = weight;
        this.recipient = recipient;
    }
    //set/ get

    public String getSingleNumber() {
        return singleNumber;
    }

    public void setSingleNumber(String singleNumber) {
        this.singleNumber = singleNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    //行为
    public int Calculate(){
        return weight * 10;
    }
}
