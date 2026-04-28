class Solution {
    public static int[] find_prev_smaller(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }

    public static int[] find_next_smaller(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = n;
            }else{
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }



    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] next_smaller = find_next_smaller(heights);
        int[] prev_smaller = find_prev_smaller(heights);
        int max_area = Integer.MIN_VALUE;

        for(int i=0;i<n; i++){
            int h = heights[i];
            int w = next_smaller[i] - prev_smaller[i] - 1;
            int curr_area = h*w;
            max_area = Math.max(max_area, curr_area);
            
        }
        return max_area;
    }
}