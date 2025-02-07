package final1;

public class ConstructInit {
    final int value; // 이것만 하면 에러 남 -> 아래처럼 생성자를 통해서 넣어야함

    public ConstructInit(int value){
        this.value = value;
    }
}
