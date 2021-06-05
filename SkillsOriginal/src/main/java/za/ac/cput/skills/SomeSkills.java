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
public class SomeSkills extends JFrame {
    
 private JLabel lblSelectGeneralSkills;
  
  private JLabel lblHardSkills;
  private JPanel panelHardSkills; 
  private JCheckBox chkTroubleShoot;
  private JCheckBox chkResearch;
  private JCheckBox chkDataEngineering;
  private JCheckBox chkDataManagement ;
  private JCheckBox chkDiagnostics ;
  
  private JLabel lblErrorHardSkills;
  
  private JLabel lblSoftSkills;
  private JPanel panelSoftSkills;
  private JCheckBox chkAnalytical;
  private JCheckBox chkGoodCom;
  private JCheckBox chkSelfdri;
  private JCheckBox chkProblemSolve ;
  private JCheckBox chkFlexibility ;   
    
    
  public SomeSkills(){
  
       super("LinkUp Job App");
       
       //The code below is basically just constructing the layout of the GUI
       
    lblSelectGeneralSkills = new JLabel(" Select General Skills"); //First heading
    
    lblHardSkills = new JLabel(" Hard skills"); //Sub heading
    panelHardSkills = new JPanel(); //Panel to for hardskills
    chkTroubleShoot = new JCheckBox("Troubleshooting");
    chkDataEngineering = new JCheckBox("Data Engineering");
    chkResearch = new JCheckBox("Research");
    chkDataManagement = new JCheckBox(" Data Management ");
    chkDiagnostics = new JCheckBox(" Diagnostics ");
    panelHardSkills.setLayout(new GridLayout(2,3));//defining layout for hardskills
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
    panelSoftSkills.setLayout(new GridLayout(2,3));//defining layout for softskills
    panelSoftSkills.add(chkAnalytical);//adding skills to the panel
    panelSoftSkills.add(chkGoodCom);
    panelSoftSkills.add(chkSelfdri);
    panelSoftSkills.add(chkProblemSolve);
    panelSoftSkills.add(chkFlexibility);
    
  
  }  
    
    
     public void setGUI(){
  
        
     this.setLayout(new GridLayout(6,3)); //layout for everthing in GUI   
        
     this.add(lblSelectGeneralSkills);
     
     this.add(lblHardSkills);
     this.add(panelHardSkills);
     
     this.add(lblSoftSkills);
     this.add(panelSoftSkills);
 
    this.pack();
    this.setLocationRelativeTo(null);
    //this.setSize(400,400);
    this.setVisible(true);
  
  
  
    }
        
     
     public static void main(String[] args) {
        
         new SomeSkills().setGUI();
         
         
         
    }
    
    
    
    
    
    
    
    
    
    
}
