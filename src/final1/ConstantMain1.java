package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " +100);
        int currentUserCount = 99;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    public static void process(int currentUserCount) {
        System.out.println("참여자 수 : " +currentUserCount);
        if(currentUserCount>100){
            System.out.println("대기자로 등록됩니다.");
        }else{
            System.out.println("참여자로 등록됩니다.");
        }
    }

    //위의 코드에는 문제가 있다
    //1. 최대 참가자 수 수정이 번거롭다.
    //2. 한글로그가 없을 때 100이라는 숫자가 무엇을 의미하는지 모름 - 매직넘버

    //=> constantMain2 에 해결
}
