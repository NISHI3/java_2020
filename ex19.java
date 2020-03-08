import java.util.HashMap;

/**
 * Name ex19.java
 * Description 連想配列4
 */
public class ex19 {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("apple", "りんご");
        hashmap.put("orange", "みかん");
        hashmap.put("peach", "もも");
        hashmap.forEach((key, value) -> System.out.println("キー：" + key));
        hashmap.forEach((key, value) -> System.out.println("値：" + value));
        hashmap.forEach((key, value) -> System.out.println("キー：" + key + " 値：" + value));
    }
}
