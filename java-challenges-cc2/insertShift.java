
public class insertShift{

  public static void main(String[] args){
    int[] Array = {1, 2, 3, 4,5};
        int newValue = 10;

        insertShift insetShiftObj = new insertShift();
        int[] newArray = insetShiftObj.insertShiftArray(Array, newValue);
     
        System.out.print("New Array with New Value Added At The Middle Index: ");
        for (int value : newArray) {
            System.out.print(value + " ");
        }
        System.out.println();

      }
     

public int[] insertShiftArray(int[] arr, int value) {
  int middleIndex = arr.length / 2; 
  int[] newArray = new int[arr.length + 1];

  for (int i = 0; i < middleIndex; i++) {
      newArray[i] = arr[i];
  }

  newArray[middleIndex] = value;

  for (int i = middleIndex; i < arr.length; i++) {
      newArray[i + 1] = arr[i];
  }

  return newArray;
}
}