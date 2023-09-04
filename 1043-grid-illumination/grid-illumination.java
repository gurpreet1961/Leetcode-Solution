class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        HashMap<Integer, Integer> rows = new HashMap<>();
        HashMap<Integer, Integer> cols = new HashMap<>();
        HashMap<Integer, Integer> tLbR = new HashMap<>();
        HashMap<Integer, Integer> bLtR = new HashMap<>();

        HashSet<Pair<Integer, Integer>> lampsLit = new HashSet<>();

        for (int[] lamp : lamps) {
            updateLitMatrix(n, lamp[0], lamp[1], rows, cols, tLbR, bLtR, true, lampsLit);
        }

        int[] res = new int[queries.length];
        int i = 0;

        for (int[] query : queries) {
            int row = query[0];
            int col = query[1];

            if (rows.getOrDefault(row, 0) > 0 || cols.getOrDefault(col, 0) > 0 
                || tLbR.getOrDefault(row + col, 0) > 0 || bLtR.getOrDefault(row - col, 0) > 0) {
                res[i] = 1;
            } else {
                res[i] = 0;
            }
            i++;

            updateLitMatrix(n, row - 1, col - 1, rows, cols, tLbR, bLtR, false, lampsLit);
            updateLitMatrix(n, row - 1, col, rows, cols, tLbR, bLtR, false, lampsLit);
            updateLitMatrix(n, row - 1, col + 1, rows, cols, tLbR, bLtR, false, lampsLit);

            updateLitMatrix(n, row, col - 1, rows, cols, tLbR, bLtR, false, lampsLit);
            updateLitMatrix(n, row, col, rows, cols, tLbR, bLtR, false, lampsLit);
            updateLitMatrix(n, row, col + 1, rows, cols, tLbR, bLtR, false, lampsLit);

            updateLitMatrix(n, row + 1, col - 1, rows, cols, tLbR, bLtR, false, lampsLit);
            updateLitMatrix(n, row + 1, col, rows, cols, tLbR, bLtR, false, lampsLit);
            updateLitMatrix(n, row + 1, col + 1, rows, cols, tLbR, bLtR, false, lampsLit);
        }

        return res;
    }


    public void updateLitMatrix(int n, int row, int col, HashMap<Integer, Integer> rows,
                                HashMap<Integer, Integer> cols, 
                                HashMap<Integer, Integer> tLbR, 
                                HashMap<Integer, Integer> bLtR, boolean illuminate,
                                HashSet<Pair<Integer, Integer>> lampsLit) {
        if (row < 0 || row >= n || col < 0 || col >= n) {
            return;
        }

        if (illuminate) {
            if (lampsLit.contains(new Pair<Integer, Integer>(row, col))) {
                return;
            }
            rows.put(row, rows.getOrDefault(row, 0) + 1);
            cols.put(col, cols.getOrDefault(col, 0) + 1);

            tLbR.put(row + col, tLbR.getOrDefault(row + col, 0) + 1);
            bLtR.put(row - col, bLtR.getOrDefault(row - col, 0) + 1);

            lampsLit.add(new Pair<Integer, Integer>(row, col));
        } else {
            if (!lampsLit.contains(new Pair<Integer, Integer>(row, col))) {
                return;
            }
            rows.put(row, rows.get(row) - 1);
            cols.put(col, cols.get(col) - 1);

            tLbR.put(row + col, tLbR.get(row + col) - 1);
            bLtR.put(row - col, bLtR.get(row - col) - 1);

            lampsLit.remove(new Pair<Integer, Integer>(row, col));
        }
    }
}