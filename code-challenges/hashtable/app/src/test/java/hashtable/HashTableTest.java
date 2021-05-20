package hashtable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HashTableTest {
  @Test public void testHashTable(){
    HashTable hashTable = new HashTable();

    hashTable.add("first", "this is the first message");
    hashTable.add("second", "this is the second message");
    hashTable.add(3, "this is the third message");
    hashTable.add("fourth", 4);
    assertEquals(hashTable.get("first"), "this is the first message");
    assertEquals(hashTable.get("second"), "this is the second message");
    assertEquals(hashTable.get(3), "this is the third message");
    assertEquals(hashTable.get("fourth"), 4);
  }
}
