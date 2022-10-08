public class moreArrayTasks {
    public static void main(String[] args) {

//        int[][] a22 = {
//                {8, 2, 3, 4, 32, 33, 87},
//                {5, 20, 7, 8}, //26
//                {9, 100, 101, 12}};//42
//
//        for (int i = 0; i < 3; i++) {
//            int max = 0;
//            for (int j = 0; j < a22.length; j++)
//                if (a22[i][j] > max) {
//                    max = a22[i][j];
//                }
//            System.out.println(max);
//        }
//
//        System.out.println("*************************************");
//        int[][] b22 = {
//                {8, 2, 3, 4, 32, 33, 87},
//                {5, 20, 7, 8}, //26
//                {9, 100, 101, 12}};//42
//
//        for (int i = 0; i < b22.length; i++) {
//            int max = 0;
//
//            for (int j = 0; j < b22.length; j++)
//                if (a22[i][j] > max) {
//                    max = a22[i][j];
//                }
//            System.out.println(max);
//        }
//        int[][] a23 = {
//                {8, 2, 3, 4, 32, 33, 87},
//                {5, 20, 7, 8}, //26
//                {9, 100, 101, 12}};//42
//
//        for (int i = 0; i < 3; i++) {
//            int max = 0;
//            for (int j = 0; j < a23.length; j++)
//                if (a22[i][j] > max) {
//                    max = a22[i][j];
//                }
//            System.out.println(max);
//        }
//
//        System.out.println("*************************************");
//
//        int[][] b21 = {
//                {8, 2, 3, 4, 32, 33, 87},
//                {5, 20, 7, 8}, //26
//                {9, 100, 101, 12}};//42
//
//        for (int i = 0; i < b21.length; i++) {
//            int max = 0;
//        }
//
//        System.out.println("*************************************");
//        int[][] array = {{1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            int sum1 = 0;
//            for (int j = 0; j < array.length; j++) {
//                sum1 += array[i][j];
//                sum += array[i][j];
//            }
//            System.out.println(sum1);
//        }
//        System.out.println(sum);


        System.out.println("*************************************");

/*
Create a String given="Hello Syntax friends".  Using String methods
from given String create new String "Welcome Syntax family" */

//        String given = "Hello Syntax friends";
//        String g1 = given.replace("Hello","Welconm");
//        String g2 = g1.replace("friends","family");
//        System.out.println(g2);


//        System.out.println("********");
//        for(int d = 0; d<2; d++){
//        System.out.println("*      *");
//        for(int dd = 1; dd >0; dd--) {
//        System.out.println("********");
//    }
//        System.out.println("********");

        int [] num = {-2,34,5,21,6,7,4,5,3};
        int resultroduct = 1;
        int avrage = 0;
        int resultSum = 0;

        for(int i =0; i<=num.length -1; i++) {
            resultSum += num[i];
            resultroduct *= num[i];
            avrage = resultSum / num.length;
        }
            System.out.println( resultSum + " , "+  resultroduct + " , "+ avrage );


        System.out.println("*************************************");
/* write a program that displays the number of occurrences of an element in the array */
int [] array = {2,3,4,5,1,3,4,2,6,7,4,2};
int fromArray = 5;
int count = 0;
        int i= 0;
for (i= 0; i<array.length; i++) {
  //  count += array[i];
    if(fromArray == array[i]) {
        count++;
    }
}
        System.out.print(count);










        System.out.println("*************************************");

    }
}





