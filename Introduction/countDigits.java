public class Solution {
 public static int countDigits(int n) {
   int count = 0;
   int original = n;
   while (n > 0) {
     int digit = n % 10;
       if (digit != 0 && original % digit == 0) {
         count++;
       }
     n /= 10;
   }
 }
  public static void main(String[] args) {
    int n = 35; // change the value to your required value
    int result = countDigits(n);
    System.out.println(result);
  }
}
