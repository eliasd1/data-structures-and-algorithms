package repeated_word;

import LinkedList.CreateLinkedList;

import java.util.Locale;

public class RepeatedWord {
  CreateLinkedList words;

 public String findRepeatedWord(String str){
   words = new CreateLinkedList();
   return addWords(str);
 }
 public String addWords(String str){
   String word = "";
   for(int i = 0; i<str.length(); i++){
     if(str.charAt(i) != ' '){
       if(checkIfLetter(str.charAt(i))){
         word += str.charAt(i);
       }
     } else{
       if(words.includes(word)){
         break;
       } else{
         words.insert(word.toLowerCase(Locale.ROOT));
         word = "";
       }
     }
   }
   return word;
 }
 public boolean checkIfLetter(char character){
    return ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z'));
 }
}
