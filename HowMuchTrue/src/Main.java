public class Main {
    public static void main(String[] args) {


    }
    public static int countTrue(boolean[] arr){
        int co=0;
        for(boolean element : arr){
            if(element){
                co++;
            }
        }
        return co;
    }
}