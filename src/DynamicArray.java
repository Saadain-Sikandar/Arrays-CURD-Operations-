public class DynamicArray {

    public static int[] array;
    public static int size;
    public static int capacity;


    public DynamicArray(){
        capacity = 2;
        size = 0;
        array = new int[capacity];

    }

    public void Resize(){

        capacity *= 2;
        int [] arr2 = new int[capacity];
        for(int i = 0 ;i <array.length;i++){

            arr2[i] = array[i];
        }
        array =arr2;

    }
    public  void insert(int num){

        if(size == capacity){
            Resize();

        }
        array[size] = num;
        size++;

    }


    public  void printArr( ){
        System.out.println("Array:");
        for(int i = 0 ; i<size;i++ ){

            System.out.println(array[i]+" ");
        }


    }

}
