class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0;i<operations.length;i++){
            if(operations[i].equals("D")){
                int upper = stack.peek();
                upper  = upper*2;
                stack.push(upper);
                
            }
            else if(operations[i].equals("+")){
                int sum  = stack.peek();
                int temp = stack.peek();
                stack.pop();
                sum+=stack.peek();
                stack.push(temp);
                stack.push(sum);
            }
            else if(operations[i].equals("C")){
                    stack.pop();
            }
            else{
                // int num = Integer.parseInt(operations[i]);
                Integer num = Integer.valueOf(operations[i]);
                stack.push(num);
            }
        }
        int ans = 0;
        while(!stack.isEmpty()){
            ans += stack.peek();
            stack.pop();
        }
        return ans;

        
    }
}