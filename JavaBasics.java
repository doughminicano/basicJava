import java.util.Arrays;
import java.util.ArrayList;

public class JavaBasics {

    public void forLoop(int num) {
        for(int i = 1; i<=num; i++){
            System.out.println(i);
        }
    }

    public void oddLoop(int num) {
        for(int i=1; i<=num; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

        public void sumOut() {
            int sum = 0;
        for(int i=1; i<=20; i++){
            sum += i;
                System.out.println("New Number:" + i + ", Sum:" +sum);
            }
    }

            public void loopArray(int[] Array) {

        for(int i=0; i<Array.length; i++){
                System.out.println(Array[i]);
            }
    }



    public void maxArray(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max); 
    }

        public void averageArray(int[] arr) {
        int avrg = 0;
        for(int i=0; i<arr.length; i++){
            avrg = avrg + arr[i];

        }
        System.out.println(avrg/arr.length); 
    }

            public void oddArray(int[] arr) {
        int avrg = 0;
        for(int i=0; i<arr.length; i++){
            avrg = avrg + arr[i];

        }
        System.out.println(avrg/arr.length); 
    }

}