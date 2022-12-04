public class ReverseWordsInString {

     public static void main(String[] args){
         String str = "Welcome to India";
         char[] ch = str.toCharArray();
         int start = 0;
         for (int end = 0; end <str.length() ; end++) {
             if(str.charAt(end)==' '){
                 reverse(ch,start,end-1);
                 start = end+1;
             }
         }
         reverse(ch, start, str.length()-1);
         reverse(ch,0,str.length()-1);
         for (int i = 0; i <str.length() ; i++) {
             System.out.print(ch[i]);
         }
     }

    private static void reverse(char ch[], int low, int high) {
         while(low<=high){
             char temp = ch[low];
             ch[low] = ch[high];
             ch[high] = temp;
             low++;
             high--;
         }
    }
}
