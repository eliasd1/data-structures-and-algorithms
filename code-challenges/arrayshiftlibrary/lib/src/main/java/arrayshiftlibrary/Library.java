/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package arrayshiftlibrary;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public int[] insertShiftArray(int[] array, int value){
      int[] newArray = new int[array.length+1];
      for(int i = 0; i<newArray.length; i++){
        if(i == Math.round(array.length/2.0)){
          newArray[i] = value;
        } else if(i > array.length/2){
          newArray[i] = array[i-1];
        } else{
          newArray[i] = array[i];
        }
      }
      for(int i: newArray){
        System.out.println(i);
      }
      return newArray;
    }
}
