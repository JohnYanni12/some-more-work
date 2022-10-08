public class MethodGetGrade {

    /*
    Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
Write a method to return whether given number is prime or not?
Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F */
    int getGrade(int grade) {
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade <= 90) {
            System.out.println("B");
        } else if (grade <= 80) {
            System.out.println("C");
        } else if (grade <= 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        return grade;
    }

    public static void main(String[] args) {
        MethodGetGrade obj8 = new MethodGetGrade();
        obj8.getGrade(89);


        int[][] a2 = {
                {-5,-2,-3,7},// -3
                {1,-5,-2,2},
                {1,-2,3,-4} // 2
        };    // 0  1  2  3
        int rowSum=0;
     //   int colSum = 0;

        for (int i = 0; i < a2.length; i++) {
            int j = 0;
            for (j = 0; j < a2.length; j++)
              rowSum += a2[i][j];
            if (a2[i][j] <= 0 && a2[i][j] % 2 == 0) {
                System.out.print(a2[i][j]);
            }
        }
    }
}