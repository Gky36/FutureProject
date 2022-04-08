package replit.array2;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] arr = str.split(",");
        String shortest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < shortest.length()) {
                shortest = arr[i];
            }
        }
        int count =0;
        for(int i=0; i<arr.length; i++){

            if(arr[i].length()==shortest.length()){
                count++;
            }
        }

        String[] shortestArr = new String[count];

        for(int i=0, j=0; i<arr.length; i++){

            if(arr[i].length()==shortest.length()){

                shortestArr[j++]=arr[i];
            }
        }

        Arrays.sort(shortestArr);

        System.out.println(Arrays.toString(shortestArr));
    }
}
