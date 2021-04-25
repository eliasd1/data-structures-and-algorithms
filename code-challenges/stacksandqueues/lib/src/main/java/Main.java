import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
      List<String> strings = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
    System.out.println("Out " + DuckDuckGo(strings, 3));
  }
  public static String DuckDuckGo(List<String> strings, int k){
    Queue queue = new Queue();
    int counter = 1;
    for(int i = 0; i<5; i++){
      queue.enqueue(strings.get(i));
    }

    while(queue.peek().next() != null){
      if(counter % k == 0){
        queue.dequeue();
        counter ++;
        continue;
      }
      queue.enqueue(queue.dequeue().getData());
      counter ++;
    }
    return queue.peek().getData().toString();
  }

}
