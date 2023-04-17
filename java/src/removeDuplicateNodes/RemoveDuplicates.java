package removeDuplicateNodes;

import java.util.LinkedList;

public class RemoveDuplicates {
    public static LinkedList<Integer> remove(LinkedList<Integer> list) {
        int i = 0;
        int size = list.size();
        while (i < size) {
            int j = i + 1;
            while (j < size) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    size = list.size();
                    continue;
                }
                j++;
            }
            i++;
        }
        return list;
    }
}
