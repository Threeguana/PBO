public class MotorDemo {
    public static void main(String[] args) {
        //Motor1 1
        Motor1 motor1 = new Motor1();
        motor1.displayStatus();

        motor1.setPlatNomor("B 0865 XZ");
        motor1.setKecepatan(120); //mengubah nilai kecepatan menjadi 50
        motor1.displayStatus();

        //Motor1 2
        Motor1 motor2 = new Motor1();
        motor2.setPlatNomor("N 5678 AB");
        motor2.setMesinOn(true); //mengubah nilai mesin menjadi on
        motor2.setKecepatan(40);
        motor2.displayStatus();

        //Motor1 3
        Motor1 motor3 = new Motor1();
        motor3.setPlatNomor("D 0865 CV");
        motor2.setMesinOn(true); //mengubah nilai mesin menjadi on
        motor3.setKecepatan(-60);
        motor3.displayStatus();
    }
}
