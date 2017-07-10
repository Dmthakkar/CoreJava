package java6;

class Two {
    byte x;
}
public class passO {
    public static void main(String [] args) {
        passO p = new passO();
        p.start();
    }
    void start() {
        Two t = new Two();
        System.out.print(t.x + " ");
        Two t2 = fix(t);
        System.out.println(t.x + " " + t2.x);
    }
    Two fix(Two tt) {
        tt.x = 42;
        return tt;
    }
}