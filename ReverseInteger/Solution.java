class Solution {
    public  int reverse(int x) {
        if(x==0){
            return x;
        }
        // reveerseX의 값이 Integer범위를 벗어나는지 판단하려면 long범위로 계산을 하면서 판별해야한다.
        long reverseX=0;
​
        while(x!=0){
            int mod=x%10;
            x/=10;
            reverseX=reverseX*10+mod;
​
        }
            if(reverseX>Integer.MAX_VALUE || reverseX<Integer.MIN_VALUE){
                return 0;
            }
   
        return (int)reverseX;
    }
}
