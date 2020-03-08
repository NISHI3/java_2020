import java.util.Arrays;
import java.util.List;

/**
 * Name ex16.java
 * Description 一次元配列
 */
public class ex16 {
    public static void main(String[] args) {
        int result[] = {85, 78, 92, 62, 69};

        for (int i = 0; i < 5; i++){
            System.out.println(result[i]);
        }

        // 拡張for文
        for (int n: result) {
            System.out.println(n);
        }

        List<Integer> Lresult = Arrays.asList(99, 100, 200, 33, 21);
        // ラムダ式
        Lresult.forEach(n -> {
            System.out.println(n);
        });
    }
}
