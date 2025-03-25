package check_word_valid_after_substitutions;

import java.util.Stack;

public class Solution {

    public boolean isValidWordAfterSubstitutions(String s) {
        Stack<Character> stk = new Stack();

        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'b'){
                stk.push(ch);
            }
            else{

                if(stk.isEmpty()){
                    return false;
                }

                if(stk.peek() != 'b'){
                    return false;
                }
                stk.pop();

                if(stk.isEmpty()){
                    return false;
                }

                if(stk.peek() != 'a'){
                    return false;
                }
                stk.pop();

            }
        }

        return stk.isEmpty();
    }
}
