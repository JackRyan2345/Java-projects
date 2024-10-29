import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI2 implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JButton button;
    private JPanel panel;
    public GUI2(){
        frame = new JFrame();

        button = new JButton("Click me");
        button.addActionListener(this);

       label = new JLabel("Number of Clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new java.awt.GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, java.awt.BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My first GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main (String[] args){
        new GUI2();
    }

    public void actionPerformed (ActionEvent e){
        count++;
        label.setText("Number of clicks: " + count);
    }
}
