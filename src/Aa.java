public class Aa {
    void method(){
    }
}class Bb extends Aa{
    void newMethod(){
    }
    void method(){
        System.out.println("aB");
    }
}
class Cc extends Bb{
    void method(){
        System.out.println("bC");
    }
    void newMethod(){
        System.out.println("Bc");
    }
}
class TestRun{
    public static void main(String[] args) {
        Aa a = new Aa();
        a.method();

        Aa b = new Bb();
        b.method();

        Aa c = new Cc();
        c.method();

        Bb bb = new Bb();
        bb.newMethod();

        Bb cc = new Cc();
        cc.newMethod();
    }
}
