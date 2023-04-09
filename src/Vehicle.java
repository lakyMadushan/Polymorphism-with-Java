public class Vehicle {
    void drive(){
        System.out.println("Drive Speed Limit 100kmph");
    }
}
class Car extends Vehicle{
    @Override
    void drive() {
        System.out.println("Drive Speed Limit 150kmph");
    }
}
class RunProgramme{
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle v = new Vehicle();

        c.drive();
        v.drive();
    }
}