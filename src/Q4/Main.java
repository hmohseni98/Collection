package Q4;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> integers = new HashMap<>();
        HashMap<String,String> strings = new HashMap<>();
        integers.put(1,12);
        integers.put(2,15);
        integers.put(3,18);
        integers.put(4,40);
        System.out.println("check key is contain in hashMap:" + integers.isContainKey(3));
        System.out.println("check empty integer hashMap:" + integers.isEmpty());
        System.out.println("check empty string hashMap:" + strings.isEmpty());
        integers.getAllItem();
        integers.replaceValue(3,99);
        System.out.println("---------------------------");
        integers.getAllItem();
        System.out.println("---------------------------");
        integers.put(3,115);
        integers.getAllItem();
    }
}
