package model;

public class Perfect {

    public static int[] getPerfect(int num){
        int[] perf = {6,28,496,8128,330550336};
        int[] result;
        if(num < 6) {
            return null;
        }

        int resultLength = 0;

        for (int i = 0; i < perf.length; i++){
            if(perf[i] <= num){
                resultLength = i+1;
            }
        }

        result = new int[resultLength];
        System.arraycopy(perf,0,result,0,resultLength);

        return result;

    }
}
