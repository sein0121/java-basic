package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1.  data = "+data);
        data = new Data();
        System.out.println("2.  data = "+data);
        data=null;
        // data 변수는 앞서 만든 Data 인스턴스를 더는 참조하지 않는다.
        System.out.println("3.  data = "+data);
    }
}
