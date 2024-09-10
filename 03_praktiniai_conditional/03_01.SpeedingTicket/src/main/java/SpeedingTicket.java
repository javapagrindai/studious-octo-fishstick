
import java.util.Arrays;
import java.util.Scanner;

public class SpeedingTicket {


    public static void main(String[] args) {





        int[] arr = {5, 7, 3, 111, 4};

        int number = 222;
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                idx = i;
            }
        }
        System.out.println( (idx == -1) ? "neradom" : "radom " + idx);


        System.out.println(Arrays.toString(arr));





    }

}