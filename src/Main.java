public class Main {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{5, 9, 0, 12, 1}));
    }

    private static int sum(int[] data){
        int result = 0;

        for(int i=0 ; i <= data.length - 1 ; i++){
            result = result + data[i];
        }

        return result;
    }
}