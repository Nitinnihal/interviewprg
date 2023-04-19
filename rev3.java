import java.util.*;
public class rev3
{

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("the value of n :");
    int n = scn.nextInt();
    StringBuilder sb = new StringBuilder();
    sb.append(n);
    StringBuilder rev = sb.reverse();
    System.out.println("reversed number is :" + rev);
   }
}