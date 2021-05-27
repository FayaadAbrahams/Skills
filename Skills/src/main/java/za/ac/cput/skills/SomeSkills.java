package za.ac.cput.skills;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author AbelK and Fayaad Abrahams (218221630)
 */
public class SomeSkills extends JFrame implements ActionListener {

    private JFrame frame;
    private Font ft1;
    private Font ft2;

    private JLabel lblSelectGeneralSkills;
    private JLabel lblDescription;

    private JLabel lblHardSkills;
    private JPanel panelHardSkills;
    private JComboBox cboHardSkills;
    private JComboBox cboHardSkills2;

    private JLabel lblSoftSkills;
    private JPanel panelSoftSkills;
    private JComboBox cboSoftSkills;
    private JComboBox cboSoftSkills2;

    private JPanel panelButtons;
    private JButton btnNext;
    private JButton btnSave;

    public SomeSkills() {

        super("LinkUp Job App");

        //Creating a font for Heading + Description
        ft1 = new Font("Arial", Font.BOLD | Font.ITALIC, 16);
        ft2 = new Font("Arial", Font.ITALIC, 14);

        //The code below is basically just constructing the layout of the GUI
        lblSelectGeneralSkills = new JLabel(" Select General Skills"); //First heading
        lblDescription = new JLabel("Please select two unique hard and soft skills.");
        lblSelectGeneralSkills.setFont(ft1);
        lblDescription.setFont(ft2);

        lblHardSkills = new JLabel(" Hard skills"); //Sub heading
        //Panel to for hardskills
        String listOfHardSkills[] = {"Troubleshooting", "Data Engineering", "Research", "Data Management", "Diagnostics"};
        cboHardSkills = new JComboBox(listOfHardSkills);
        cboHardSkills.setRenderer(new PromptComboBoxRenderer("**select hard skill**"));
        cboHardSkills.setSelectedIndex(-1);

        String listOfHardSkills2[] = {"Troubleshooting", "Data Engineering", "Research", "Data Management", "Diagnostics"};
        cboHardSkills2 = new JComboBox(listOfHardSkills2);
        cboHardSkills2.setSelectedIndex(-1);
        cboHardSkills2.setRenderer(new PromptComboBoxRenderer("**select hard skill**"));

        //Setting the panel for hard skills
        panelHardSkills = new JPanel();
        panelHardSkills.setLayout(new GridLayout(1, 3));
        panelHardSkills.add(lblHardSkills);
        panelHardSkills.add(cboHardSkills);
        panelHardSkills.add(cboHardSkills2);

        lblSoftSkills = new JLabel(" Soft skills");
        //First ComboBox for Second Row
        String listOfSoftSkills[] = {"Analytical Thinking", "Good Communication", "Self-driven", "Problem-Solving", "Flexibility / Adaptability"};
        cboSoftSkills = new JComboBox(listOfSoftSkills);
        cboSoftSkills.setSelectedIndex(-1);
        cboSoftSkills.setRenderer(new PromptComboBoxRenderer("**select soft skill**"));

        String listOfSoftSkills2[] = {"Analytical Thinking", "Good Communication", "Self-driven", "Problem-Solving", "Flexibility / Adaptability"};
        cboSoftSkills2 = new JComboBox(listOfSoftSkills2);
        cboSoftSkills2.setSelectedIndex(-1);
        cboSoftSkills2.setRenderer(new PromptComboBoxRenderer("**select soft skill**"));

        //Setting the panel for Soft Skills
        panelSoftSkills = new JPanel();
        panelSoftSkills.setLayout(new GridLayout(1, 3));//defining layout for softskills
        panelSoftSkills.add(lblSoftSkills);
        panelSoftSkills.add(cboSoftSkills);
        panelSoftSkills.add(cboSoftSkills2);

        //Setting the buttons, to continue to the next menu
        btnNext = new JButton("Next");
        btnSave = new JButton("Save");

        btnNext.addActionListener(this);
        btnSave.addActionListener(this);

        panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(1, 2));
        panelButtons.add(btnNext);
        panelButtons.add(btnSave);

        btnNext.setBackground(Color.ORANGE);
        btnSave.setBackground(Color.ORANGE);

    }

    public void runErrorJpane() {
        frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "Please select an actual value", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public void runCorrectJpane() {
        frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "Now redirecting you to the next page!");
    }

    public void runSaveJpane() {
        frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "SAVED!");
    }

    //ActionListeners for the Jbuttons
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
            if (cboHardSkills.getSelectedIndex() <= -1 || cboHardSkills2.getSelectedIndex() <= -1 || cboSoftSkills.getSelectedIndex() <= -1 || cboSoftSkills2.getSelectedIndex() <= -1) {
                runErrorJpane();
            } else {
                runCorrectJpane();
            }

        } else if (e.getSource() == btnSave) {
            runSaveJpane();
        }
    }

    //Sets a default value for the ComboBoxes
    class PromptComboBoxRenderer extends BasicComboBoxRenderer {

        private String prompt;

        //Set the text to display when no item has been selected
        public PromptComboBoxRenderer(String prompt) {
            this.prompt = prompt;

        }

        //Custom rendering to display the prompt text when no item is selected
        public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (value == null) {
                setText(prompt);

            }

            return this;
        }
    }

    public void setGUI() {

        this.setLayout(new GridLayout(5, 3, 12, 12)); //Structure of The GUI   

        this.add(lblSelectGeneralSkills);
        this.add(lblDescription);

        this.add(panelHardSkills);

        this.add(panelSoftSkills);

        this.add(panelButtons);

        //Setting the Frame
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        new SomeSkills().setGUI();

    }

}
