package static2.ex;

public class MathArrayUtils {
    public static int sum(int[] values){
        int sum=0;
        for(int i: values){
            sum+=i;
        }
        return sum;
    }
    public static float average(int[] values){
        float average=0;
        average = sum(values)/values.length;

        return average;
    }

    public static int min(int[] values){
        int min=values[0];
        for(int i:values){
            if(i<min){
                min=i;
            }
        }
        return min;
    }

    public static int max(int[] values){
        int max = values[0];
        for(int i:values){
            if(max<i) {
                max = i;
            }
        }
        return max;
    }
}
