public class PseudoQueue<T> {
  private Stack stack;
  private Stack reverseStack;

  public PseudoQueue(){
    stack = new Stack();
    reverseStack = new Stack();
  }

  public void enqueue(T object){
      while(!stack.isEmpty()){
       reverseStack.push(stack.pop().getData());
      }
      reverseStack.push(object);
      while(!reverseStack.isEmpty()){
        stack.push(reverseStack.pop().getData());
      }
  }
  public Node dequeue(){
    return stack.pop();
  }

  public Stack getStack(){
    return stack;
  }
  @Override
  public String toString() {
    return "PseudoQueue{" +
      "stack=" + stack +
      '}';
  }
}
