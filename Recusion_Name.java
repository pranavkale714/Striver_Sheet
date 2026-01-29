class Solution {
    
    public void printName(String name, int count, int N) {
        
        if(count==N)
        {
        	return;
        }
        System.out.println(name);

        printName(name,count+1,N);
    }
}

public class Recusion_Name {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        String name = "Pranav Kale";

        sol.printName(name, 0, N);
    }
}
