class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char check;
        int count = 0;
        if(s.length()==4 || s.length()==6){
            for(int i=0; i<s.length(); i++){
                check = s.charAt(i);
                if(check>=48 && check<=57){
                    count++;
                }
            }
        }
        if(count != s.length())
            answer = false;
        return answer;
    }
}
