package GUI.Questions;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame() {
        setTitle("UI - Question No: 1");

        GridBagLayout newLayout = new GridBagLayout();
        // We will be use Gridbag-layout 

        GridBagConstraints gbc = new GridBagConstraints();

        JLabel name = new JLabel("Enter Name: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        newLayout.setConstraints(name, gbc);
        add(name);

        JTextField nameField = new JTextField(10);
        gbc.gridx=1;
        gbc.gridy=0;
        newLayout.setConstraints(nameField, gbc);
        add(nameField);

        JLabel address = new JLabel("Enter Address: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        newLayout.setConstraints(address, gbc);
        add(address);

        JTextField addressField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        newLayout.setConstraints(addressField, gbc);
        add(addressField);

        JLabel gender = new JLabel("Select Gender:");
        gbc.gridx = 0;
        gbc.gridy=2;
        newLayout.setConstraints(gender, gbc);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        gbc.gridx = 1;
        gbc.gridy=2;
        newLayout.setConstraints(male, gbc);

        JRadioButton female = new JRadioButton("Female");
        gbc.gridx = 2;
        gbc.gridy=2;
        newLayout.setConstraints(female, gbc);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        add(male);
        add(female);

        String cities[] = {"Biratnagar", "Kathmandu", "Bhaktapur", "Pokhara"};

        JLabel city = new JLabel("City: ");
        gbc.gridx=0;
        gbc.gridy=3;
        newLayout.setConstraints(city, gbc);
        add(city);
        
        JList<String> cityList = new JList<String>(cities);
        gbc.gridx=1;
        gbc.gridy=3;
        newLayout.setConstraints(cityList, gbc);
        add(cityList);

        JButton submit = new JButton("Submit");
        gbc.gridx=0;
        gbc.gridy=4;
        newLayout.setConstraints(submit, gbc);
        add(submit);

        JButton cancel = new JButton("cancel");
        gbc.gridx=1;
        gbc.gridy=4;
        newLayout.setConstraints(cancel, gbc);
        add(cancel);

        setLayout(newLayout);

        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class P01_question01UI {
    public static void main(String srr[]) {
        new MyFrame();
    }
}
