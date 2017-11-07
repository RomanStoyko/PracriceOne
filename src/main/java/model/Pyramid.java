package model;

public class Pyramid {

    public static int[][] getPyrimid(int num) {
        if(num < 0 || num > 9) {
            return null;
        }
        int[][] result = new  int[num][num*2-1];

         for (int i = 0;i< num;i++){
            for(int j = 0; j < num; j++){
                if(j + i + 2 - num > 0) {
                    result[i][j] = j + i + 2 - num;
                }
            }
             for(int j = num; j < result[i].length; j++){
                if(i + num - j > 0) {
                    result[i][j] =  i + num - j;
                }
             }
         }
        return  result;

    }
}
