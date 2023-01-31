/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selection_sort;


public class Selection_sort {
    public static void selectionsort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int index =i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
             arr[index]=arr[i];
             arr[i]=smallerNumber;
        }
    }
        

    
    public static void main(String[] args) {
        int[] arr1 ={9,12,32,12,34,54,43,86,32,13,21};
        System.out.println("before selection sort: ");
        for(int i:arr1){
            System.out.println(i+" ");
            
        }
        System.out.println();
        selectionsort(arr1);
        System.out.println("after slection sort");
        for(int i:arr1){
            System.out.println(i+" ");
        }
    }
    
}
