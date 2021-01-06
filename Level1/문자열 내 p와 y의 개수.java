class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] a = s.split("");
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<a.length; i++){
            if(a[i].toUpperCase().equals("P")){
                count1++;
            }
            else if(a[i].toUpperCase().equals("Y")){
                count2++;
            }
        }
        if(count1 != count2){
            answer = false;
        }
        return answer;
    }
}
