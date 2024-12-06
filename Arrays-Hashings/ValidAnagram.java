class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sString = s.toCharArray();
        char[] tString = t.toCharArray();

        Arrays.sort(sString);
        Arrays.sort(tString);

        if (Arrays.equals(sString, tString) {
            return true;
        }

        return false;
    }
}
