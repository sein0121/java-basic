package static2.ex;

public class CarAnswer {
    private static int totalCars;
    private String name;
    public CarAnswer(String name){
        System.out.println("차량 구입, 이름: "+ name);
        this.name=name;
        totalCars++;
    }
    public static void showTotalCars(){
        System.out.println("구매한 차량 수: "+ totalCars);
    }
}
