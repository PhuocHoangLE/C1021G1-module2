package ss2_loop_to_java.bai_tap;

public class PrimeNumber {
    public static void main(String[] args) {
        int status = 1;
        int num = 3;
        System.out.println("20 số nguyên tố đầu tiên là:");
        for ( int i = 2 ; i <= 20 ;) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num % j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
        }
    }

