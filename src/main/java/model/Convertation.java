package model;

public class Convertation {

    public static char[] convert(int num, int sys) {
        if (sys <= 1 || sys > 16) return null;
        if (num < 0) return null;

        char[] chars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] result = new char[32];

        for(int i = 31; num >0; i--)

        {
            result[i] = chars[num % sys];
            num = num / sys;

        }
        return result;
    }

}
