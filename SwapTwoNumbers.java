class Solution {
    public int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        return new int[]{a, b};
    }
}
