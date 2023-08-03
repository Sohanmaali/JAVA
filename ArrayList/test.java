import java.util.ArrayList;

class Main
{
  public static void main (String[]args)
  {
    // creating an Integer ArrayList
    ArrayList < String > list = new ArrayList <> ();

    // adding elements in the list
    list.add ("Sohan");
    list.add ("Mohan");
    list.add ("Asshu");
    list.add ("kpl");
    list.add ("punam");

    // convert arraylist to string using toString() method

    String result = list.toString ();

    // printing the string
      System.out.println ("The new string is : " + result);
  }
}