package poly.ex4;

public class Cow extends AbstractAnimal {
    @Override
    public void move() {
        System.out.println("소가 움직입니다.");
    }

    @Override
    public void sound() {
        System.out.println("음메");
    }
}
