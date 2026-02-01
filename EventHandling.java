import java.awt.event.*;
import javax.swing.*;

public class Eventhandling extends JFrame implements ActionListener{
    JTextField resultValue;
    JTextField tf1 ;
    JTextField tf2;
    JButton addBtn;
    JButton subBtn;
    Eventhandling (){
        JLabel fValue = new JLabel("First Value");
        fValue.setBounds(30,40,100,20);
        add(fValue);
        JLabel sValue = new JLabel("Second Value");
        sValue.setBounds(30,70,100,20);
        add(sValue);
        JLabel result = new JLabel("Result");
        result.setBounds(30,100,100,20);
        add(result);

        // For text field
        JTextField tf1 = new JTextField();
        tf1.setBounds(120,40,100,20);
        add(tf1);

        JTextField tf2 = new JTextField();
        tf2.setBounds(120,70,100,20);
        add(tf2);

        JTextField resultValue = new JTextField();
        resultValue.setBounds(120,100,100,20);
        add(resultValue);
        // Buttons

        JButton addBtn = new JButton("Add");
        addBtn.setBounds(30,130,100,20);
        add(addBtn); 
        JButton subBtn = new JButton("Subtract");
        subBtn.setBounds(130,130,100,20);
        add(subBtn); 
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);


        setTitle("Action Event Handling");
        setSize(400,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        int x,y,z=0;
        x = Integer.parseInt(tf1.getText());
        y = Integer.parseInt(tf2.getText());

        if(addBtn.getActionCommand()== "Add"){
            z = x+y;
        }
        if(subBtn.getActionCommand() == "Subtract"){
            z = x - y;
        }
        resultValue.setText(String.valueOf(z));
    }

    public static void main(String[] args){
        Eventhandling eh = new Eventhandling();


    
    }
}
