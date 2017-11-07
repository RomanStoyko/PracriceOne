package view;

public class Messenger {

    public static void printMainInfo(){
        System.out.println("Для перевода числа введите -con");
        System.out.println("Показать совершенные числа введите -per");
        System.out.println("Для вывода пирамиды введите -pyr");
        System.out.println("Для поворота матрицы введите -rot");
        System.out.println("Для выхода введите -ext");
    }

    public static void printEventInfo(String name){
        System.out.println("-----------------------------------");
        System.out.println(name.toUpperCase());
        System.out.println("Для выхода введите -ext");
        System.out.println("-----------------------------------");
    }


    public static void printErrorNumberInfo(){
        System.out.println("Неверно введено число");
        System.out.println("Для выхода введите -ext");
    }

    public static void printEnterInt(String add){
        System.out.println("Введите целое положительное число" + add);
    }

    public static void printEnterInt(){
        printEnterInt("");
    }

    public static void printNoResult(){
        System.out.println("Входящие данные не соответствуют условиям! Результат неопределен!");
        System.out.println("-----------------------------------------------------------------");
    }

    public static void printMatrixTag(int num){
        switch (num) {
            case 0:
                System.out.println("Сгенерированная матрица");
                break;
            case 1:
                System.out.println("Результирующая матрица");
                break;
        }
    }

    //------------------------------------------------------
    public static void printResult(char[] result){
        if(result == null){
            printNoResult();
            return;
        }
        for(int i = 0; i < result.length; i++){

            System.out.print(result[i]);
        }
        System.out.println("\n-----------------------------------------");
    }

    public static void printResult(int[] result){
        if(result == null){
            printNoResult();
            return;
        }
        for(int i = 0; i < result.length; i++){

            System.out.print(result[i] + " ");
        }
        System.out.println("\n-----------------------------------------");
    }


    public static void printResult(int[][] result, boolean check){
        if(result == null){
            printNoResult();
            return;
        }

        String buffer;
        for (int[] arr:result) {
            for (int i: arr) {
                if (check) {
                    System.out.print(i == 0 ? " " : i);
                }else{
                    buffer = "           " + Integer.toString(i);
                    System.out.print(buffer.substring(buffer.length()-11) + " | ");
                }
            }
            System.out.println();
        }
        System.out.println("\n-----------------------------------------");
    }
}
