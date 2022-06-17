/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        if(intervals.size() <= 1)
            return true;

        Collections.sort(intervals, (o1 , o2) -> o1.start - o2.start);


        for(int i = 1; i < intervals.size(); i++) {
            Interval x = intervals.get(i);
            Interval y = intervals.get(i-1);

            if(x.start < y.end)
                return false;
        }
        return true;

    }
}