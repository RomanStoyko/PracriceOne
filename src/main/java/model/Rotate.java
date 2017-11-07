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

        int lengthOfArray = inputArray.length;

        // check for square
        for (int[] anInputArray : inputArray) {
            if (anInputArray.length != lengthOfArray) {
                return null;
            }
        }

        int[][] result = new int[lengthOfArray][lengthOfArray];

        for(int i = 0; i < lengthOfArray; i++){
            for(int j = 0; j < lengthOfArray; j++){
                result[i][j] = inputArray[j][lengthOfArray - i - 1];
            }
        }

        return result;
    }
}
