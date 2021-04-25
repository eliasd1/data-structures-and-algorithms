public class Main {
  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(20);
    stack.push(5);
    stack.push(10);

    System.out.println("Max: " + stack.getMax());
    stack.pop();
    System.out.println("Max: " + stack.getMax());

 }

}
