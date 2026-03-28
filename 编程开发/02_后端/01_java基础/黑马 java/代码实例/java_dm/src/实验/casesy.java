package 实验;

public class casesy {
    public static void main(String[] args){
        //break 不写 后面语句执行情况
        int a = 97;
        switch(a){
            case 99:
                System.out.println("第一句被执行");
            case 98:
                System.out.println("第二句被执行");
            case 97:
                System.out.println("第三句被执行");
            case 96:
                System.out.println("第四句被执行");
            case 95:
                System.out.println("break");
                break;
            default:
                System.out.println("都没执行");
        }
    }
}
