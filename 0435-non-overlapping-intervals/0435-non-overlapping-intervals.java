class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));

        int count = 0;
        int lastEnd = Integer.MIN_VALUE;
        for(int[] rows: intervals){
            if(rows[0] >= lastEnd){
                count++;
                lastEnd = rows[1];
            }
        }
        return intervals.length-count;
    }
    }