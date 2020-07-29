import java.util.Scanner;

class Test1 {
    public static void main(String[] args){
        new Test1().run();
    }

    private void run(){
        Scanner scanner = new Scanner(System.in);
        int coinAmount = scanner.nextInt();
        int solution = test(coinAmount);
        System.out.println("Ответ: "+ solution);
    }

    public int test(int n){
        int solution = 0;
        int currentRowLength = 1;
        while (currentRowLength <= n){
            solution++;
            n -= currentRowLength;
            currentRowLength++;
        }
        return solution;
    }
}
