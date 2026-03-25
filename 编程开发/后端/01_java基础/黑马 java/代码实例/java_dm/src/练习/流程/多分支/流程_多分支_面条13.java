package 练习.流程.多分支;

        /**
        *ClassName: 流程_多分支_面条13
        *Package: 练习
        *Description:
        *@Author 锏箪
        *@Create 2025/3/2914:29
        *@Version1.0
        */
    /*
    吃面
    根据我的要求来判断吃什么
    1兰州拉面
    2武汉热干面
    3北京炸酱面
    4陕西油泼面
     */
    public class 流程_多分支_面条13 {
    public static void main(String[] args){
        System.out.println("");
        String mt = "武汉热干面";
        switch(mt){
            case "兰州拉面":
                System.out.println("兰州拉面");
                break;
                case "武汉热干面":
                    System.out.println("武汉热干面");
                    break;
                case "北京炸酱面":
                    System.out.println("北京炸酱面");
                    break;
                case "陕西油泼面":
                    System.out.println("陕西油泼面");
                    break;
                default:
                    System.out.println("吃皮带面吧你");
                    break;
        }
    }
}
