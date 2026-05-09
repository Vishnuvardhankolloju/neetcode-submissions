class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String t=tokens[i];
            if(t.equals("+"))
            s.push(s.pop()+s.pop());
            else if(t.equals("*"))
            s.push(s.pop()*s.pop());
            else if(t.equals("-")){
                int a=s.pop();
                int b=s.pop();
                s.push(b-a);
            }
            else if(t.equals("/")){
                int a=s.pop();
                int b=s.pop();
                s.push(b/a);
            }
            else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.pop();

    }
}
