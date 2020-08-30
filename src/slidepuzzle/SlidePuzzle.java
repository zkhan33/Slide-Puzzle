package slidepuzzle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SlidePuzzle extends JFrame {

    public static void main(String[] args) {
        SlidePuzzle sp = new SlidePuzzle();
        sp.setLocationRelativeTo(null);
        sp.setVisible(true);
    }
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private int previousXaxis;
    private int emptyXaxis = 400;
    private int previousClick;
    private int emptyYaxis = 400;
    private int previousYaxis;

    public SlidePuzzle() {
        this.setTitle("Slide Puzzle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 622);
        this.setLayout(null);
        int[][] nums = new int[][] //Multi Dimensional Array (Array inside an array)
        {
            {0, 0}, 
            {200, 0},
            {400, 0},
            {0, 200},
            {200, 200},
            {400, 200},
            {0, 400},
            {200, 400}
        };
        
        Collections.shuffle(Arrays.asList(nums));

        b1 = new JButton("1");
        b1.setSize(200, 200);
        b1.setLocation(nums[0][0], nums[0][1]);
        b2 = new JButton("2");
        b2.setSize(200, 200);
        b2.setLocation(nums[1][0], nums[1][1]);
        b3 = new JButton("3");
        b3.setSize(200, 200);
        b3.setLocation(nums[2][0], nums[2][1]);
        b4 = new JButton("4");
        b4.setSize(200, 200);
        b4.setLocation(nums[3][0], nums[3][1]);
        b5 = new JButton("5");
        b5.setSize(200, 200);
        b5.setLocation(nums[4][0], nums[4][1]);
        b6 = new JButton("6");
        b6.setSize(200, 200);
        b6.setLocation(nums[5][0], nums[5][1]);
        b7 = new JButton("7");
        b7.setSize(200, 200);
        b7.setLocation(nums[6][0], nums[6][1]);
        b8 = new JButton("8");
        b8.setSize(200, 200);
        b8.setLocation(nums[7][0], nums[7][1]);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movebutton(b1);

            }

        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movebutton(b2);

            }

        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movebutton(b3);

            }

        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movebutton(b4);

            }

        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movebutton(b5);

            }

        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movebutton(b6);

            }

        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movebutton(b7);

            }

        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movebutton(b8);

            }

        });

    }

    public void movebutton(JButton x) {
        previousXaxis = x.getX();
        previousYaxis = x.getY();
        if (previousXaxis == emptyXaxis) {
            if (Math.abs(previousYaxis - emptyYaxis) == 200) { // 200 pixels apart
                x.setLocation(emptyXaxis, emptyYaxis);
                emptyXaxis = previousXaxis;
                emptyYaxis = previousYaxis;
            }

        } else if (previousYaxis == emptyYaxis) {
            if (Math.abs(previousXaxis - emptyXaxis) == 200) {
                x.setLocation(emptyXaxis, emptyYaxis);
                emptyXaxis = previousXaxis;
                emptyYaxis = previousYaxis;
            }

        }
        
        if (b1.getX() == 0 && b1.getY() == 0 && b2.getX() == 200
                && b2.getY() == 0 && b3.getX() == 400 && b3.getY() == 0
                && b4.getX() == 0 && b4.getY() == 200 && b5.getX() == 200
                && b5.getY() == 200 && b6.getX() == 400 && b6.getY() == 200
                && b7.getX() == 0 && b7.getY() == 400 && b8.getX() == 200
                && b8.getY() == 400) {
            JOptionPane.showMessageDialog(null, "You Won!");
            int dbr = JOptionPane.showConfirmDialog(null, "Would You like to Play Again?",
                    " ", JOptionPane.YES_NO_OPTION);
            if (dbr == 0) {
                SlidePuzzle sp = new SlidePuzzle();
                sp.setLocationRelativeTo(null);
                sp.setVisible(true);
            } else {

                System.exit(0);
            }System.out.println("");
        }

    }

}
