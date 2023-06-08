import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] t1 = new int[] { 0, 1, 2, 4, 5, 7 };
        int[] t2 = new int[] { 0, 2, 3, 4, 6, 8, 9 };
        System.out.println(summaryRanges(t1));
        System.out.println(summaryRanges(t2));

    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new LinkedList<String>();
        int count = 1;
        int[] temp = new int[2];
        for (int i = 0; i < nums.length - 1; i = count) {
            temp[0] = nums[i];
            temp[1] = 0;
            loop2: for (int j = i + 1; j < nums.length; j++) {
                if (nums[j - 1] + 1 == nums[j]) {
                    temp[1] = nums[j];
                    count = j;
                } else if (nums[j - 1] + 1 != nums[j] && temp[1] != 0) {
                    String tp = String.valueOf(temp[0]) + "->" + String.valueOf(temp[1]);
                    list.add(tp);
                    count = j;
                    break loop2;
                } else if (nums[j - 1] + 1 != nums[j] && temp[1] == 0) {
                    String tp = String.valueOf(temp[0]);
                    list.add(tp);
                    count = j;
                    break loop2;
                } else {
                    temp[1] = nums[j];
                    count = j;
                }
            }
        }
        String tp = String.valueOf(temp[0]);
        list.add(tp);
        return list;
    }
}
