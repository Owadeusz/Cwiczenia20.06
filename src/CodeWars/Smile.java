package CodeWars;

import java.util.Scanner;

public class Smile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz 5 uśmiechów, a powiem Ci ile z nich zapisałeś poprawnie...");
        String[] smileCount = new String[5];
        int count4 = 0;
        for (int i = 0; i < smileCount.length; i++) {
            smileCount[i] = scan.nextLine();
            int count = 0;
            int count2 = 0;
            int count3 = 0;

            for (int j = 0; j < smileCount[i].length(); j++) {

                if(smileCount[i].charAt(j) == ')' || smileCount[i].charAt(j) == 'D') {
                    count++;
                }
                if(smileCount[i].charAt(j) == ':' || smileCount[i].charAt(j) == ';' ){
                    count2++;
                }
                if(smileCount[i].charAt(j) == '-' || smileCount[i].charAt(j) == '~'){
                    count3++;
                }
                }
                if(count == 1 && count2 == 1 && count3 <= 1) {
                    count4 = count4 + 1;
            }
        }
        System.out.println("Liczba uśmiechów to..." + count4);


    }
}


                                                    //OPIS ZADANIA

        /*Description:
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:
-Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
-A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
-Every smiling face must have a smiling mouth that should be marked with either ) or D.
No additional characters are allowed except for those mentioned.
Valid smiley face examples:
:) :D ;-D :~)
Invalid smiley faces:
;( :> :} :]

Example cases:

countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;

Note: In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same

Happy coding!*/

