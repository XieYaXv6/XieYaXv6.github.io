
/**
 * Click
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Click {

    public static void main(String[] args) {

        try {
            for (int i = 0; i < 5; i++) {
                Point point = MouseInfo.getPointerInfo().getLocation();
                System.out.println(point.getX() + "---" + point.getY());
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            TODO: handle exception  -1258.0---415.0  -1069.0---418.0
        }


            JFrame frame = new JFrame("click");
            frame.setSize(250, 150);
            JButton move = new JButton("move");
            move.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    Click.Click();
                }
            });
            frame.getContentPane().add(move);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }

        public static void Click() {
            //System.out.println("click");
            int x1 = -1257;
            int y1 = 425;
            int x2 = -1047;
            int y2 = 421;
            Robot robot = null;
            try {
                robot = new Robot();
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }

            robot.mouseMove(x1+20, y1);
            robot.mousePress(16);
            robot.mouseRelease(16);


            robot.mouseMove(x1, y1);
            robot.delay(2500);
            robot.mousePress(16);
            robot.mouseRelease(16);
            robot.mouseMove(x2, y2);
            robot.delay(1000);
            robot.mousePress(16);
            robot.mouseRelease(16);
        }
    }