public class MultipleOf3 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 12, 18, 21};
        System.out.print("Multiples of 3: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
