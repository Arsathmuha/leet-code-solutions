class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s); //greedy logic
        int content = 0, cookieindex = 0;
        while(cookieindex < s.length && content < g.length){
            if(s[cookieindex] >= g[content]) //cookie size >
            {
                content++;
            }
            cookieindex++;
        }
        return content;
    }
}