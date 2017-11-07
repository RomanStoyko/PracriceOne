package model;

public class Rotate {

    public static int[][] generateArray(int num){
        if( num <= 0){
            return null;
        }

        int[][] result = new int[num][num];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = Integer.MIN_VALUE / 32 + (int) (Math.random()*Integer.MAX_VALUE / 16 );
            }
        }

        return  result;
    }

    public static int[][] rotate(int[][] inputArray){

        int lengOfArray = inputArray.length;

        // check for square
        for (int i =0; i < inputArray.length; i++){
            if(inputArray[i].length != lengOfArray) {
                return null;
            }
        }

        int[][] result = new int[lengOfArray][lengOfArray];

        for(int i = 0; i < lengOfArray; i++){
            for(int j = 0; j < lengOfArray; j++){
                result[i][j] = inputArray[j][lengOfArray - i - 1];
            }
        }

        return result;
    }
}
