import java. util. Arrays;
import java.util.Collections;
import java.util.Date;

import static java.util.Collections.*;

public class SortArrays {
    public static void main(String args[]) {

        int a[] = {5, 4, 18, 5};
        int temp = 0;
// first sorting method
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //second sorting method
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
//calculating time for arrays
        Date past = new Date();
        Arrays.sort((a));
        Date future = new Date();
        System.out.println("Time (milliseconds) = " + (future.getTime() - past.getTime()));
    }
}
