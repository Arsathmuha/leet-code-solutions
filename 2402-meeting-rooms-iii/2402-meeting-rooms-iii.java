import java.util.*;

class Solution {
    public int mostBooked(int n, int[][] meetings) {

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> availableRooms = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            availableRooms.offer(i);
        }

        PriorityQueue<long[]> busyRooms = new PriorityQueue<>(
            (a, b) -> a[0] == b[0]
                ? Long.compare(a[1], b[1])
                : Long.compare(a[0], b[0])
        );

        int[] count = new int[n];

        for (int[] meeting : meetings) {

            int start = meeting[0];
            int end = meeting[1];
            int duration = end - start;

            while (!busyRooms.isEmpty() && busyRooms.peek()[0] <= start) {
                availableRooms.offer((int) busyRooms.poll()[1]);
            }

            if (!availableRooms.isEmpty()) {

                int room = availableRooms.poll();

                busyRooms.offer(new long[]{end, room});

                count[room]++;

            } else {

                long[] current = busyRooms.poll();

                long freeTime = current[0];
                int room = (int) current[1];

                busyRooms.offer(new long[]{freeTime + duration, room});

                count[room]++;
            }
        }

        int answer = 0;

        for (int i = 1; i < n; i++) {
            if (count[i] > count[answer]) {
                answer = i;
            }
        }

        return answer;
    }
}