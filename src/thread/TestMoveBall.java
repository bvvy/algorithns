package thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bvvy on 2017/6/30.
 */
public class TestMoveBall extends JFrame{

    public static void main(String[] args) {
        new TestMoveBall();
    }
    private MyPanel mp;
    private JButton jb;
    private Thread thread;
    public TestMoveBall() {
        this.setSize(600, 500);
        this.setLocation(200,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jb = new JButton("移动小球");
        mp = new MyPanel(40, 40);
        jb.addActionListener(new BtnClickEvent());
        thread = new Thread(mp);
        this.add(jb, BorderLayout.NORTH);
        this.add(mp);
        this.setVisible(true);
    }

    class BtnClickEvent  implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jb) {
                thread.start();
            }
        }
    }

    class MyPanel extends JPanel implements Runnable{

        int x , y ;

        public MyPanel(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.fillOval(x, y, 40, 40);
        }

        @Override
        public void run() {
            try {
                for(int i=0;i<20;i++) {
                    mp.x += 3;
                    mp.repaint();
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
