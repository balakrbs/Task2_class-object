package task2;
import java.util.*;

//Question no::1.2

public class XYZ {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		product[] products=new product[5];
		for(int i=0;i<5;i++) {
			System.out.println("\nEnter product "+(i+1)+" details");
			System.out.print("pid :");
			int pid=obj.nextInt();
			System.out.print("Price :");
			double price=obj.nextDouble();
			System.out.print("Quantity :");
			int quantity=obj.nextInt();
			products[i]=new product(pid,price,quantity);
		}
		
		int highprice=findhighprice(products);
		System.out.println("The highest price pid :"+highprice);
		double totalamt=totalamtspend(products);
		System.out.println("The Total Amount spend :"+totalamt);
		obj.close();
	}

	
private static int findhighprice(product[] products) {
	double maxPrice = products[0].getPrice();
    int maxPricePid = products[0].getPid();

    for (int i = 1; i < products.length; i++) {
        if (products[i].getPrice() > maxPrice) {
            maxPrice = products[i].getPrice();
            maxPricePid = products[i].getPid();
        }
    }

    return maxPricePid;
}
private static double totalamtspend(product[] products) {
	double totalamt=0;
	for(product product:products) {
		totalamt+=product.getPrice()*product.getQuantity();
		}
	return totalamt;
	
}
}


