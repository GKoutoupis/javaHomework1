public class Askisi5 {  

    static double askisi5a(double[] arr) {
        double c = 0;
        for (int i = 0; i<10; i++){
            c += arr[i];
        }
        c /= 10;
        return c;
    }

    static double askisi5b(double[] arr){
        double max = arr[0];
        for (int i=1; i<10; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

     static double askisi5c(double[] arr){
        double min = arr[0];
        for (int i=1; i<10; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static void myCopy(double[] arr, double[] arr2){
        for (int i=1; i<10; i++){
            arr2[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        double[] grades = {7, 9, 10, 8.5, 8, 9.5, 2, 4, 7, 8};
        System.out.println(askisi5a(grades));
        System.out.println(askisi5b(grades));
        System.out.println(askisi5c(grades));
        double[] grades_backup = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        myCopy(grades, grades_backup);
    }
}