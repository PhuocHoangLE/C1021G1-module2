package ss6_inheriance.bai_tap.bai_2_class_point2d_and_point3d;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2.3f,3.2f,4.5f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
