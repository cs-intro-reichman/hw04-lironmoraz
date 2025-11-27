public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String temp = str;
        int n=str.length();
        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                if(i!=0)
                {
                temp = "";
                temp+= str.substring(0,i);
                temp+= (char)(str.charAt(i)+32);
                temp+= str.substring(i+1,str.length());
                }
                else{
                    temp="";
                    temp+= (char)(str.charAt(i)+32);
                    temp+= str.substring(i+1,str.length());
                }

            }
            str="";
            for(int j=0;j<n;j++)
            {
                str+=temp.charAt(j); 
            }
        }
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if(str2.length()==0)
            return true;
        if(str1.length()==0 || str1==null  || str2==null)
        {
            return false;
        }
        if(str1.length()<str2.length())
            return false;
        int j=0;
      for(int i=0;i<=str1.length()-str2.length();i++)
      {
            j=0;
            while(  j<str2.length() && str2.charAt(j)==str1.charAt(i+j) )
            {
                j++;
            }
            if(j == str2.length())
                return true;
            
      }
      return false;
    }

    
}

