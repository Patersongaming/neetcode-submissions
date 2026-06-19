class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int prevScore = 0;
        for(int i = 0; i < operations.length; i++){
            if (operations[i].equals("+")){
                int top = stack.pop();
                int secondTop = stack.peek();
                int newScore = top + secondTop;
                stack.push(top);
                stack.push(newScore);
            } else if(operations[i].equals("D")){
                prevScore = stack.peek();
                int doubleScore = prevScore * 2;
                stack.push(doubleScore);
            }else if (operations[i].equals("C")){
                stack.pop();
            }else{
            stack.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum+= stack.pop();
        } return sum;
        
    }
}