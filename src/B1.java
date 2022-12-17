package src;

    public class B1 extends Mark1 {

        double s1;
        double s2;
        double s3;
        double s4;

        public B1(double s1, double s2, double s3, double s4) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
            this.s4 = s4;
        }
        public double getPercentage() {
            double avreage = (s1 + s2 + s3 + s4);
            return avreage/4;
        }
    }

