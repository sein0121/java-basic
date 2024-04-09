package class1.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        int total =0;

        ProductOrder order1 = new ProductOrder();
        order1.name =  "사과";
        order1.price=2000;
        order1.quantity=3;

        ProductOrder order2 = new ProductOrder();
        order2.name =  "바나나";
        order2.price=1000;
        order2.quantity=7;

        ProductOrder[] orders = {order1,order2};

        for(ProductOrder o : orders){
            System.out.println("상품명:" +o.name+ "  가격:" +o.price+ "  수량:" +o.quantity);
            total += o.price*o.quantity;
        }
        System.out.println("총 금액: "+ total);

    }
}
