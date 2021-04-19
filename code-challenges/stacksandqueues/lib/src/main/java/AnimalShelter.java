import java.util.Locale;

public class AnimalShelter {
  Queue dogs = new Queue();
  Queue cats = new Queue();

  public void enqueue(Animal animal){
    System.out.println(animal.getAnimalType());
    if(animal.getAnimalType().toLowerCase(Locale.ROOT).equals("dog")){
      dogs.enqueue(animal);
    } else if(animal.getAnimalType().toLowerCase(Locale.ROOT).equals("cat")){
      cats.enqueue(animal);
    } else{
      throw new IllegalArgumentException("Not a valid input");
    }
  }
  public Node dequeue(String pref){
    if(pref.toLowerCase(Locale.ROOT).equals("dog")){
      return dogs.dequeue();
    } else if(pref.toLowerCase(Locale.ROOT).equals("cat")){
      return cats.dequeue();
    } else{
      return null;
    }
  }
}
