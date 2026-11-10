import java.util.ArrayList;

public class duplicateValueTurtoiseHare {
    int length = 9;
    

    public static void main(String args[]) {
        int[] arr = {4, 2, 2, 5, 3, 1};
        System.out.println(findDuplicate(arr));
    }



    public static int findDuplicate(int[] arr) {
        int slow = 0;
        int fast = 0;
        while (true) {
            slow = arr[slow];
            fast = arr[arr[fast]];

            if(slow == fast) {
                break;
            }
        }

        int slow2 = 0;

        while (true) {
            slow = arr[slow];
            slow2 = arr[slow2];

            if(slow == slow2) {
                return slow;
            }
        }
    }
}

