package GUI.Layouts;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {

    MyFrame() {
        setTitle("Layouts - GridBagLayout");

        /*
         * GridBagLayout:
         * It arranges components in a grid of rows and columns,
         * but unlike GridLayout, each component can:
         * - Span multiple rows or columns
         * - Have different sizes
         * - Be aligned differently
         */
        GridBagLayout newLayout = new GridBagLayout();

        /*
         * GridBagConstraints is used to control how each component
         * is placed inside the GridBagLayout.
         * We reuse the same object and just change its values
         * before adding each component.
         */
        GridBagConstraints gbc = new GridBagConstraints();

        // Component 1: Label
        JLabel name = new JLabel("Enter Your Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        newLayout.setConstraints(name, gbc);
        add(name);
        /*
         * gbc.gridx -> column number (horizontal position)
         * gbc.gridy -> row number (vertical position)
         * 
         * (0,0) means:
         * - First column
         * - First row
         * Top-left corner of the layout grid
         * 
         * NOTE:
         * GridBagLayout uses a virtual grid.
         * If components do not fill the entire frame,
         * they may appear centered by default.
         */

        // Component 2: Text Field
        JTextField nameField = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 0;
        newLayout.setConstraints(nameField, gbc);
        add(nameField);

        /*
         * Place the text field in:
         * - Column 1 (right of the label)
         * - Same row (row 0)
         */

        // Component 3: Submit Button
        JButton submit = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 1;
        newLayout.setConstraints(submit, gbc);
        add(submit);
        // postion: row: 1, col: 0


        // Component 4: Cancel Button
        JButton cancel = new JButton("Cancel");
        gbc.gridx = 1;
        gbc.gridy = 1;
        newLayout.setConstraints(cancel, gbc);
        add(cancel);
        // postion: row: 1, col: 1


        setLayout(newLayout);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class P03_GridBagLayout {
    public static void main(String[] args) {
        new MyFrame();
    }
}
