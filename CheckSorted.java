package assignments;
import java.util.*;

//CheckSorted
//
//isUnique and isSorted take arrays and determine if they are sorted by ascending order, or have all unique values, respectively
//By: m.w.
//11/18/2019
//*******************************************************************
public class CheckSorted {

	public static void main(String[] args) {
		
		double[] notSorted = new double[] {2,11,10,13,14,15,16};
		double[] sorted = new double[] {3,5,11,14,21,22,24,56,76};
		int[] nonUnique = new int[] {1,2,3,4,5,6,7,8,9,11,11};
		int[] unique = new int[] {1,2,3,4,5,6,7,8,9,10,11};
		
		
		//isUnique(nonUnique);
		
		//isSorted(notSorted);
	}
	
	public static boolean isUnique(int[] checkUnique) {
		//a variable to store our result
		boolean result = false;
		//first loop to iterate over the arrays length and flag "main" to break out of the nested loop later 
		main: for(int i = 0; i< checkUnique.length; i++) {
				//second loop to compare each value in the array to the value in the array defined by the first loop
				for(int a = 0; a< checkUnique.length; a++) {
					//we make sure that we're not comparing the value in the first loop to itself 				
					if(a != i){
						//conditional to check for duplicates, if true, set result to false and break out of the "main" loop. 
						if(checkUnique[i] == checkUnique[a]) {
							System.out.print(checkUnique[i] + " is a duplicate ");
							result = false;
							break main;
							}
						//else, result is true and we keep going
						else {
							result = true;
						}
					}

					else{
						continue;
					}					
				}
			}
	
		if(result == true) {
			System.out.print("No duplicates ");
		}
		System.out.print(result);
		return result;
	}
	
	public static boolean isSorted(double[] checkThis){
		//Iterate thru the array, starting at position 1 (so we can check if previous and next value
		//are respectively less and more than current value
		boolean result = false;
		for(int i = 1; i < checkThis.length; i++) {
			//make sure out iterator doesn't overshoot the end of the array
			
			if(i < (checkThis.length - 1)) {
				//check if current value is more than the last value and less than the next value
				if((checkThis[i] > checkThis[i-1]) && (checkThis[i] < checkThis[i+1])) {
					result = true;
				}
				//if value is found not in ascending order, we stop the loop and return our result
				else {
					result = false;
					break;
				}
			}
		}
		if(result == true) {
			System.out.print("array is sorted");
			return true;
		}
		else{
			System.out.print("array is NOT sorted");
			return false;
		}
	}
	
	/*
	public static int[] genRandomUniqueArray(boolean unique) {
		Random rand = new Random();
		//create a new array with a randomly sized length
		int[] randomArray = new int[rand.nextInt(20)];
		//our parameter determines whether to make a sorted(ascending) array or non sorted(random)
		if(unique == true) {
			for(int i = 1; i < randomArray.length; i++) {				
				for(int a = 1; a < randomArray.length; a++) {
					int intGen = rand.nextInt(99);
					if(intGen != randomArray[a-1]) {
						randomArray[i-1] = intGen;
					}
				}
			}
		}
		else {
			for(int i = 0; i < randomArray.length; i++) {
				randomArray[i] = rand.nextInt();
			}
		}
		return randomArray;
	}
	
	private int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;
	}
	
	public void quickSort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}
*/
}


