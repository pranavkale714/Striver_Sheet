import java.util.*;

public class FrequencyCounter2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

    
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int key = arr[i]; 
            int currentFrequency = frequencyMap.getOrDefault(key, 0);

            currentFrequency++;
            frequencyMap.put(key, currentFrequency);
        }

        
        int q = sc.nextInt();

     
        while (q-- > 0) {

            int number = sc.nextInt(); 
            if (frequencyMap.containsKey(number)) {
                System.out.println(frequencyMap.get(number));
            } 
            else {
                System.out.println(0);
            }
        }

        sc.close(); 
    }
}
