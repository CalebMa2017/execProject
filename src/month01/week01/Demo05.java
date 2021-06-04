package month01.week01;

public class Demo05 {

}
class Demo5Class {
    public final int finnum;
    private int num;
    public static final String str;
    public static int staticnum;

    public Demo5Class(int finnum, int num) {
        this.finnum = finnum;
        this.num = num;
    }
    {
        staticnum = 3;
    }
    static{
        str="string";
    }
}
