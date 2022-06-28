//question 84 : Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

//Input: heights = [2,1,5,6,2,3]
//        Output: 10
//        Explanation: The above is a histogram where width of each bar is 1.
//        The largest rectangle is shown in the red area, which has an area = 10 units.

import java.util.Stack;

public class FindArea {


    public static void main(String[] a) {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        Stack<Integer> stack = new Stack<Integer>();
        int[] leftIndex = new int[heights.length];
        int[] rightIndex = new int[heights.length];


        for (int i = 0; i < heights.length; i++) {
            if (stack.isEmpty()) {
                // stack.push(0);
                leftIndex[i] = 0;
                stack.push(i);
            } else {
                while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                    stack.pop();
                }
                leftIndex[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
                stack.push(i);
            }
        }


        stack.clear();
        for (int j = heights.length - 1; j >= 0; j--) {
            if (stack.isEmpty()) {
                rightIndex[j] = heights.length - 1;
                stack.push(j);
            } else {
                while (!stack.isEmpty() && heights[j] <= heights[stack.peek()]) {
                    stack.pop();
                }
                rightIndex[j] = stack.isEmpty() ? heights.length - 1 : stack.peek() - 1;
                stack.push(j);
            }
        }


        int result = Integer.MIN_VALUE;
        for (int k = 0; k < heights.length; k++) {
            int area = heights[k] * (rightIndex[k] - leftIndex[k] + 1);
            result = Math.max(result, area);
        }
        System.out.println(result);

    }
}
