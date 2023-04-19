import java.util.*;
public class rev1
{

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("the value of n :");
    int n = scn.nextInt();
    int r, ans = 0;
    while (n > 0)
    {
      r = n % 10;
      n = n / 10;
      ans = (ans * 10) + r;
    }
    System.out.println("reversed num is : " + ans);
  }
}
