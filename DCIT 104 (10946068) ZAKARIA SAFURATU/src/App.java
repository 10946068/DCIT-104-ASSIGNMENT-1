public class App {
    public static void main(String[] args) throws Exception {
        int even[];
        even = new int[10000];
        int count = 0;
        int sum = 0;
        // CHANGE


        for (int i = 1;i < 10000; i++){

            if(i % 2 == 0){
                even[count] = i;
                count++;
            }
        }

        for (int i = 0;i < count; i++){
            sum += even[i];
        }

        System.out.println("Average: " + sum/count);

    }
}
