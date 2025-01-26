public class ForCycle {

    public static void main(String[] args) {
        for(int i=100;i>=1;i--){
           if (isDividedBy4(i)) {
               System.out.println(i);
           }
        }
    }

    private static Boolean isDividedBy4(int number) {
        return number % 4 == 0;
    }
}
