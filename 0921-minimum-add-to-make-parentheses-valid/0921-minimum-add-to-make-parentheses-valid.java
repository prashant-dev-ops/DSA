class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else{
                
                if(stack.size() != 0){
                    stack.pop();
                }
                else if(stack.size() == 0){
                    count++;
                }

            }
        }
        // if(stack.size() != 0){
        //     return stack.size();
        // }else{
        //     return count;
        // }
        return stack.size() + count;
    
        
        
    }
}