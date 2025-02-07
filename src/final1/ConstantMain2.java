package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " +Constant.MAX_USERS);
        int currentUserCount = 99;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    public static void process(int currentUserCount) {
        System.out.println("참여자 수 : " +currentUserCount);
        if(currentUserCount > Constant.MAX_USERS){
            System.out.println("대기자로 등록됩니다.");
        }else{
            System.out.println("참여자로 등록됩니다.");
        }
    }

}
