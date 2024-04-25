package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        int total;
        ProductOrder[] productOrders = {
                createOrder("사과",2000,3),
                createOrder("바나나",1000,7)
        };
        printOrder(productOrders);
        total= getTotal(productOrders);
        System.out.println("총 금액 : "+total);

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
