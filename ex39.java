import java.util.*;

/**
 * @File: ex39
 * @Description: 高橋くんが発言した単語の個数 N と i 番目に発言した単語 Wi が与えられるので、どの発言もしりとりのルールを守っていたかを判定してください。
 * @Input:
 * ------
 * N
 * W1
 * .
 * Wn
 * ------
 */
public class ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> words = new ArrayList<String>(N);
        for (int i = 0; i < N; i++) {
            words.add(sc.next());
        }
        Set<String> Wst = new HashSet<String>(words);
        if(!(Wst.size() == words.size())){
            System.out.println("No");
            return;
        }
        for (int i = 0; i < N-1; i++) {
            if(words.get(i).charAt(words.get(i).length() - 1) != words.get(i+1).charAt(0)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}