package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.thuc_hanh_2_car;

import ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.thuc_hanh_1_student.Student;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println( Car.numberOfCars);

    }
}
