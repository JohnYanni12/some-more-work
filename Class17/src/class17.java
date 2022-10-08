public class class17 {

   /* Create a method that will accept an array as parameters and will
   return a sum of all elements from that array.*/

    int numSum1(int arr[]) {
        int i;
        int sum = 0;
        for (i = 0; i < arr.length ; i++) {

            sum += arr[i];
        }
        return sum;
}
    public static void main(String[] args) {

        class17 obj= new class17();
        int [] arr = {1,2,3,4,5,6,4};
        System.out.println(obj.numSum1 (arr));

    }

}


