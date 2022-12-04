public class Mobile {
	    private String mobileN= "Samsung";	    		
	    private int mobileModel;
		private boolean andriod;
		private int available;   // get & set
			
		Mobile(int Model, boolean andriod, int available ){
			this.mobileModel =Model;
			this.andriod = andriod;
			this.available = available;
	}
   public int  getAvailable(){                          // accessor method
	   return available;   	
    }
   public void setAvailable(int available) {                  // mutator
	   this.available = available;
   }
  
  public int getMobileModel() {
		return mobileModel;
}
  
  public void checkMobileInfo() {	   
	   if(mobileN.equals("Samsung") && andriod) {
		   mobileN="Samsung";     	     
		}  else {
			mobileN="Apple  ";
		}
	   System.out.println("Mobile name : "+ mobileN + " mobileModel : S" + mobileModel + " andriod : " + andriod + "  total available : " + available);
  }
}
