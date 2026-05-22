import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
         scanner.close();
         int maxlen = 1 ;
         int curlen = 1 ;
         for(int i = 1 ; i<s.length() ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                curlen++ ;
                if(curlen > maxlen){
                    maxlen = curlen ;
                }else {
                    curlen = 1 ;
                }
            }
         }
         System.out.println(maxlen);
    }
}

