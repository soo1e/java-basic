package access.ex;

public class MaxCounter {
    // 이 클래스는 최대값을 지정하고 최대값까지만 값이 증가하는 기능을 제공한다.

    private int count = 0;
    private int max;

    public MaxCounter (int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        count++;
    }

    public int getCount() {
        return count;
    }
}
