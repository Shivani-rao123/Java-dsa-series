package Backtracking;

import java.util.ArrayList;

public class mazeproblem {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        path("",3,3);
        boolean[][] board ={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        path("",3,3);
        Allpath("",3,board,3);

    }
    static int count(int row, int col){
        if (row == 1 ||col ==1) {

            return 1;

        }
        int left = count(row-1,col);
        int right = count(row,col-1);
        return left+right;
    }
    static void path(String p,int row, int col){
        if (row == 1 && col ==1) {
            System.out.println(p);
            return ;

        }

        if(row>1){
          path(p+'V',row-1,col);
        }
        if(col>1){
           path(p+'H',row,col-1);
        }
        if(col>1&&row>1){
            path(p+'D',row-1,col-1);
        }



        return ;
    }
    static void pathRestriction(String p,boolean[][] maze,int row, int col){
        if (row ==maze.length-1&& col ==maze[0].length-1) {
            System.out.println(p);
            return ;

        }
        if(!maze[row][col]){
            return;
        }

        if(row<maze.length-1){
            path(p+'V',row-1,col);
        }
        if(col<maze[0].length-1){
            path(p+'H',row,col-1);
        }




        return ;
    }
    static void Allpath(String p,int row,boolean[][] maze, int col){
        if (row == maze.length-1 && col ==maze[0].length-1) {
            System.out.println(p);
            return ;

        }if(!maze[row][col]){
            return;
        }

        if(row<maze.length-1){
            Allpath(p+'V',row+1,maze,col);
        }
        if(col<maze[0].length-1){
            Allpath(p+'H',row,maze,col+1);
        }
        if(row>0){
            Allpath(p+'U',row-1,maze,col);

        }
        if(col>0){
            Allpath(p+'D',row,maze,col-1);
        }




        return ;
    }
}
