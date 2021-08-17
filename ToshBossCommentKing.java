/*
 * Joshua Philip
 *hewwo
 
 
 */
import java.util.*;

                                                                                                   
public class ToshBossCommentKing
{
   public static void main (String args[])
   {
      //make console
      Scanner console  = new Scanner(System.in);
      System.out.println("");

      System.out.println("___________          .__   __________                     ");
      System.out.println("\\__    ___/___  _____|  |__\\______   \\ ____  ______ ______");
      System.out.println("  l    l /  _ \\/  ___/  l  \\l    l  _//  _ \\/  ___//  ___/");
      System.out.println("  l    l(  <_> )___ \\ l   Y  \\   l    (  <_> )___ \\ \\___ \\ ");
      System.out.println("  l____l \\____//____  >___l  /______  /\\____/____  >____  >");
      System.out.println("                   \\/     \\/       \\/           \\/     \\/ ");
            System.out.println("Enter a phrase: ");

      String phrase = console.nextLine();
      System.out.println();
      
      String output = " * ";
      int count = 1;
      for(int i = 0; i < phrase.length(); i++){
      output+= phrase.charAt(i);
      if(count >= 60 && phrase.charAt(i) == ' '){
         count = 0;
         output+="\n * ";
      }
      count++;
      }
      
      System.out.println(output);   
  }
         


}
