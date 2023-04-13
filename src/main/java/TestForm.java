import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.awt.BorderLayout.CENTER;

class TestForm extends JPanel {
    private final AtomicInteger counter;
    private JButton button1;
    private JLabel label1;
    private JPanel panel1;

    TestForm() {
        setLayout(new BorderLayout());

        counter = new AtomicInteger();
        button1.addActionListener(e -> label1.setText(Integer.toString(counter.incrementAndGet())));

        add(panel1, CENTER);
    }
}
