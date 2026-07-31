class Solution {
     
          public static String reverseWords(String s) {
         
       /*  String[] words = s.trim().split("\\s+");
        Stack<String> stack = new Stack<>();
        
     
        for (String word : words) {
            stack.push(word);
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }
        
        return result.toString();
    } //
    String[] words = s.trim().split("\\s+");
    StringBuilder sb = new StringBuilder();
      for(int i = words.length -1; i >=0; i--){
        sb.append(words[i]);
        if (i != 0) {
                sb.append(" ");
            }
      }
     return sb.toString();
*/

     String trim = s.trim();
     // for starting and  last space khatam kar dega.
      String[] arr = trim.split("\\s+");
        // for between word spacr khatm kar dega or arr me convertt kar dega.
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

             i = i+1;
        j = j-1;
        }
       return String.join(" " , arr);
    }
    }
