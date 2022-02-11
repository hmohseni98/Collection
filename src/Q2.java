import java.util.*;

public class Q2 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Set<Character> treeSet1 = new TreeSet<>();
        Set<Character> treeSet2 = new TreeSet<>();
        fillSet(treeSet1);
        fillSet(treeSet2);
        System.out.println("tree set 1: " + treeSet1);
        System.out.println("tree set 2: " + treeSet2);
        System.out.println("union is: " + union(treeSet1, treeSet2));
        System.out.println("sub scribe is: " + subScribe(treeSet1,treeSet2));
    }

    private static Set<Character> fillSet(Set<Character> set) {
        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(97, 122);
            set.add((char) j);
        }
        return set;
    }

    private static Set<Character> subScribe(Set<Character> set1,Set<Character> set2) {
        Set<Character> subScribe = new TreeSet<>();
        for (Character c : set1) {
            for (Character a : set2) {
                if (c.equals(a)) {
                    subScribe.add(c);
                    break;
                }
            }
        }
        return subScribe;
    }

    private static Set<Character> union(Set<Character> set1, Set<Character> set2) {
        int counter = 0;
        Set<Character> union = new TreeSet<>();
        for (Character c : set1) {
            for (Character a : set2) {
                if (c.equals(a)) {
                    counter++;
                    break;
                }
            }
            if (counter == 0)
                union.add(c);
            counter = 0;
        }
        return union;
    }
}
