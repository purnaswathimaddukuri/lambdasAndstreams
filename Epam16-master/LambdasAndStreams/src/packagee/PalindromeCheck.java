package packagee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

     public class PalindromeCheck {
        public static void main(String args[]){
           String[] strArray = {"aaaa","kavya","kayak","refer"};
           List<String> strList = Arrays.asList(strArray);
           List<String> resList = getPalindromeList(strList);
           System.out.println(resList);
     }
       public static List<String> getPalindromeList(List<String> list){
           ListIterator<String> iterator = list.listIterator();
           List<String> result = new ArrayList<>();
           while(iterator.hasNext()){
              String s = iterator.next();
              if(isPalindrome(s)){
                 result.add(s);
         }
        }
        return result;
    }
     public static boolean isPalindrome(String s) {
        int j=0,k=s.length()-1;
        while(j<k){
          if(s.charAt(j) != s.charAt(k)){
            return false;
          }
         j++;
          k--;
}
return true;
}
}

