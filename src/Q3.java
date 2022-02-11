import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q3 {
    private static final Random random = new Random();
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int j = random.nextInt(1,10);
            integerList.add(j);
        }
        System.out.println(integerList);
        if (integerList.size() % 2 == 0)
            System.out.println(checkList(integerList,integerList.size()));
        else
            System.out.println(checkList(integerList,integerList.size()-1));
    }
    private static List<Integer> checkList(List<Integer> list,Integer size){
        List<Integer> checkedList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if ((i % 2 == 0)){
                if (list.get(i) <= list.get(i+1)){
                    checkedList.add(list.get(i));
                    checkedList.add(list.get(i+1));
                }else
                    continue;
            }else
                continue;
        }
        return checkedList;
    }
}
