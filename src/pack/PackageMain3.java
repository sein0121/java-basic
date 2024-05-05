package pack;
//import pack.a.User;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User(); //import 사용으로 패키지명 생략가능
        pack.b.User userB = new pack.b.User();
    }
}
