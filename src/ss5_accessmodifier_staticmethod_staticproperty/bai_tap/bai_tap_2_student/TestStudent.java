package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.bai_tap_2_student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        student.setClasses("C0921G1");
        student.setName( "Huyen");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
