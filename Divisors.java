class Solution {
    public List<Integer> getDivisors(int N) {
     List<Integer> res=new ArrayList<>();
     
        for(int i=1;i<=N;i++)
        {
            if (N%i==0)
            {
            res.add(i);
            }
        }
    return res;
    }
}

public class Divisors {
    public static void main(String[] args) {

        Solution sol = new Solution();
        int N = 36;
        List<Integer> result = sol.getDivisors(N);
       
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
