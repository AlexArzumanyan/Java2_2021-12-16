package lesson4;

import javax.swing.*;

public class exmp {
    public static void main(String[] args) {
SwingUtilities.invokeLater(MyWindow::new);
        System.out.println("Bye main");
    }
}
class  MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);
        setVisible(true);
    }
}
