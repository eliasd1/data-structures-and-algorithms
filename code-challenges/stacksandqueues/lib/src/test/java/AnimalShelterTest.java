import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
  @Test
  public void testAnimalShelter(){
    AnimalShelter animalShelter = new AnimalShelter();
    Animal dog = new Animal("dog", "dog");
    Animal cat = new Animal("cat", "cat");
    assertEquals(dog, animalShelter.enqueue(dog));
    assertEquals(dog, animalShelter.dequeue("dog").getData());

    assertEquals(cat, animalShelter.enqueue(cat));
    assertEquals(cat, animalShelter.dequeue("cat").getData());

    animalShelter = new AnimalShelter();
    Animal lion = new Animal("lion", "lion");
    assertNull(animalShelter.enqueue(lion));

    assertNotEquals(lion, animalShelter.dequeue("lion"));
    assertNull(animalShelter.dequeue("lion"));

  }



}
