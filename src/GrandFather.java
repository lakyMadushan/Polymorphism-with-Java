public class GrandFather {
    void swim(){
        System.out.println("Swimming!");
    }
}
class Father extends GrandFather{
    void swim(){
        System.out.println("Swimming in river!");
    }
}
class Son extends Father{
    void swim(){
        System.out.println("Swimming in pool!");
    }

    public static void main(String[] args) {
        GrandFather gf,f, s;
        f = new Father(); //upcasting
        s = new Son();
        gf = new GrandFather();

        gf.swim();
        f.swim();
        s.swim();

    }
}
