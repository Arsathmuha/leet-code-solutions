import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // Step 1: Build graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for(int[] p : prerequisites){
            int a = p[0];
            int b = p[1];

            adj.get(b).add(a);   // b → a
            indegree[a]++;
        }

        // Step 2: Queue for indegree 0
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        int count = 0;

        // Step 3: Process
        while(!q.isEmpty()){
            int node = q.poll();
            count++;

            for(int nei : adj.get(node)){
                indegree[nei]--;

                if(indegree[nei] == 0){
                    q.offer(nei);
                }
            }
        }

        // Step 4: Check
        return count == numCourses;
    }
}