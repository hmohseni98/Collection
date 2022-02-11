import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, String> stringMap = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.print("please input word:");
            String word = scanner.next();
            if (checkMap(word)) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
                printPermute(word, "");
            }
        }
    }

    static boolean checkMap(String key) {
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            if (entry.getKey().equals(key))
                return true;
        }
        return false;
    }

    static void printPermute(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            stringMap.put(ans, ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermute(ros, ans + ch);
        }
    }
}
