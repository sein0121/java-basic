package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요:");
        int count = input.nextInt();
        input.nextLine();

        ProductOrder[] productOrders = new ProductOrder[count];

        for(int i =0; i<count;i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");

            System.out.print("상품명: " );
            String name = input.nextLine();

            System.out.print("가격: ");
            int price = input.nextInt();

            System.out.print("수량: ");
            int quantity = input.nextInt();

            input.nextLine(); // 입력 버퍼를 비우기 위한 코드

            productOrders[i]=createOrder(name, price, quantity);
        }

        printOrder(productOrders);
        int total= getTotal(productOrders);
        System.out.println("총금액 : "+total);

    }
    static ProductOrder createOrder(String name, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.name = name;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }
    static void printOrder(ProductOrder[] orders){

        for (ProductOrder order :orders){
            System.out.println("이름 : "+order.name +"  가격 : "+ order.price+ "   수량 : "+order.quantity);
        }
    }

    public static int  getTotal(ProductOrder[] orders){
        int total =0;
        for(ProductOrder order: orders){
            total += order.price*order.quantity;
        }
        return total;
    }
}
