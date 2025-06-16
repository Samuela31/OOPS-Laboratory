import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TrafficLightApplet extends Applet implements ItemListener {
   CheckboxGroup cbg;
   Checkbox red, yellow, green;
   Label messageLabel;
   String message = "";

   public void init() {
      setLayout(new FlowLayout());

      //create radio buttons
      cbg = new CheckboxGroup();
      red = new Checkbox("Red", cbg, false);
      yellow = new Checkbox("Yellow", cbg, false);
      green = new Checkbox("Green", cbg, false);

      //add radio buttons to the applet
      add(red);
      add(yellow);
      add(green);

      //add item listeners to the radio buttons
      red.addItemListener(this);
      yellow.addItemListener(this);
      green.addItemListener(this);

      //create label for the message
      messageLabel = new Label();

      //add label to applet
      add(messageLabel);
   }

   public void itemStateChanged(ItemEvent e) {
      Checkbox selected = cbg.getSelectedCheckbox();

      if (selected == red) {
         message = "Stop";
         messageLabel.setForeground(Color.RED);
      } else if (selected == yellow) {
         message = "Ready";
         messageLabel.setForeground(Color.YELLOW);
      } else if (selected == green) {
         message = "Go";
         messageLabel.setForeground(Color.GREEN);
      }

      repaint();
   }

   public void paint(Graphics g) {
      //display the message
      messageLabel.setText(message);
   }

   public static void main(String[] args) {
        TrafficLightApplet traffic= new TrafficLightApplet ();
        traffic.init();
        traffic.start();
    }
}
