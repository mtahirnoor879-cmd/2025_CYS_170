import javax.swing.*;

public class Frame
{
    public static void main(String[] args) {
        int width =600;
        int height = 400;

        JFrame f = new JFrame();
        f.setLayout(null);
        f.setTitle("OOP LAB");
        f.setSize(width, height);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        JLabel l = new JLabel("OOP last lecture");
        l.setBounds(10, 10, 250, 20);
        f.add(l);

    }
}