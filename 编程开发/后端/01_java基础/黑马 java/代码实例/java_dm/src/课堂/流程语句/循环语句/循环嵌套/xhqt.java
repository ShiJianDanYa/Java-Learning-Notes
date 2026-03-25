package 课堂.流程语句.循环语句.循环嵌套;

public class xhqt {
    public static void main(String[] args) {
        //外面控制行数
        for (int i = 0; i < 5; i++) {
            //里面控制列数
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
