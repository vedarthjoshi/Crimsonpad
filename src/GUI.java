import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class GUI {
    
    JFrame window;
    JTabbedPane tabbedPane;
    JPanel panel1, panel2;
    JTextArea textArea, textArea2;
    JScrollPane scrollPane, scrollPane2;
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, customizeMenu;
    JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;
    
    public static void main(String[] args) {
        new GUI();
    }
    
    public GUI() {
        createWindow();
//        createTextArea();
        createPane();
        createMenuBar();
        createFileMenu();
        window.setVisible(true);
    }
    
    public void createWindow() {
        window = new JFrame("Crimson Pad");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
    }
    
//    public void createPane() {
//        tabbedPane = new JTabbedPane();
//        panel1 = new JPanel(new BorderLayout());
//        panel2 = new JPanel(new BorderLayout());
//
//        textArea = new JTextArea();
//        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        panel1.add(scrollPane, BorderLayout.CENTER);
//
//        textArea2 = new JTextArea();
//        scrollPane2 = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        panel2.add(scrollPane2, BorderLayout.CENTER);
//        
//        JButton jb = new JButton("lmao");
//        
//        
//        tabbedPane.addTab("panel1", panel1);
//        tabbedPane.addTab("panel2", panel2);
//
//        window.add(tabbedPane);
//    }
   
 public void createPane() {
     tabbedPane = new JTabbedPane();
     panel1 = new JPanel(new GridLayout(1, 2));  // Use GridLayout with one row and two columns
     panel2 = new JPanel(new GridLayout(1, 2));  // Use GridLayout with one row and two columns

     textArea = new JTextArea();
     scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     panel1.add(scrollPane);

     textArea2 = new JTextArea();
     scrollPane2 = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     panel1.add(scrollPane2);

     // Add panels to the tabbedPane
     tabbedPane.addTab("panel1", panel1);
     tabbedPane.addTab("panel2", panel2);

     window.add(tabbedPane);
 }


    
    public void createTextArea() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane);
        
        textArea2 = new JTextArea();
        scrollPane2 = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scrollPane2.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane2);
//        window.add(scrollPane2);
    }
    
    public void createMenuBar() {
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);
        
        fileMenu = new JMenu("FILE");
        menuBar.add(fileMenu);
        
        editMenu = new JMenu("EDIT");
        menuBar.add(editMenu);
        
        customizeMenu = new JMenu("CUSTOMIZE");
        menuBar.add(customizeMenu);
    }
    
    public void createFileMenu() {
    	iNew = new JMenuItem("NEW");
    	fileMenu.add(iNew);
    	
    	iOpen = new JMenuItem("OPEN");
    	fileMenu.add(iOpen);
    	
    	iSave = new JMenuItem("SAVE");
    	fileMenu.add(iSave);
    	
    	iSaveAs = new JMenuItem("SAVE AS");
    	fileMenu.add(iNew);
    	
    	iExit = new JMenuItem("EXIT");
    	fileMenu.add(iExit);
    }
}
