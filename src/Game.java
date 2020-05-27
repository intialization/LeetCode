import javax.swing.*;
import java.awt.*;
import java.awt.event.ContainerListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;

/**
 * @author 贲阳林
 */
public class Game {

    public static void main(String[] args) {
        Frame fr = new  JFrame("one");
        fr.setSize(1080,600);
        fr.setVisible(true);
        Button certify = new Button("sure");
        certify.setSize(20,20);
        certify.setVisible(true);
        fr.add(new Button("play"));
        fr.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getLocationOnScreen());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
}
