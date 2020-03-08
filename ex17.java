import java.util.HashMap;

/**
 * Name ex17.java
 * Description 連想配列1
 */
public class ex17 {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("apple", "りんご");
        hashmap.put("orange", "みかん");
        hashmap.put("peach", "もも");
        System.out.println("apple:" + hashmap.get("apple"));
        System.out.println("orange:" + hashmap.get("orange"));
        System.out.println("peach:" + hashmap.get("peach"));
        System.out.println("mango:" + hashmap.get("mango"));
    }
}
