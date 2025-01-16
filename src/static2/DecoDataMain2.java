package static2;

//import static static2.DecoData.staticCall;
import static static2.DecoData.*; //모든 메서드

public class DecoDataMain2 {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        //여러번 호출 시

        System.out.println("2.인스턴스 호출-인스턴스");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        System.out.println("3.인스턴스 호출-정적");
        staticCall();

        System.out.println("3.정적 호출-외부참조");
        staticCall(decoData);

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.instanceCall();

        //클래스를 통한 접근(이걸 추천)
        staticCall();
    }
}
