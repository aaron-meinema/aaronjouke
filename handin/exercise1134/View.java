import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

/**
 * A graphical user interface for the calculator. No calculation is being
 * done here. This class is responsible just for putting up the display on 
 * screen. It then refers to the "CalcEngine" to do all the real work.
 * 
 * @author: Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class View

{
    private JFrame frame;
    private JTextField display;
    private JTextField display2;
    private JLabel status;

    public View(){
        makeFrame();
        frame.setVisible(true);
    }

    /**
     * Make the frame for the user interface.
     */
    private void makeFrame()
    {
        frame = new JFrame("test");

        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

        display = new JTextField(); //maak een nieuwe textfeld
        display.setText("Voeg text toe of verwijder text"); //dummy data
        display.getDocument().addDocumentListener(new DocumentListener() {

                public void changedUpdate(DocumentEvent e) {
                    System.out.println(display.getText());
                }

                public void removeUpdate(DocumentEvent e) {
                    if(display.getText().equals("")){
                        System.out.println("Het veld is leegemaakt en niet meer aanpasbaar");
                        display.setEditable(false);
                    }else{
                        System.out.println(display.getText());
                    }
                }

                public void insertUpdate(DocumentEvent e) {
                    System.out.println(display.getText());
                }

               
            });

        //display.addActionListener(this); //voeg een actionlistener toe zie actionperformed
        contentPane.add(display); //voeg dit textfeld aan postie noord toe

        /**
        display2 = new JTextField(); //maak een nieuwe textfeld
        display2.setEditable(false); //veld niet aanpasbaar
        contentPane.add(display2); //voeg dit textfeld aan postie noord toe
**/
        
        //JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        //contentPane.add(buttonPanel, BorderLayout.CENTER);
        status = new JLabel("Opdracht 11.34"); //maak een nieuwe label
        contentPane.add(status, BorderLayout.SOUTH); //voeg dit label aan positie zuid toe

        frame.pack(); //pack alles samen
    }

    /** public void actionPerformed(ActionEvent event)
    {
    String command = event.getActionCommand();
    if(command.equals("test")){
    System.out.println("test");
    }
    }**/
}
