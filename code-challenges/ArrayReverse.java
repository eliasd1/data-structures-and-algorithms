public class ArrayReverse{
  public static void main(String[] args) {
    int[] intArray = new int[]{ 1,2,3,4,5};
    int[] secondArray = reverseArray(intArray);
    for(int i : secondArray){
      System.out.println(i);
    }
  }
  public static int[] reverseArray(int[] intArray){
    int[] newArray = new int[intArray.length];
    for(int i = 0; i < intArray.length; i++){
      newArray[i] = intArray[intArray.length - 1 - i];
    }
    return newArray;
  }
}
