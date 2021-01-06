class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split("");
        
        if(a.length%2 == 0)
            answer += a[((a.length)/2)-1] + a[(a.length)/2];
        else 
            answer += a[(a.length)/2];
        return answer;
    }
}
