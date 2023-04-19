import java.util.*;
public class rev2
{

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("the value of n :");
    int n = scn.nextInt();
    StringBuffer sb = new StringBuffer(String.valueOf(n));
    StringBuffer rev = sb.reverse();
    System.out.println("the reversed number  is :" + rev);
  }
}