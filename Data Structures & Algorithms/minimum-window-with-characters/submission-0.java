class Solution {

    // ye helper function check karega ki have[] mein need[] ke hisab se sab values >= hain ya nahi
    public static boolean isValid(int[] have, int[] need) {
        for(int i = 0; i < 256; i++) {
            if(have[i] < need[i]) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n < m) return "";  // agar s chota hai t se — possible hi nahi

        int[] have = new int[256]; // frequency table for current window
        int[] need = new int[256]; // frequency table for required chars

        // fill need[] using characters from t
        for(int i = 0; i < m; i++) {
            need[t.charAt(i)]++;
        }

        int low = 0, high = 0;
        int res = Integer.MAX_VALUE;
        int start = -1;

        for(high = 0; high < n; high++) {
            have[s.charAt(high)]++;

            // jab tak window valid hai, shrink it from left
            while(isValid(have, need)) {
                int len = high - low + 1;

                if(res > len) {
                    res = len;
                    start = low;
                }

                have[s.charAt(low)]--;  // window shrink
                low++;
            }
        }

        if(res == Integer.MAX_VALUE) return "";
        return s.substring(start, start + res);
    }
}
