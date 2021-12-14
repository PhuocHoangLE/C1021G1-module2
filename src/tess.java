public class tess {
    static void total(String name , int age){
        System.out.println(name+ " I just got execute " + age);
    }
    static int nums(int x){
        return 5 + x ;
    }
    static int c(int q,int w){
        return q + w ;
    }
    static double g(double q , double w){
        return q + w ;
    }
    public static void main(String[] args) {
        total("Hoang" , 5);
        System.out.println(nums(10)) ;
        int total1 = c(8,5) ;
        double total2 = g(3.2,5.4) ;
        System.out.println("Int : " +total1);
        System.out.println("Double :"+total2);
        }
}
