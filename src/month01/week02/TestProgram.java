package month01.week02;

public class TestProgram {
    public static void main(String[] args) {
        int a=2;
        int c = a+(a-=1)+a;
        a=2;
        int d =a+a+(a-=1)+a;
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}
