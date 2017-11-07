package controller;

import model.Convertation;
import model.Perfect;
import model.Pyramid;
import model.Rotate;
import view.Messenger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainController {
    static private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static private String readValue;

    public static void work() throws IOException{

        Messenger.printMainInfo();
        while ((readValue = reader.readLine()) != null){
            if (readValue.equals("-ext")) {
                break;
            }else  if (readValue.equals("-con")) {
                    convertNumber();
                    continue;
            }else  if (readValue.equals("-per")) {
                    perfectNumber();
                    continue;
            }else  if (readValue.equals("-pyr")) {
                    pyramidNumber();
                 continue;
            }else  if (readValue.equals("-rot")) {
                    rotateMatrix();
                    continue;
            }
        }

        reader.close();
    }

    static void convertNumber() throws IOException{
        Messenger.printEventInfo("конвертация числа");
        Messenger.printEnterInt();
        while ((readValue = reader.readLine()) != null){
            if(readValue.equals("-ext")) {
                Messenger.printMainInfo();
                break;
            }
            int number = 0;
            int base = 0 ;
            try {
                number = Integer.parseInt(readValue);
                Messenger.printEnterInt(" для базы от 2 до 16");
                readValue = reader.readLine();
                base = Integer.parseInt(readValue);
                char[] result = Convertation.convert(number,base);
                Messenger.printResult(result);
                Messenger.printEnterInt();

            } catch (NumberFormatException e) {

                Messenger.printErrorNumberInfo();
                Messenger.printEnterInt();
            }


        }
    }

    static void perfectNumber() throws IOException{
        Messenger.printEventInfo("совершенное число");
        String tag = " больше 5";
        Messenger.printEnterInt(tag);
        while ((readValue = reader.readLine()) != null){
            if(readValue.equals("-ext")) {
                Messenger.printMainInfo();
                break;
            }
            int number = 0;
            try {
                number = Integer.parseInt(readValue);

                int[] result = Perfect.getPerfect(number);
                Messenger.printResult(result);
                Messenger.printEnterInt(tag);

            } catch (NumberFormatException e) {

                Messenger.printErrorNumberInfo();
                Messenger.printEnterInt(tag);
            }


        }
    }

    static void pyramidNumber() throws IOException{
        Messenger.printEventInfo("пирамида");
        String tag = " от 1 до 9";
        Messenger.printEnterInt(tag);
        while ((readValue = reader.readLine()) != null){
            if(readValue.equals("-ext")) {
                Messenger.printMainInfo();
                break;
            }
            int number = 0;
            try {
                number = Integer.parseInt(readValue);

                int[][] result = Pyramid.getPyrimid(number);
                Messenger.printResult(result,true);
                Messenger.printEnterInt(tag);

            } catch (NumberFormatException e) {

                Messenger.printErrorNumberInfo();
                Messenger.printEnterInt(tag);
            }


        }
    }

    static void rotateMatrix() throws  IOException{
        Messenger.printEventInfo("поворот матрицы");
        String tag = " - размерность матрицы";
        Messenger.printEnterInt(tag);
        while ((readValue = reader.readLine()) != null){
            if(readValue.equals("-ext")) {
                Messenger.printMainInfo();
                break;
            }
            int number = 0;
            try {
                number = Integer.parseInt(readValue);

                int[][] generateArray = Rotate.generateArray(number);
                if(generateArray == null){
                    Messenger.printErrorNumberInfo();
                    Messenger.printEnterInt(tag);
                    continue;
                }
                Messenger.printMatrixTag(0);
                Messenger.printResult(generateArray,false);
                int[][] result = Rotate.rotate(generateArray);
                Messenger.printMatrixTag(1);
                Messenger.printResult(result,false);
                Messenger.printEnterInt(tag);

            } catch (NumberFormatException e) {

                Messenger.printErrorNumberInfo();
                Messenger.printEnterInt(tag);
            }
        }
    }
}
