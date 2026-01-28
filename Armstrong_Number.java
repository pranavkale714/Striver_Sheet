public class Armstrong_Number {
    public static boolean Armstorngnumber(int n1) {
     
        int sum=0;
        int temp=n1;
        int digits = String.valueOf(n1).length();
  
        while(temp>0)
        {
        	int digit=temp%10;
        	sum=(int) (sum+Math.pow(digit,digits));
        	temp/=10;
        }
        if(n1==sum)
        {
        	return true;
        }
        else
        {
        	return false;
        }
       
    }

    public static void main(String[] args) {
        
    	int n1 = 8208;
    	if(Armstorngnumber(n1))
        {
        	System.out.println("Armstorngnumber number");
        }
        else
        {
        	System.out.println("Not Armstorngnumber number");
        }
        
    }
}
                            
