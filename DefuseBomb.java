public class DefuseBomb {
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result; 
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 1; j <= Math.abs(k); j++) {
                sum += k > 0 ? code[(i + j) % n] : code[(i - j + n) % n];
            }
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] code = { 5, 7, 1, 4 };
        int k = 3;
        int[] result = decrypt(code, k);
        System.out.println("Decrypted code: " + java.util.Arrays.toString(result));
    }
}
