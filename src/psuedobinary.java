public class psuedobinary {

//    Given a number, you have to represent this number as sum of minimum number of possible psuedobinary numbers. A number is said to be psuedobinary number if its decimal number consists of only two digits (0 and 1). Example: 11,10,101 are all psuedobinary numbers.
//            [10:31 PM] Sinan:
//    Input : 44
//    Output : 11 11 11 11
//
//    Explanation : 44 can be represented as sum of
//    minimum 4 psuedobinary numbers as 11+11+11+11
//
//    Input : 31
//    Output : 11 10 10
//
//    Explanation : 31 can be represented as sum of
//    minimum 3 psuedobinary numbers as 11+10+10
    // 2basamak -> 11 10 1
    // 3 basamak 111, 110, 101, 100, 11, 10, 1
    // 4 basamak 1111, 1110, 1100, 1000,1101,....

    public static void psuedoBinary(int n) {
        // Repeat below steps until n > 0
        while (n != 0) {
            int temp = n, m = 0, p = 1;

            while (temp != 0) {
                int rem = temp % 10;
                temp = temp / 10;
                if (rem != 0)
                    m += p;
                    p *= 10;
            }
            System.out.print(m + " ");
            n = n - m;
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        int x = 155;
        int bolum = 0;
        int kalan = 0;
        if (x % 11 < x % 10) {

            bolum = x/11;
            kalan = x%11;

            for (int i = 0; i < bolum; i++) {
                System.out.print("11 ");
            }
            for (int i = 0; i < kalan; i++) {
                System.out.print("1 ");
            }

        } else if (x % 11 > x % 10) {
            bolum = (int)x/10;
            kalan = x%10;

            for (int i = 0; i < bolum; i++) {
                System.out.print("10 ");
            }
            for (int i = 0; i < kalan; i++) {
                System.out.print("1 ");
            }

        }
        System.out.println();
        System.out.println("--------------------------------");

        psuedoBinary(41565767);
    }


}
