class Solution {
    public int minBitsFlip(int start, int goal) {
        int xor = start ^ goal;

        return Integer.bitCount(xor);
    }
}
