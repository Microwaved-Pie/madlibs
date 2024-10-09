import java.util.Scanner;

public class Madlibs
{
  public static void main(String[] args)
  {
    // Imports Scanner to ask for user input
    Scanner sc = new Scanner(System.in);

    // Asks User for a noun
    System.out.println("Enter a noun:");

    String userNoun = sc.nextLine();

    // Asks User for a plural noun
    System.out.println("Enter a plural noun:");

    String userPluralNoun = sc.nextLine();

    // Asks User for a number
    System.out.println("Enter a number:");

    String userNumber = sc.nextLine();

    // The Original Mad Libs
    String MadLib1 = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";

    //String UserMadLib1 = MadLib1.substring(0,MadLib1.indexOf("<"))+userNoun
    //+MadLib1.substring(MadLib1.indexOf(">")+1,MadLib1.indexOf("<", MadLib1.indexOf("<")+1))+userPluralNoun

    String UserMadLib1 = MadLib1.substring(0,MadLib1.indexOf("<"))+userNoun+MadLib1.substring(MadLib1.indexOf(">")+1);

    UserMadLib1 = UserMadLib1.substring(0,UserMadLib1.indexOf("<"))+userPluralNoun+UserMadLib1.substring(UserMadLib1.indexOf(">")+1);

    UserMadLib1 = UserMadLib1.substring(0,UserMadLib1.indexOf("<"))+userNumber+UserMadLib1.substring(UserMadLib1.indexOf(">")+1);

    System.out.println(UserMadLib1);


    //System.out.print(MadLib1.substring(0,MadLib1.indexOf("<noun>"))+userNoun+MadLib1.substring(MadLib1.indexOf("<noun>")+6,MadLib1.indexOf("<plural_noun>"))
    //+userPluralNoun+MadLib1.substring(MadLib1.indexOf("<plural_noun>")+13,MadLib1.indexOf("<number>"))+userNumber+MadLib1.substring(MadLib1.indexOf("<number>")+8));

    //System.out.print(MadLib1.substring(string.indexOf("<", string.indexOf(">")+ 1)))


    //String userMadLib1 = MadLib1.substring(MadLib1.indexOf("<")+1,MadLib1.indexOf(">"));

    //System.out.println(userMadLib1);

  }
}