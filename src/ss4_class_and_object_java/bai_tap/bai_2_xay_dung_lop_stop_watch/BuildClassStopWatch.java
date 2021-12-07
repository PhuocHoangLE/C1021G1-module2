package ss4_class_and_object_java.bai_tap.bai_2_xay_dung_lop_stop_watch;

public class BuildClassStopWatch {
    long startTime ;
    long endTime ;

    public BuildClassStopWatch(){
    }
    public long getStartTime() {

        return this.startTime;
    }

    public long getEndTime() {

        return this.endTime;
    }

    public long setStartTime(long a) {

        return this.startTime = a;
    }

    public long setEndTime(long b) {

        return this.endTime = b;
    }

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long end() {

        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsetTime() {
        return this.endTime - this.startTime;
    }

}
