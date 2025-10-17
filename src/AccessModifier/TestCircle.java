package AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Bán kính: "+ c.getRadius());
        System.out.println("Diện tích: " + c.getArea());
    }
}
