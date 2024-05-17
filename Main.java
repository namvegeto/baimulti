import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends JFrame {
    public Main(int utc) {
        setTitle("Simple Clock");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        JButton bt = new JButton("button");
        bt.setBounds(50,70,100,30);
        add(bt);
        JTextField jt = new JTextField();
        jt.setBounds(50,170,100,30);
        add(jt);
        Clock clock = new Clock();
        add(clock);
        clock.Start(utc);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jt.getText();
                int newUtc = Integer.parseInt(s);
                new Main(newUtc);
            }
        });
    }
    public static void main(String[] args) {
        new Main(7);
    }
}