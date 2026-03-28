class Solution {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int index = 5;

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range");
        } catch (NullPointerException e) {
            System.out.println("Array is null");
        }
    }
}