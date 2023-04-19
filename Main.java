import java.util.*;
import java.io.*;

public class Main
 {
    public static int processArray(ArrayList<Integer> array)
     {
         for(int i=0;i<array.size();i++)
           {
   if(array.get(i)%7==0)
             {
              array.set(i,-2);
             }
   if(array.get(i)%8==0)
             {
              array.set(i,-9);
             }
            if(array.get(i)%7==0 && array.get(i)%8==0)
              {
               array.set(i,-6);
              }
            }
        return array.size();
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(new Integer(num));
        }
        int new_length = processArray(arrayList);
        for(int i=0; i<new_length(); i++)
        {
            System.out.println(arrayList.get(i));
        }
            
    }
}
