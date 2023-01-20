public class Main {
    public static void main(String[] args) {
        task1234();

    }
    ///Я сделала все задачи рядом, потому что нерациональное несколько раз прописывать массивы.
    public static void task1234 () {
        System.out.println("Задача 1, и задача 2, и задача 3");
        // Пишем код для задачи 1
        int[]medals = new int [3];
        medals[0] = 1;
        medals[1] = 2;
        medals[2] = 3;

        double[] numbers = {1.57, 7.654, 9.986};
        String[] crashes = {"Хайруллов", "Леголас"};
        System.out.println("Задача 2");
        for (int i = 0; i < 3; i++) {
            System.out.println(medals[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);

        }
        for (int i = 0; i < 2; i++) {
            System.out.println(crashes[i]);

        }
        System.out.println("Задача 3");
        for (int i = 2; i >= 0; i--) {
            System.out.println(medals[i]);
        }

        for (int i = 2; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        for (int i = 1; i >= 0; i--) {
            System.out.println(crashes[i]);
        }
        System.out.println("Задача 4");
        for (int i = 0; i < 3; i++) {
            if (medals[i] %2 != 0){
                medals[i]+=1;
            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(medals[i]);
        }

    }

}