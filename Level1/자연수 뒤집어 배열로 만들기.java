class Solution {
    public int[] solution(long n) {
        String[] a = Long.toString(n).split("");
        int[] answer = new int[a.length];
            
        for(int i=0; i<a.length; i++){
            answer[i] += Integer.parseInt(a[a.length-(i+1)]);
        }
        return answer;
    }
}
