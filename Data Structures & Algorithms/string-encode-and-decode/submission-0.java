class Solution {

    public String encode(List<String> strs) {
 StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length()); // store length
            encoded.append('#');          // separator
            encoded.append(str);          // actual string
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        int n = str.length();

        while (i < n) {
            int len = 0;

            // Read length
            while (str.charAt(i) != '#') {
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }

            i++; // skip '#'

            // Read actual string
            String temp = str.substring(i, i + len);
            result.add(temp);

            i += len;
        }

        return result;
    }
}
