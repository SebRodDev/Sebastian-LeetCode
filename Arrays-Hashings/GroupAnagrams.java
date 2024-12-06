class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> list = new HashMap<>();

        for (String s : strs) {
            char[] sToChar = s.toCharArray();

            Arrays.sort(sToChar);
            String convertedString = new String(sToChar);

            if (!list.containsKey(convertedString)) {
                list.put(convertedString, new ArrayList<>());
            }
            
            list.get(convertedString).add(s);
        }

        return new ArrayList<>(list.values());
    }
}
