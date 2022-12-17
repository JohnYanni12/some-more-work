package src;

    public class A1 extends Mark1 {
        double s1;
        double s2;
        double s3;
        public A1(double s1, double s2, double s3) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }
        double getPercentage () {
            double avreage = (s1 + s2 + s3);
            return avreage/3;
        }
    }

