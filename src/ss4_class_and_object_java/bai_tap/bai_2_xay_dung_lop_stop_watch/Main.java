package ss4_class_and_object_java.bai_tap.bai_2_xay_dung_lop_stop_watch;

public class Main {
    public static void main(String[] args) {
        BuildClassStopWatch thoiGian = new BuildClassStopWatch();

        System.out.println(  thoiGian.start());
        System.out.println( thoiGian.end());
        System.out.println(thoiGian.getElapsetTime());
    }
}
