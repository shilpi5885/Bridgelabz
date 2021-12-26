/*Java program to Check Vowel or Consonant*/

public class VowelOrConsonant {

    public static void main(String[] args) {

        char ch = args[0].charAt(0);

       switch (ch) {
       case 'a' :
 	   case 'e' :
       case 'i' :
 	   case 'o' :
 	   case 'u' :
 	   case 'A' :
 	   case 'E' :
 	   case 'I' :
 	   case 'O' :
 	   case 'U' :
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
