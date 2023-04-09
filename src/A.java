public class A {
    void method(){
        System.out.println("a");
    }
}
class B extends A {
    void method(){
        System.out.println("b");
    }
}
class C extends B{
    void method(){
        System.out.println("c");
    }
}
class D extends C {
    void method(){
        System.out.println("d");
    }
}
class TestProgramme{
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();
        A d = new D();

        a.method();
        b.method();
        c.method();
        d.method();
    }
}