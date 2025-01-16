package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
//        instanceValue ++; // 인스턴스 변수 접근 - 불가능
//        instanceMethod(); // 인스턴스 메서드 접근 - 불가능

        staticValue++; //정적 변수에 접근, 호출 가능
        staticMethod();

        //static 은 static만 호출가능
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();

        //instance는 instance, static 호출가능
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
        //static에서 instance 호출 가능하지만 여기 있는 data는 외부에 생긴 새로운 참조값
    }

    private void instanceMethod(){
        System.out.println("instanceValue=" + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue=" + staticValue);
    }
}
