package org.example;

public class Main {
    public int[] twoSum(int[] ns, int target) {
        int[] ans = new int[2];
        int left = 0, right = 1;

        while (left < ns.length && right < ns.length) {
            while (ns[left] + ns[right] < target) {
                left++;
                right++;
            }
            while (ns[left] + ns[right] > target) {
                left--;
            }
            if (ns[left] + ns[right] == target) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}