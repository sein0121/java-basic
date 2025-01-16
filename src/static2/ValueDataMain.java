package static2;

import oop1.ValueData;

public class ValueDataMain {
    public static void main(String[] args) { //static이기 때문에
        ValueData valueData = new ValueData();
        add(valueData);
    }
    static void add(ValueData valueData) {//static 으로 선언
        valueData.value++;
        System.out.println("숫자 증가 value=" + valueData.value);
    }
}
