package GUI.EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Notes {
    String title;
    String note;

    Notes(String title, String note) {
        this.title = title;
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public String getNote() {
        return note;
    }
}

class MyFrame extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2, lTitle;
    JTextArea ta1, lNote;
    JButton b1;
    JButton button[] = new JButton[10];
    static int obNo = -1;
    Notes[] newNote = new Notes[10];

    MyFrame() {
        setTitle("Notes Application");

        l1 = new JLabel("Title: ");
        l1.setBounds(30, 30, 100, 25);

        t1 = new JTextField(10);
        t1.setBounds(140, 30, 200, 25);

        l2 = new JLabel("Notes: ");
        l2.setBounds(30, 70, 100, 25);

        ta1 = new JTextArea(3, 10);
        ta1.setBounds(140, 70, 200, 60);

        b1 = new JButton("Add");
        b1.setBounds(60, 150, 150, 25);

        l3 = new JLabel("No of Notes: ");
        l3.setBounds(230, 150, 100, 25);

        t2 = new JTextField(5);
        t2.setEditable(false);
        t2.setBounds(350, 150, 30, 25);
        t2.setText("" + (obNo + 1));

        l4 = new JLabel("Select Note to View --> ");
        l4.setBounds(30, 190, 200, 25);

        JPanel p1 = new JPanel();
        p1.setBounds(200, 250, 300, 200);

        lTitle = new JTextField(10);
        lTitle.setBounds(0, 0, 200, 25);
        lTitle.setEditable(false);
        p1.add(lTitle);

        lNote = new JTextArea(3, 10);
        lNote.setBounds(0, 40, 200, 60);
        lNote.setEditable(false);

        p1.add(lNote);

        p1.setLayout(null);

        add(l1);
        add(t1);
        add(l2);
        add(ta1);
        add(b1);
        add(l3);
        add(t2);
        add(l4);

        add(p1);

        b1.addActionListener(this);

        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            if (t1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Title to continue");
                t1.requestFocus();
            } else if (ta1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Write Note to continue");
                ta1.requestFocus();
            } else if (!t1.getText().isEmpty() && !ta1.getText().isEmpty()) {
                obNo++;
                newNote[obNo] = new Notes(t1.getText(), ta1.getText());
                JOptionPane.showMessageDialog(this, "Note added with title: " + t1.getText());
                t1.setText("");
                ta1.setText("");
                t2.setText("" + (obNo + 1));
                button[obNo] = new JButton(newNote[obNo].getTitle());
                button[obNo].setBounds(30, (250 + 40 * obNo), 130, 25);
                add(button[obNo]);
                button[obNo].addActionListener(this);
            }
        } else {
            for (int i = 0; i <= obNo; i++) {
                if (e.getSource() == button[i]) {
                    lTitle.setText("Title: " + newNote[i].getTitle());
                    lNote.setText(newNote[i].getNote());
                }
            }
        }
    }
}

public class P06_EventProject {
    public static void main(String arr[]) {
        new MyFrame();
    }
}
