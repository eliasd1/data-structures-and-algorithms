/*
 * This Java source file was generated by the Gradle init task.
 */
package multibracketvalidation;

public class App {
    public static void main(String[] args) {

    }
    public static int charCode(char c){
      return (int) c;
    }
  public static boolean multiBracketValidation(String input){
      Stack stack = new Stack();
      int counter = 0;
      for(int i = 0; i<input.length(); i++){
        char c = input.charAt(i);
        if(c == '{' || c == '(' || c == '['){
          stack.push(c);
        }
        if((c == '}' || c == ')' || c == ']')){
          String str = stack.peek().getData().toString() + c;
          if(!(str.equals("{}")) && !(str.equals("[]")) && !(str.equals("()"))){
            return false;
          } else{
            stack.pop();
          }
        }
      }
      return true;
  }
}
