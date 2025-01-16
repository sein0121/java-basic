package static2.ex;

public class MathArrayUtilsAnswer {

    private MathArrayUtilsAnswer(){
        //생성을 하지 말아라, private 인스턴스 생성을 막는다
    }
    public static int sum(int[] values){
        int sum=0;
        for(int i: values){
            sum+=i;
        }
        return sum;
    }
    public static double average(int[] values){
        return (double) sum(values) / values.length;
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
