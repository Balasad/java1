import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 21};
        int longestSequenceLength = findLongestConsecutiveSequence(nums);
        System.out.println("Longest Consecutive Sequence Length: " + longestSequenceLength); // Output: 4
    }

    public static int findLongestConsecutiveSequence(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int longestSequenceLength = 0;

        // Add all numbers to the set
        for (int num : nums) {
            numSet.add(num);
        }

        // Iterate through the array
        for (int num : nums) {
            // Check if the current number is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSequenceLength = 1;

                // Keep incrementing the current number to find consecutive elements
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequenceLength++;
                }

                // Update the longest sequence length
                longestSequenceLength = Math.max(longestSequenceLength, currentSequenceLength);
            }
        }

        return longestSequenceLength;
    }
}
