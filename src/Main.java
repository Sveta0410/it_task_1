public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(remainder(1, 3));
        System.out.println(remainder(-9, 45));
        System.out.println("Задание 2");
        System.out.println(triArea(3, 2));
        System.out.println(triArea(10, 10));
        System.out.println("Задание 3");
        System.out.println(animals(2, 3, 5));
        System.out.println("Задание 4");
        System.out.println(profitableGamble(0.2, 50, 5));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println("Задание 5");
        System.out.println(operation(24,15, 9));
        System.out.println(operation(24,26, 2));
        System.out.println(operation(15,11, 11));
        System.out.println("Задание 6");
        System.out.println(ctoa('A'));
        System.out.println("Задание 7");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
        System.out.println("Задание 8");
        System.out.println("Задание 9");
        System.out.println("Задание 10");

    }

    public static int remainder(int x, int y){
        return x % y;
    }
    public static int triArea(int x, int y){
        return x * y / 2;
    }
    public static int animals(int chickens, int cows, int pigs){
        return chickens * 2 + cows * 4 + pigs * 4;
    }
    public static boolean profitableGamble(double prob, double prize, double pay){
        return (prob * prize - pay) > 0;
    }
    public static String operation(double N, double a, double b){
        if (a + b == N){
            return "added";
        }
        else if ((a - b == N) || (b - a == N )){
            return "subtracted";
        }
        else if (a * b == N){
            return "multiplied";
        }
        else if (a / b == N || b / a == N){
            return "divided";
        }
        else return "none";
    }
    public static int ctoa(char x){
        return (int) x;
    }
    public static int addUpTo(int x){
        int sum = 0;
        for (int i = 1; i <= x; i++){
            sum += i;
        }
        return sum;
    }

}
