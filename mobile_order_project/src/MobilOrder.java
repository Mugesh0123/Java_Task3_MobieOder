import java.util.Scanner;
import java.util.ArrayList;

public class MobilOrder {
//static Scanner myOdr = new Scanner (System.in);
	public static void main(String[] args) {		 
		ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
		ArrayList<Order> orders = new ArrayList<Order>();
		mobiles.add(new Mobile(1, true,2));
		mobiles.add(new Mobile(2, false,1));
		mobiles.add(new Mobile(3, true,2));
		mobiles.add(new Mobile(4, false,2));
		System.out.println("Ramnad Mobile Store");
		int userCheck=1;
		for(Mobile m:mobiles) {
			m.checkMobileInfo();
		}
		while(userCheck == 1) {
		Scanner myOdr1 = new Scanner (System.in);
		System.out.println("Order Enter 1 Or Exit Enter 2");
		userCheck = myOdr1.nextInt();
		if (userCheck == 1) {
			Order order = new Order();
			if(order.isAvailable(orders,mobiles)) {
				orders.add(order);
				System.out.println("Done, You are order is confirm");
				
			}else {
				System.out.println("Sorry, You are order is currently not available");
			}
		}
		System.out.println("Dear Customer, Thanks For Visiting Our Mobile Shop.");
		}

	}

}
//TODO Auto-generated method stub
		//Mobile moblie[]= new Mobile[20]; 