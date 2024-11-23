/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twosum;

/**
 *
 * @author ADMIN
 */
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[] = new int[]{2, 7, 11, 15};
        int target = 9;
        int result[] = new int[2];
        result = twoSum(nums, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
