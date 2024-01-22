package poly.basic;


// 업캐스팅 vs 다운캐스팅
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child; // 업캐스팅은 생략이 가능. 생략 권장
        Parent parent2 = (Parent) child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
