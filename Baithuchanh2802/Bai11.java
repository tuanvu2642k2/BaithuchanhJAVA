public class Bai11 {
    public static void main(String[] args) {
        int sum = 0;
        // 10k
        for (int i = 0; i <= 20; i++) {
            // 20k
            for (int j = 0; j <= 10; j++) {
                // 50k
                for (int k = 0; k <= 4; k++) {
                    if (i * 10 + j * 20 + k * 50 == 200) {
                        System.out.println(i + "to 10k + " + j + " to 20k + " + k + " to 50k");
                        sum++;
                    }

                }
            }

        }
        System.out.println(sum);

    }
}
