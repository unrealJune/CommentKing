/*
 * Joshua Philip
 
 
 */
import java.util.*;

                                                                                                   
public class CommentKing
{
   public static void main (String args[])
   {
      //make console
      Scanner console  = new Scanner(System.in);
      
      System.out.println("Enter a phrase: ");
      String phrase = console.nextLine();
      System.out.println();
      
      String output = " * ";
      int count = 1;
      for(int i = 0; i < phrase.length(); i++){
      output+= phrase.charAt(i);
      if(count >= 40 && phrase.charAt(i) == ' '){
         count = 0;
         output+="\n * ";
      }
      count++;
      }
      
      System.out.println(output);   
  }
         


}

