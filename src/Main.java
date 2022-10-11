public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));

        System.out.println("Задание 2");
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));

        System.out.println("Задание 3");
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));

        System.out.println("Задание 4");
        System.out.println(profitableGamble(0.2, 50, 5));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));

        System.out.println("Задание 5");
        System.out.println(operation(24,15, 9));
        System.out.println(operation(24,26, 2));
        System.out.println(operation(15,11, 11));

        System.out.println("Задание 6");
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\')); // x = '\'

        System.out.println("Задание 7");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));

        System.out.println("Задание 8");
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));

        System.out.println("Задание 9");
        int[] array1 = new int[] {1, 5, 9};
        int[] array2 = new int[] {3, 4, 5};
        int[] array3 = new int[] {2};
        int[] array4 = new int[] {};
        System.out.println(sumOfCubes(array1));
        System.out.println(sumOfCubes(array2));
        System.out.println(sumOfCubes(array3));
        System.out.println(sumOfCubes(array4));

        System.out.println("Задание 10");
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }

    // остаток от деления
    public static int remainder(int x, int y){
        return x % y;
    }
    // площадь треугольника, если известно основание и высота
    public static int triArea(int x, int y){
        return x * y / 2;
    }
    // количество ног у животных
    public static int animals(int chickens, int cows, int pigs){
        return chickens * 2 + cows * 4 + pigs * 4;
    }
    // расчёт прибыли
    public static boolean profitableGamble(double prob, double prize, double pay){
        return (prob * prize - pay) > 0;
    }
    // операция, котоорую необходимо произвести над числами a и b, чтобы получить N
    public static String operation(int N, int a, int b){
        if (a + b == N){
            return "added";
        }
        else if (a - b == N){
            return "subtracted";
        }
        else if (a * b == N){
            return "multiplied";
        }
        else if (a / b == N){
            return "divided";
        }
        else return "none";
    }
    // значение ASCII переданного символа
    public static int ctoa(char x){
        return (int) x;
    }
    // сумма всех чисел до заданного числа и включая его
    public static int addUpTo(int x){
        int sum = 0;
        for (int i = 1; i <= x; i++){
            sum += i;
        }
        return sum;
    }
    // максимальное значение третьего ребра треугольника (целое)
    public static int nextEdge(int x, int y){
        return x + y - 1;
    }
    // сумма кубов чисел из массива
    public static int sumOfCubes(int[] myArray){
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += Math.pow(myArray[i], 3);
        }
        return sum;
    }
    // добавление числа a к себе b раз и проверка, делится ли результат на c
    public static boolean abcmath(int a, int b, int c){
        for (int i = 1; i <= b; i++){
            a = a + a;
        }
        return a%c == 0;
    }
}
