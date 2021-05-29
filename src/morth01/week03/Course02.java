package morth01.week03;

/**
 * 课堂练习
 */
public class Course02 {

    public static void main(String[] args) throws Exception{
        try {
//            System.exit(0);
            throw new Exception("抛出了异常");
        } finally {
            System.out.println("进行了处理");
        }
    }
}
