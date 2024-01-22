package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 1. 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 2. 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 3. 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 부모 타입은 자식을 참조할 수 있다.
        poly.parentMethod();
    }
}
