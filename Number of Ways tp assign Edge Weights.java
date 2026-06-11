class Solution {
    static final long MOD = 1_000_000_007L;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        int depth = maxDepth(graph, 1, 0);

        if (depth == 0) return 0;

        return (int) modPow(2, depth - 1);
    }

    private int maxDepth(List<Integer>[] graph, int node, int parent) {
        int depth = 0;

        for (int next : graph[node]) {
            if (next != parent) {
                depth = Math.max(depth, 1 + maxDepth(graph, next, node));
            }
        }

        return depth;
    }

    private long modPow(long a, long b) {
        long res = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % MOD;
            }

            a = (a * a) % MOD;
            b >>= 1;
        }

        return res;
    }
}
