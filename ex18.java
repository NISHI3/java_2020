import java.util.HashMap;

/**
 * Name ex18.java
 * Description 連想配列2
 */
public class ex18 {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("apple", "りんご");
        hashmap.put("orange", "みかん");
        hashmap.put("peach", "もも");
        System.out.println("apple:" + hashmap.get("apple"));
        System.out.println("orange:" + hashmap.get("orange"));
        System.out.println("peach:" + hashmap.get("peach"));

        String previousValue = hashmap.put("apple", "リンゴ");
        System.out.println("[9] 置換された[キー：apple]:" + previousValue);
        String removedValue = hashmap.remove("peach");

        System.out.println("削除された[キー：peach]:" + removedValue);
        System.out.println("apple:" + hashmap.get("apple"));
        System.out.println("orange:" + hashmap.get("orange"));
        System.out.println("peach:" + hashmap.get("peach"));
    }
}
