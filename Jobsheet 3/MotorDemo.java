public class MotorDemo {
    public static void main(String[] args) {
        //motor 1
        Motor motor1 = new Motor();
        motor1.displayStatus();
        
        motor1.setPlatNomor("B 0865 XZ");
        motor1.setKecepatan(120); //mengubah nilai kecepatan menjadi 50
        motor1.displayStatus();
        
        //motor 2
        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 5678 AB");
        motor2.setMesinOn(true); //mengubah nilai mesin menjadi on
        motor2.setKecepatan(40);
        motor2.displayStatus();
        
        //motor 3
        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 0865 CV");
        motor2.setMesinOn(true); //mengubah nilai mesin menjadi on
        motor3.setKecepatan(-60);
        motor3.displayStatus();
    }
}