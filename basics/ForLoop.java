package basics;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("iterion-" + i);
        }

        for (

                int y = 0; y < 3; y++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i=" + y + ",j=" + j);
            }
        }
    }
}
