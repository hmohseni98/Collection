package Q4;

import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {
    private Integer emptyIndex = 0;
    private List<K> listKeys = new ArrayList<>();
    private List<V> listValues = new ArrayList<>();

    public void put(K key, V value) {
        if (!isContainKey(key)) {
            listKeys.add(emptyIndex, key);
            listValues.add(emptyIndex, value);
            emptyIndex++;
        }else
            replaceValue(key,value);
    }

    public boolean isContainKey(K key) {
        for (K k : listKeys) {
            if (k.hashCode() == key.hashCode())
                return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (emptyIndex == 0) {
            return true;
        }
        return false;
    }

    public void getAllItem() {
        for (int i = 0; i < emptyIndex; i++) {
            System.out.println(listKeys.get(i) + "  " + listValues.get(i));
        }
    }

    public void replaceValue(K key, V newValue) {
        for (int i = 0; i < emptyIndex; i++) {
            if (listKeys.get(i).hashCode() == key.hashCode()) {
                listValues.set(i, newValue);
            }
        }
    }
}
