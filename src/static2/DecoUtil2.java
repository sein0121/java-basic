package static2;

public class DecoUtil2 {
    public static String deco(String str){ //정적 메서드 : 인스턴스 생성 없이 클래스로 바로 호출 가능
        String result = "*" + str + "*";
        return result;
    }
}
