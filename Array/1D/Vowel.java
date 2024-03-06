class Vowel
{
     public static void main(String[] args) {
      String s = new String("Mohit");
        char ch;
      int i,count=0;
      for(i=0;i<s.length();i++)
      {
        ch = s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
       {
         count++;
       }
      
      }
      //hello world
      System.out.println("number are vowels is :"+ count);

        
    }
}
