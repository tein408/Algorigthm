package leetcode.medium;

import java.util.LinkedHashMap;

public class LC146 {

    LinkedHashMap<Integer, Integer> map;
    int size;

    //LRUCache
    public LC146(int capacity) {
        // initial capacity, load factor, accessOrder
        // accessOrder : true -> access 빈도가 낮은것부터 접근
        //               false -> 입력한 순서부터 접근
        map = new LinkedHashMap<>(capacity, 0.75f, true);
        size = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            int val = map.remove(key);
            map.put(key, val);
            return val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        map.put(key, value);

        // map 크기가 size 보다 크다면
        // map에서 가장 최근에 사용된 key 가져와서 그 key를 삭제
        if (map.size() > size) {
            int lastKey = map.keySet().iterator().next();
            map.remove(lastKey);
        }
    }

}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */