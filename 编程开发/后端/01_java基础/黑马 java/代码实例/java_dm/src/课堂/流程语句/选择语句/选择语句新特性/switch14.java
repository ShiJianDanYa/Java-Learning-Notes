package 课堂.流程语句.选择语句.选择语句新特性;

public class switch14 {
    public static void main(String[] args) {
        int number = 9;

        //需要一个变量接受数据
        String name =switch(number){
            case 1,2,3,4,5 ->"工作日";
                default->"没有这个星期";
        //大括号后面还需要补一个分号
        };
        System.out.println(name);
    }
}
