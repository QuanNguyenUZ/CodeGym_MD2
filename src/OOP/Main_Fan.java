package OOP;
public class Main_Fan {
    public static void main(String[] args) {
        Class_Fan fan1 = new Class_Fan();
        fan1.setSpeed(Class_Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Class_Fan fan2 = new Class_Fan();
        fan2.setSpeed(Class_Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}
