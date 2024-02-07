import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Order {
    private String itemName, orderID;
    private int orderNum;
    private double unitPrice;
    private int quantity;
    private double discount;
    private double total;

    public Order(String itemName, String orderID, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.orderID = orderID;
        this.orderNum = Integer.parseInt(orderID.substring(1,4));
        this.unitPrice = unitPrice;
        this.quantity = quantity;

        int discountType = Character.getNumericValue(orderID.charAt(4));
        if (discountType==1) {
            this.discount = 0.5*unitPrice*quantity;
        }else if(discountType==2) {
            this.discount = 0.3*unitPrice*quantity;
        }
        this.total = unitPrice*quantity-discount;
    }

    @Override
    public String toString() {
        return itemName + " " + orderID + " " + String.format("%03d", orderNum) + " " + (int) discount + " " + (int) total;
    }
}
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        List<Order> ds = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String itemName = scanner.nextLine();
            String orderID = scanner.nextLine();
            double unitPrice = scanner.nextDouble();
            int quantity = scanner.nextInt();
            scanner.nextLine();
            ds.add(new Order(itemName, orderID, unitPrice, quantity));
        }
        for (Order x : ds) {
            System.out.println(x);
        }
    }
}
