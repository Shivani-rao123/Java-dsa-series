package recursion_learn.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class pathinmaze {
    public static void main(String[] args){
        path("",3,3);
        System.out.println(pathreturn("",3,3));
        System.out.println(pathreturnDiag("",3,3));
        boolean[][] board = {
                {true, true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        System.out.println( "Obstacles"+pathreturnwithrestriction("",board,0,0));
        System.out.println("Backtrackin"+Allpaths("",board,0,0));
        System.out.println("AllPath print: "+AllpathsPrint("",board,0,0,path,1));

    }
    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);

        }
        if(c>1){
            path(p+'R',r,c-1);
        }

    }
    static ArrayList<String>pathreturn(String p, int r , int c){
        if(r==1 && c==1){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        if(r>1){
            list.addAll(pathreturn(p+'D',r-1,c));
       }
        if(c>1){
            list.addAll(pathreturn(p+'R',r,c-1));
        }
        return list;
    }
    static ArrayList<String>pathreturnDiag(String p, int r , int c){
        if(r==1 && c==1){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        if(r>1&& c>1){
            list.addAll(pathreturnDiag(p+'D',r-1,c-1));
        }
        if(r>1){
            list.addAll(pathreturnDiag(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll(pathreturnDiag(p+'H',r,c-1));
        }
        return list;
    }
    static ArrayList<String> pathreturnwithrestriction(String p, boolean[][] maze, int r, int c) {
        ArrayList<String> list = new ArrayList<>();

        if (!maze[r][c]) {
            return list;
        }

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            list.add(p);
            return list;
        }

        if (r < maze.length - 1) {
            list.addAll(pathreturnwithrestriction(p + 'D', maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            list.addAll(pathreturnwithrestriction(p + 'R', maze, r, c + 1));
        }
        return list;
    }
    static ArrayList<String> Allpaths(String p, boolean[][] maze, int r, int c) {
        ArrayList<String> list = new ArrayList<>();

        if (!maze[r][c]) {
            return list;
        }


        if (r == maze.length - 1 && c == maze[0].length - 1) {
            list.add(p);
            return list;
        }
        maze[r][c]=false; //marking the cell as visited

        if (r < maze.length - 1) {
            list.addAll(Allpaths(p + 'D', maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            list.addAll(Allpaths(p + 'R', maze, r, c + 1));
        }
        if (r>0) {
            list.addAll(Allpaths(p + 'U', maze, r-1, c ));
        }
        if(c>0){
            list.addAll(Allpaths(p+'L',maze,r,c-1));
        }
        //this lin is where the function gets over
        //so before the function gets removed, also remove the changes that were made by the function

        maze[r][c]=true; //proving the cells are visited
        return list;
    }
    static ArrayList<String> AllpathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        ArrayList<String> list = new ArrayList<>();

        if (!maze[r][c]) {
            return list;
        }

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            System.out.println(p);
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            path[r][c] = 0; // reset destination
            list.add(p);
            return list;
        }

        maze[r][c] = false; // mark visited
        path[r][c] = step;

        if (r < maze.length - 1) {
            list.addAll(AllpathsPrint(p + 'D', maze, r + 1, c, path, step + 1));
        }
        if (c < maze[0].length - 1) {
            list.addAll(AllpathsPrint(p + 'R', maze, r, c + 1, path, step + 1));
        }
        if (r > 0) {
            list.addAll(AllpathsPrint(p + 'U', maze, r - 1, c, path, step + 1));
        }
        if (c > 0) {
            list.addAll(AllpathsPrint(p + 'L', maze, r, c - 1, path, step + 1));
        }

        maze[r][c] = true; // restore
        path[r][c] = 0;    // restore
        return list;
    }
}
