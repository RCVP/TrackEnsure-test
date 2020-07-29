import java.util.*;

public class Test2 {
    public static void main(String[] args){
        new Test2().run();
    }

    private void run(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> height = new ArrayList<>();
        String input = scanner.nextLine();
        for (String value : input.split(" ")) {
            height.add(Integer.valueOf(value));
        }
        int[] array = new int[height.size()];
        for (int i = 0; i < height.size(); i++) {
            array[i] = height.get(i);
        }
        System.out.println("Ответ: "+ test(array));
    }

    public int test(int[] height){
        int solution;
        List<Integer> reservoirs = calculateAllReservoirs(height);
        reservoirs.sort(Collections.reverseOrder());
        solution = reservoirs.get(0);
        return solution;
    }

    private List<Integer> calculateAllReservoirs(int[] height){
        List<Integer> reservoirs = new ArrayList<>();
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if (height[i] <= height[j]){
                    reservoirs.add(height[i]*(j-i));
                } else {
                    reservoirs.add(height[j]*(j-i));
                }
            }
        }
        return reservoirs;
    }
}