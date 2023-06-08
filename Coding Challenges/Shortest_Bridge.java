import java.util.LinkedList;
//import java.util.List;
// Half-Correct 
public class Shortest_Bridge{
    public static void main(String[] args) {
        int [][] grid = {{0,1},{1,0}};
        System.out.println(shortestBridge(grid));
        int [][] grid2 = {{0,1,0},{0,0,0},{0,0,1}};
        System.out.println(shortestBridge(grid2));
        int [][] grid3 = {{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}};
        System.out.println(shortestBridge(grid3));
    }

    public static int shortestBridge(int[][] grid) {
        LinkedList<Integer []> cd = new LinkedList<Integer []>();
        //Integer [] pairs = new Integer[2];
        for (int i = 0; i<grid[0].length; i++){
            for (int j = 0; j<grid[0].length;j++){
                if (grid[i][j] == 1){
                    System.out.println(i+" "+j);
                    cd.add(new Integer[]{i,j});
                }
            }
        }
        
        int count = grid[0].length;
        System.out.println(count);
        for (int i = 0; i<cd.size()-1; i++){
            for (int j = i+1; j<cd.size(); j++){
                int x = Math.abs(cd.get(i)[0] - cd.get(j)[0]);
                int y = Math.abs(cd.get(i)[1] - cd.get(j)[1]);
                System.out.println(x+" "+y);
                if (count>= (x+y)-1){
                    count = (x+y)-1;
                }
            }
        }
        return count;
    }
}