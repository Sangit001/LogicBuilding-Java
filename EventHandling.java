import javax.swing.*;

public class EventHandling extends JFrame{
    EventHandling(){
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


        setTitle("Action Event Handling");
        setSize(400,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        EventHandling eh = new EventHandling();


    }
}