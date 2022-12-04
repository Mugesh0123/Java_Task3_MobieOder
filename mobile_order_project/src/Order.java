import java.util.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
public class Order {
//static Scanner myOdr = new Scanner(System.in);		
		String customerName;
		int mobileModel;
		
		 Order(){
			Scanner myOdrs = new Scanner(System.in);
			System.out.println("Enter The Customer Name : ");
			customerName =myOdrs.nextLine();
			System.out.println("Enter The Mobile Model S : ");
			mobileModel = myOdrs.nextInt();
		 }		
		public boolean isAvailable(ArrayList<Order> orders, ArrayList<Mobile> mobiles) {
			int available = 0;
			int buyed =0;
			for(Mobile mob:mobiles) {
				if (mob.getMobileModel() ==  mobileModel) {
					available = mob.getAvailable();
				}
				buyed =0;
				for (Order o:orders) {					 
					if (o.mobileModel == mobileModel) {  // && o.date.equals(date)
						buyed++;
						}
					}						
			}			
			return buyed<available?true:false;
		}
	}

//Date date;
//System.out.println("Enter date dd--mm--yyyy : ");
//String dateInput = myOdr.next();
//SimpleDateFormat dateFormat = new SimpleDateFormat("dd--MM--yyyy");
//try {
//	date = dateFormat.parse(dateInput);
//} catch (ParseException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}	