import java.util.*;

class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

        // Sort meetings by time
        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);

        // People who know the secret
        boolean[] knowsSecret = new boolean[n];
        knowsSecret[0] = true;
        knowsSecret[firstPerson] = true;

        int i = 0;

        while (i < meetings.length) {

            int currentTime = meetings[i][2];

            // Graph for meetings happening at the same time
            Map<Integer, List<Integer>> graph = new HashMap<>();

            // Store all people involved at this time
            Set<Integer> people = new HashSet<>();

            // Process all meetings with same time
            while (i < meetings.length && meetings[i][2] == currentTime) {

                int x = meetings[i][0];
                int y = meetings[i][1];

                graph.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
                graph.computeIfAbsent(y, k -> new ArrayList<>()).add(x);

                people.add(x);
                people.add(y);

                i++;
            }

            // BFS queue
            Queue<Integer> queue = new LinkedList<>();

            // Start BFS from people who already know secret
            for (int person : people) {
                if (knowsSecret[person]) {
                    queue.offer(person);
                }
            }

            // Spread secret within same time frame
            while (!queue.isEmpty()) {

                int person = queue.poll();

                for (int neighbor : graph.getOrDefault(person, new ArrayList<>())) {

                    if (!knowsSecret[neighbor]) {
                        knowsSecret[neighbor] = true;
                        queue.offer(neighbor);
                    }
                }
            }
        }

        // Collect answer
        List<Integer> result = new ArrayList<>();

        for (int person = 0; person < n; person++) {
            if (knowsSecret[person]) {
                result.add(person);
            }
        }

        return result;
    }
}