/* JAVAフルコース　第１講　課題
　　世田谷(JAVA.23.05)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //変数に格納
        String greet;
        greet = "Hello World変数";
        System.out.println(greet);

        //for文
        for (int i = 1; i <= 3; i++){
            System.out.println("Hello World! 繰り返し" + i + "回目");
        }

        //if文
        for (int i =1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("もしかしてHello World!");
            } else if (i == 2) {
                System.out.println("…Hello World");
            } else {
                System.out.println("……Hello");
            }
        }
    }
}