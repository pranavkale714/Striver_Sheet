class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubledS = s + s;
        return doubledS.contains(goal);
    }

    public static void main(String[] args) {
        RotateString obj = new RotateString();
        System.out.println(obj.rotateString("rotation", "tionrota"));
    }
}
