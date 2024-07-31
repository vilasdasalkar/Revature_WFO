/* A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500. */


class Arm_num {
    public static void main(String[] args) {
        for (int n = 100; n <= 500; n++) {
            int sum = 0;
            int  temp= n;
            while (temp > 0) {
                int rem = temp % 10;
                sum = (rem*rem*rem)+sum;
                temp =temp/10;
            }
            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}