class TimeMap {
    class Data {
        int timestamp;
        String value;
        public Data(String value, int timestamp) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    Map<String, List<Data>> m;

    public TimeMap() {
        m = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!m.containsKey(key))
            m.put(key, new ArrayList<>());
        m.get(key).add(new Data(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!m.containsKey(key))
            return "";
        List<Data> list = m.get(key);
        return findClosest(list, timestamp);
    }

    public String findClosest(List<Data> list, int t) {
        int low = 0, high = list.size() - 1;
        String result = "";
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid).timestamp <= t) {
                result = list.get(mid).value;
                low = mid + 1;   // try to find a later valid timestamp
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}