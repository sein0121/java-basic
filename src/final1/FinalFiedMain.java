package final1;

public class FinalFiedMain {
    public static void main(String[] args) {
        //final 필드 -생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        //값을 바꿀 수 없음
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수 - 자바에서는 static final이 붙은 변수를 상수라고 칭한다., 바뀌지 않는 공용변수
        System.out.println("상수 초기화");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
