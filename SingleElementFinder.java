class SingleElementFinder {

    public int getSingleElement(int[] arr) {
        int xorr = 0;

        for (int num : arr) {
            xorr ^= num;
        }

        return xorr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        SingleElementFinder obj = new SingleElementFinder();
        int ans = obj.getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}