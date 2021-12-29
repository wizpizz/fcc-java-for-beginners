package tutorial1;

public class Arrays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] newArr = new String[5]; // Declare what type of array it is, and how many elements it has
        /*
         * newArr can have up to 5 elements, but it can't have more than 5 elements
         * if less than 5 elements, the unassigned elements will be null
         * if more than 5 elements, the extra elements will be ignored
         */
        newArr[0] = "hello";
        newArr[1] = "hi";
        newArr[2] = "tim";
        newArr[3] = "bill";
        // newArr[4] = "joe";

        String x = newArr[4];
        System.out.println(x);

        int[] nums = {2, 3, 54, 6, 6};

        int y = nums[4];
        System.out.println(y);

        double[] nums2 = {2.0, 3.0};

    }
}
