public class moreArrayTasks {
    public static void main(String[] args) {

        int[][] a22 = {
                {8, 2, 3, 4, 32, 33, 87},
                {5, 20, 7, 8}, //26
                {9, 100, 101, 12}};//42

        for (int i = 0; i < 3; i++) {
            int max = 0;
            for (int j = 0; j < a22.length; j++)
                if (a22[i][j] > max) {
                    max = a22[i][j];
                }
            System.out.println(max);
        }

        System.out.println("*************************************");
        int[][] b22 = {
                {8, 2, 3, 4, 32, 33, 87},
                {5, 20, 7, 8}, //26
                {9, 100, 101, 12}};//42

        for (int i = 0; i < b22.length; i++) {
            int max = 0;

            for (int j = 0; j < b22.length; j++)
                if (a22[i][j] > max) {
                    max = a22[i][j];
                }
            System.out.println(max);
        }
        int[][] a23 = {
                {8, 2, 3, 4, 32, 33, 87},
                {5, 20, 7, 8}, //26
                {9, 100, 101, 12}};//42

        for (int i = 0; i < 3; i++) {
            int max = 0;
            for (int j = 0; j < a23.length; j++)
                if (a22[i][j] > max) {
                    max = a22[i][j];
                }
            System.out.println(max);
        }

        System.out.println("*************************************");

        int[][] b21 = {
                {8, 2, 3, 4, 32, 33, 87},
                {5, 20, 7, 8}, //26
                {9, 100, 101, 12}};//42

        for (int i = 0; i < b21.length; i++) {
            int max = 0;
        }

        System.out.println("*************************************");
        int[][] array = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < array.length; j++) {
                sum1 += array[i][j];
                sum += array[i][j];
            }
            System.out.println(sum1);
        }
        System.out.println(sum);


        System.out.println("*************************************");

//        String given="Hello Syntax friends";
//       // for (int v= 0; v<given.length(); v++)
//        System.out.println(given.replace("Hello" , "Welconm"));


//        String given = "Hello Syntax friends";
//        String [][] g = {{"Hello", "Welconm"},{"friends" , "family"}};
//        for ()
//        System.out.println(given.replace("Hello", "Welconm" "friends" , "family");


//        System.out.println("********");
//        for(int d = 0; d<2; d++){
//        System.out.println("*      *");
//        for(int dd = 1; dd >0; dd--) {
//        System.out.println("********");
//    }
//        System.out.println("********");
}


    }


