public class target {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 9, 0, 3, 1, 10};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.print("[" + nums[i] + ", " + nums[j] + "]");
                }
            }
        }
    }
}
