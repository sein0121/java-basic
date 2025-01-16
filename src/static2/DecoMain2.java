package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello JAVA";

        String deco = DecoUtil2.deco(s); //static 때문에 바로 호출 가능

        System.out.println("before: "+s);
        System.out.println("after: "+deco);

    }
}
