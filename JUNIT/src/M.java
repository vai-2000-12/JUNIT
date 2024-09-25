package src;

public class M {
  public int [] reverseAArray(int[] arr){
     int[] reversedArray = new int[arr.length];
      for(int i =0 ; i < arr.length ; i++){
          reversedArray[i] = arr[arr.length -1-i]; 
      }
      return reversedArray;  
  }  
}
