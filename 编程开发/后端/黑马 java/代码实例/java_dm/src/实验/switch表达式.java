package 实验;

/**
 * ClassName: switch表达式
 * Package: 实验
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/16 - 15:59
 * @Version: v1.0
 *
 */
public class switch表达式 {
    public static void main(String[] args){
        //switch表达式具体的值，是否可以是变量
        //可以 但是必须 是已经赋值，而且和case的值匹配
        int a = 3;
        switch(a){
            case 1:
                System.out.println("第一句被执行");
                break;
            case 2:
                System.out.println("第二句被执行");
                break;
            case 3:
                System.out.println("第三句被执行");
                break;
            case 4:
                System.out.println("第四句被执行");
                break;
            case 5:
                System.out.println("第五句被执行");
                break;
            default:
                System.out.println("都没执行");
            //确定default后面不添加break是否影响后面语句执行
            case 9:
                System.out.println("这是case 9");
        }
    }
}
