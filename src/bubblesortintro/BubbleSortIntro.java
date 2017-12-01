/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bubblesortintro;

import static java.lang.System.currentTimeMillis;



public class BubbleSortIntro {
    
  public static void main(String[] args) {
      int elements= 100000;
      int nums[] = new int[elements];
     //= {22, 30, 15, 1, 7, 87, 65, 24, 22, 0}
    for (int i=0; i<elements; i++){
        nums[i]=(int)(Math.random()*101);
    }
    
    double start=0;
    double finish=0;
    double total=0;
    //print out unsorted list
//    for (int count = 0; count < nums.length; count++) {
//      System.out.print(nums[count] + " ");
//    }
//    System.out.println("\n---------------------------------");
    start = currentTimeMillis();
    bubbleSort(nums);
    finish = currentTimeMillis();
    total = finish - start;
    //print out sorted list
//    System.out.println("After sorting using the Bubble Sort,"
//      + " the array is:");
//    for (int count = 0; count < nums.length; count++) {
//      System.out.print(nums[count] + " ");
//    }
    System.out.println("\nAfter sorting using the Bubble Sort,"
      + " the time taken is:" + total + " ms");
  }

  public static void bubbleSort(int data[]) {
    int counter;
    int comps=0;
    int swaps=0;
    //Loop to control number of passes
    for (int pass = 1; pass < data.length; pass++) {
      //Loop to control # of comparisons for length of array-1
      for (int element=0;element<data.length-1;element++) {
          comps++;
        //compare side-by-side elements and swap them if
        //first element is greater than second element
        if (data[element] < data[element + 1]) {
          swaps++;
          swap(data, element, element + 1);  //call swap method
        }
      }
    }
    System.out.println("After sorting using the Bubble Sort,"
      + " the total swaps are:" + swaps);
    System.out.println("After sorting using the Bubble Sort,"
      + " the total comparisons are:" + comps);
  }

  public static void swap(int array2[], int first, int second) {
    int hold = array2[first];
    array2[first] = array2[second];
    array2[second] = hold;
  }
}
