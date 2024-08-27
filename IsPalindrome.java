import java.util.Scanner;
class IsPalindrome {
  public static void main(String[] args) {
      System.out.println("\nEnter number: ");
      
      Scanner in = new Scanner(System.in);
      int num1,reversedNum = 0, remainder;
      num1=in.nextInt();
      int originalNum = num1;
      while (num1 != 0) {
      remainder = num1 % 10;
      reversedNum = reversedNum * 10 + remainder;
      num1 /= 10;
    }
    
    // check if reversedNum and originalNum are equal
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }
}
