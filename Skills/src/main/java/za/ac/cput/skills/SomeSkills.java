/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.skills;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author AbelK
 */
public class SomeSkills {

    private JLabel lblSelectGeneralSkills;
    private JFrame mainFrame;
    private JPanel panelNorth, panelWest, panelEast, panelSouth, panelCenter;
    private Font ft1;

    private JLabel lblHardSkills;
    private JPanel panelHardSkills;
    private JCheckBox chkTroubleShoot;
    private JCheckBox chkResearch;
    private JCheckBox chkDataEngineering;
    private JCheckBox chkDataManagement;
    private JCheckBox chkDiagnostics;
    
    private JLabel lblErrorHardSkills;

    private JLabel lblSoftSkills;
    private JPanel panelSoftSkills;
    private JCheckBox chkAnalytical;
    private JCheckBox chkGoodCom;
    private JCheckBox chkSelfdri;
    private JCheckBox chkProblemSolve;
    private JCheckBox chkFlexibility;

    private JButton btnSave;
    private JButton btnNext;

    public SomeSkills() {

        mainFrame = new JFrame("LinkUp Job App");
        panelCenter = new JPanel();
        panelNorth = new JPanel();
        panelSouth = new JPanel();
        
        //Used to set the font for specific things
        ft1 = new Font("Helvetica", Font.BOLD, 15);

        //The code below is basically just constructing the layout of the GUI
        lblSelectGeneralSkills = new JLabel(" Select General Skills"); //First heading
        lblSelectGeneralSkills.setFont(ft1);
         

        lblHardSkills = new JLabel(" Hard skills"); //Sub heading
        panelHardSkills = new JPanel(); //Panel to for hardskills
        chkTroubleShoot = new JCheckBox("Troubleshooting");
        chkDataEngineering = new JCheckBox("Data Engineering");
        chkResearch = new JCheckBox("Research");
        chkDataManagement = new JCheckBox(" Data Management ");
        chkDiagnostics = new JCheckBox(" Diagnostics ");
        panelHardSkills.setLayout(new GridLayout(2, 3));//defining layout for hardskills
        panelHardSkills.add(chkTroubleShoot);//adding skills to the panel
        panelHardSkills.add(chkDataEngineering);
        panelHardSkills.add(chkResearch);
        panelHardSkills.add(chkDataManagement);
        panelHardSkills.add(chkDiagnostics);

        lblSoftSkills = new JLabel(" Soft skills");//Sub heading
        panelSoftSkills = new JPanel();//panel for softskills
        chkAnalytical = new JCheckBox("Analytical Thinking");
        chkGoodCom = new JCheckBox("Good Communication");
        chkSelfdri = new JCheckBox("Self-driven");
        chkProblemSolve = new JCheckBox("Problem-Solving");
        chkFlexibility = new JCheckBox("Flexibility / Adaptability");
        panelSoftSkills.setLayout(new GridLayout(2, 3));//defining layout for softskills
        panelSoftSkills.add(chkAnalytical);//adding skills to the panel
        panelSoftSkills.add(chkGoodCom);
        panelSoftSkills.add(chkSelfdri);
        panelSoftSkills.add(chkProblemSolve);
        panelSoftSkills.add(chkFlexibility);

        //Setting the buttons, to continue to the next menu
        btnNext = new JButton("Next");
        btnSave = new JButton("Save");

    }

    public void setGUI() {

        panelCenter.setLayout(new GridLayout(5, 3));
        panelNorth.setLayout(new GridLayout(1, 3));
        panelSouth.setLayout(new GridLayout(1, 4));

        panelNorth.add(lblSelectGeneralSkills);

        panelCenter.add(lblHardSkills);
        panelCenter.add(panelHardSkills);

        panelCenter.add(lblSoftSkills);
        panelCenter.add(panelSoftSkills);

        panelSouth.add(btnNext);
        panelSouth.add(btnSave);

        //Setting the JFrame
        mainFrame.setLocationRelativeTo(null);
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        mainFrame.add(panelSouth, BorderLayout.SOUTH);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.show();

    }

    public static void main(String[] args) {

        new SomeSkills().setGUI();

    }

}
