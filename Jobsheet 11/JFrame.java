import javax.swing.JFrame;

public class JFrame {
    public static void main(String[] args) {
        // membuat objek JFrame
        JFrame frame = new JFrame("My app");

        // membuat ukuran jendela
        frame.setSize(300, 200);

        // menutup apk ketika di close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // hanya untuk streak hehe

        // menampilkan jendela
        frame.setVisible(true);
    }
}
