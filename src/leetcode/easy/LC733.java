package leetcode.easy;

public class LC733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)
            return image;

        dfs(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    void dfs(int[][] image, int sr, int sc, int newColor, int color) {
        if(sr<0 || sc<0 || sr>image.length-1 || sc>image[0].length-1 ||
        image[sr][sc] != color)
            return;

        image[sr][sc] = newColor;

        dfs(image, sr-1, sc, newColor, color);
        dfs(image, sr+1, sc, newColor, color);
        dfs(image, sr, sc-1, newColor, color);
        dfs(image, sr, sc+1, newColor, color);
    }

}
