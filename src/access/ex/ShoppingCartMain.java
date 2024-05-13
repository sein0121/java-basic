package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("사과",1000,2);
        Item item2 = new Item("바나나",500,3);
        Item item3 = new Item("망고",3000,2);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);

        shoppingCart.displayItems();
    }
}
