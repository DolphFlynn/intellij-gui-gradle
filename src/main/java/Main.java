import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {
    public Main() {
        setMinimumSize(new Dimension(400, 200));
        getContentPane().add(new TestForm());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
