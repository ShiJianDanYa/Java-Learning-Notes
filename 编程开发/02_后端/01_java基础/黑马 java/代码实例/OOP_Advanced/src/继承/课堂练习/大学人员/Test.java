package 继承.课堂练习.大学人员;

/**
 * ClassName: Test
 * Package: 继承.课堂练习.大学人员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 15:25
 * @Version: v1.0
 *
 */
public class Test {
    /*
    本科学生：
    属性：姓名、年龄、年级
    行为：吃饭、睡觉、学习（攻读学士学位）
            !
    专业课老师：
    属性：姓名、年龄、学科
    行为：吃饭、睡觉、教书（教专业课知识）
    硕士研究生：
    属性：姓名、年龄、年级
    行为：吃饭、睡觉、学习（攻读硕士学位）
    通识课老师：
    属性：姓名、年龄
    行为：吃饭、睡觉、教书（教通识课知识)
    过了一段时间，硕士研究生住宿条件升级，在豪华版学生公寓睡觉
    */
    public static void main(String[] args) {
        MatserStudent ms = new MatserStudent(18,"张三","2023级");
        ms.study();
        ms.sleep();
        ms.eat();
        System.out.println(ms.getGrade());


        Undergraduate ug = new Undergraduate(18,"李四","2020级");
        ug.study();
        ug.sleep();
        ug.eat();
        System.out.println(ug.getGrade());

        GeneralTeacher gt = new GeneralTeacher(18,"王五","自然科学");
        gt.teach();
        gt.sleep();
        gt.eat();
        System.out.println(gt.getSubject());


        MajorTeacher mt = new MajorTeacher(18,"赵六","数学");
        mt.teach();
        mt.sleep();
        mt.eat();
        System.out.println(mt.getSubject());


    }
}
