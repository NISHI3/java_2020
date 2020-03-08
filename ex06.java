import java.util.Scanner;
/**
 * Name ex06.java
 * Description 分岐（switch）
 */
public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("好きな国を選んでください（日本, アメリカ, ロシア, 中国）:");
        String ctr = sc.nextLine();

        switch(ctr){
            case "日本":
                System.out.println("こんにちは。");
                break;
            case "アメリカ":
                System.out.println("Hello.");
                break;
            case "ロシア":
                System.out.println("привет там");
                break;
            case "中国":
                System.out.println("你好");
                break;
            default:
                System.out.println("....");
        }

    }
}
