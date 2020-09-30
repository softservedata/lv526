package forMe.appFirs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Appl extends JFrame {

    private static final long serialVersion = 1L;
    //
    private JLabel tLabel = new JLabel("Time : ");
    private JTextField tOutput = new JTextField("", 15);
    private JButton buttonTime = new JButton(" Start ");
    private JButton buttonExit = new JButton(" Exit  ");
    private JPanel centralPanel = new JPanel(new GridLayout(2, 2, 5, 5));


    public void settOutput(String textOutput) {
        tOutput.setText(textOutput);
    }

    public Appl() {
        super("Nazariy Clock");
        this.setBounds(100, 100, 250, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        centralPanel.add(tLabel);
        centralPanel.add(tOutput);
        centralPanel.add(buttonTime);
        centralPanel.add(buttonExit);
        Container container = this.getContentPane();
        container.add(centralPanel, BorderLayout.CENTER);
        //
        buttonTime.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //   long ms = System.currentTimeMillis();
                //   while (System.currentTimeMillis() - ms < 5000) {
                //       tOutput.setText(new Long(System.currentTimeMillis()).toString());
                //       System.out.println(tOutput.getText());
                //   }
                //  tOutput.setText(new Long(System.currentTimeMillis()).toString());
            Runnable r = new WorkTime(Appl.this);
            Thread t = new Thread(r);
            t.start();
                System.out.println(tOutput.getText());
                System.out.println("buttonTime : Thread ID : " + Thread.currentThread());
            }
        });
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });

    }
}
