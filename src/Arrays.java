public class Arrays {

    //    INSERTION IN ARRAY
    public static void Insert(int[] arr, int value, int position) {


        for (int i = arr.length - 1; i > position - 1; i--) {

            arr[i] = arr[i - 1];

        }
        arr[position - 1] = value;

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("New Inserted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


//    DELETING FROM ARRAY

    public static void Delete(int arr[], int Delete_val) {

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == Delete_val) {

                for (int j = i; j < arr.length - 1; j++) {

                    arr[j] = arr[j + 1];
                    found = true;
                }
                break;
            }

        }
        if (found) {
            System.out.println("\nElement Deleted Successfully!");

            System.out.println("The New Array is:");
            for (int i = 0; i < arr.length - 1; i++) {

                System.out.println(arr[i] + "  ");
            }
            System.out.println();
        } else {
            System.out.println("\n\nElement Not Found!");
        }

    }

    //SEARCHING FROM ARRAY
    public static int Search(int[] arr, int Search_val) {


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == Search_val) {

                return i;

            }
        }
        return 0;

    }

    //    MAX NUMBER
    public static int Max_Num(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //    MIN NUMBER
    public static int Min_Num(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


//        COMMON NUMBERS IN TWO ARRAYS

        public static void Common_num (int[] arr1 , int[]arr2 ){

            System.out.println("Common number are:");

        for(int i =0 ; i < arr1.length;i++){

            for(int j = 0 ;j<arr2.length;j++){

                if(arr1[i] == arr2[j]){

                    System.out.println(arr1[i]+"  ");
                    break;
                }

            }
        }

    }





    //CALCULATING PRODUCT OF ARRAY ELEMENTS
    public static int Calculate_Product(int[] arr) {

        int product = 1;

        for (int i = 0; i < arr.length; i++) {

            product *= arr[i];

        }

        return product;


    }


//        CALCULATING AVERAGE IN ARRAY
    public static int Calculate_Average(int[] arr) {

        int sum = 0;
        int average;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }

        average = sum/arr.length;

            return average;

    }

//    REVERSE ARRAY
    public static void reverse (int[]arr){

        for(int i = 0; i<arr.length/2;i++){

            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }
        System.out.println("New Array is:");
        for(int i= 0 ; i<arr.length;i++){

            System.out.println(arr[i] + " ");

        }

    }

//        FINDING DISTINCT NUMBERS

    public static int[] Distinct (int[] arr){

        int [] temp = new int[arr.length];
        int count = 0;

        for(int i = 0 ; i<arr.length;i++){

            boolean isdistinct = true;

            for(int j = 0 ; j < count ; j++){

                if(arr[i] == temp[j]){
                    isdistinct = false;
                    break;
                }
            }

            if(isdistinct){

                temp[count] =  arr[i];
                count++;
            }

        }

        int [] distinct_num = new int[count];
        for(int k=0 ; k<count ;k++){

            distinct_num[k] = temp[k];

        }

    return distinct_num;

    }



//    REPLACING THE NUMBER

    public static void Replace(int arr[] , int oldnum,int newnum){

        boolean found = false;

        for(int i = 0 ; i<arr.length; i++){

            if(arr[i] == oldnum){
                arr[i] = newnum;
                found = true;
            }

        }
        if(found){

            System.out.println("Array updated successfully,New Array is:");
            for(int i : arr){

                System.out.println(i + "  ");

            }
        }

        else{
            System.out.println("Value not Found!");
        }

  }



//    FINDING EVEN NUMBER

    public static void Even_num(int[]arr){


        System.out.println("Even number are:");
        for(int i=0; i<arr.length;i++){

            if(arr[i]%2==0){
                System.out.println(arr[i]);

            }

        }
    }
//    FINDING ODD NUMBERS
    public static void ODD_num(int[]arr){

        System.out.println("Odd numbers are:");
        for(int i=0; i<arr.length;i++){

            if(arr[i]%2!=0){
                System.out.println(arr[i]);

            }

        }
    }

//    PRIME NUMBER CHECKER
    public static void Prime_num(int[]arr){

        System.out.println("Prime Numbers are:");

        for(int i=0; i<arr.length;i++){

            Math.sqrt(arr[i]);

            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }

        }
    }



}




