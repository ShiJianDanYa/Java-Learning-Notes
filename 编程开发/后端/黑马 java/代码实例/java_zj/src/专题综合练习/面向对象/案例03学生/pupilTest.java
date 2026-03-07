package 专题综合练习.面向对象.案例03学生;

/**
 * ClassName: pupilTest
 * Package: 专题综合练习.面向对象.案例03学生
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/820:38
 * @Version1.0
 */

    /*
    定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，
    学生对象的学号，姓名各不相同。

    学生的属性：学号，姓名，年龄。
    要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
    要求2：添加完毕之后，遍历所有学生信息。
    要求3：通过id删除学生信息
    如果存在，则删除，如果不存在，则提示删除失败。
    要求4：删除完毕之后，遍历所有学生信息
    要求5：查询数组id为"heimae02"的学生，如果存在，则将他的年龄+1岁
*/
public class pupilTest {
    public static void main(String[] args) {
        //创建对象数组
        pupil[] p = new pupil[3];
        //创建学生对象
        pupil p1 = new pupil(1,"张三", 18 );
        pupil p2 = new pupil(2,"李四", 19 );
        pupil p3 = new pupil(3,"王五", 20);
        //添加到数组中
        p[0] = p1;
        p[1] = p2;
        //p[2] = p3;
        //开始完成要求
        //1添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        pupil p4 = new pupil(4,"赵六", 21);
        //先判断,学号是否重复存在
        if (contains(p,p4.getId())){
            //不存在,添加到数组中,判断数组是否存满
            if (getCount(p) < p.length) {
                //判断数组是否存满
                 p[getCount(p)]=p4;
                 //开始遍历数组
                 printPupil(p);

            }else{
                //创建一个新的数组  长度是原数组的长度+1
                //然后将原数组复制到新数组中
                pupil [] pp1 = creatNewArr(p);
                //将新数组赋值给原数组
                pp1[getCount(p)] = p4;
                //开始遍历数组
                printPupil(pp1);

            }

        }else{
            System.out.println("学号重复，添加失败");
        }
        //先判断,数组是否存满
        //开始遍历数组


        System.out.println("程序结束");
    }
    //存满创建新数组
    public static pupil[] creatNewArr(pupil[] pp){
        //创建一个新的数组  长度是原数组的长度+1
        pupil[] pp1 = new pupil[pp.length+1];
        //然后将原数组复制到新数组中
        for(int i = 0; i < pp.length; i++){
              pp1[i] = pp[i];
        }
        //返回新数组
        return pp1;
    }
    //判断数组是否存满
    public static int getCount(pupil[] pp){
        //定义一个计数器
        int count = 0;
        for(int i = 0; i < pp.length; i++){
            if (pp[i] != null) {
                count++;
            }
        }
        return count;
    }
    //遍历数组
    public static void printPupil(pupil[] p) {
        for (int i = 0; i < p.length; i++) {
            pupil pupil = p[i];
            if (pupil != null) {
                System.out.println(pupil.getId() + "," + pupil.getName() + "," + pupil.getAge());
            }
        }
    }
        //判断唯一性

    public static boolean contains(pupil[] p, int id){
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                //判断学号是否重复
                if (p[i].getId() == id) {
                    return false;
                }

            }

        }
        //是所有的都不一样,才能确定没有重复的学号
        return true;
    }
}
