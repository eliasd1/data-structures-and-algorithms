/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package left_join;

import hashtable.HashTable;

public class App {

    public static void main(String[] args) {
      HashTable left  = new HashTable();
      HashTable right = new HashTable();
      left.add("first", 1);
      left.add("second", 2);
      right.add("first", "this is the first");
      right.add("second", "second");
      right.add("third", 3);
      System.out.println(LeftJoin.leftJoin(left, right));
    }
}
