package static2.ex;

public class MathArrayUtils {
    private int[] array;

    public static int sum(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total = total + values[i];
        }
        return total;
    }

    public static double average(int[] values){
        return (double) sum(values) / values.length;
    }

    public static int min (int[] values) {
        int minValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                values[i] = minValue;
            }
        }
        return minValue;
    }

    public static int max (int[] values) {
        int maxValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }
}
