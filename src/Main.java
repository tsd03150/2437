import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + 1 < arr[i]) {
                break;
            }
            sum += arr[i];
        }

        System.out.println(sum+1);

    }
}