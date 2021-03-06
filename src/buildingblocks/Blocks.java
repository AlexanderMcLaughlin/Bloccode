/*
 * The main GUI for the IDE
 */
package buildingblocks;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 * @author Alexander
 */
public class Blocks extends javax.swing.JFrame {

    static Point blockPress = new Point();
    static HashMap<JPanel, Point> globalLocations =  new HashMap<>();
    
    static Block lastBlockClicked = null;
    
    /**
     * Creates new form Blocks
     */
    public Blocks() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        printButton = new javax.swing.JButton();
        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        optionPanel = new javax.swing.JPanel();
        printPanel = new javax.swing.JPanel();
        printOptionLabel = new javax.swing.JLabel();
        printOptionLabel1 = new javax.swing.JLabel();
        printOptionInput = new javax.swing.JTextField();
        printOptionUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1300, 650));
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1300, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printButton.setText("Print");
        printButton.setActionCommand("makeBlock");
        printButton.setMaximumSize(new java.awt.Dimension(100, 23));
        printButton.setMinimumSize(new java.awt.Dimension(100, 23));
        printButton.setPreferredSize(new java.awt.Dimension(100, 23));
        printButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printButtonMouseClicked(evt);
            }
        });
        getContentPane().add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, 200, -1));

        mainScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        mainScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        mainScrollPane.setHorizontalScrollBar(null);
        mainScrollPane.setMaximumSize(new java.awt.Dimension(1100, 600));
        mainScrollPane.setMinimumSize(new java.awt.Dimension(1100, 600));
        mainScrollPane.setPreferredSize(new java.awt.Dimension(1100, 600));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setMaximumSize(new java.awt.Dimension(1100, 20000000));
        mainPanel.setMinimumSize(new java.awt.Dimension(1100, 600));
        mainPanel.setPreferredSize(new java.awt.Dimension(1100, 500));
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPanelMouseClicked(evt);
            }
        });
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainScrollPane.setViewportView(mainPanel);

        getContentPane().add(mainScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 530));

        jButton1.setText("For");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 60, 100, -1));

        jButton2.setText("While");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 90, 100, -1));

        jButton3.setText("If");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 120, 60, -1));

        jButton4.setText("Variable");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 150, 200, -1));

        jButton5.setText("End For");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 60, 100, -1));

        jButton6.setText("End While");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 90, 100, -1));

        jButton7.setText("Else If");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 120, 80, -1));

        jButton8.setText("Else");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 120, 60, -1));

        jButton9.setText("Expression");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 180, 200, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 230, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 220, 220, 10));

        optionPanel.setBackground(new java.awt.Color(204, 204, 204));
        optionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printOptionLabel.setText("Print Options");
        printPanel.add(printOptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        printOptionLabel1.setText("Text to Output");
        printPanel.add(printOptionLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        printPanel.add(printOptionInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, -1));

        printOptionUpdate.setText("Save Updates");
        printPanel.add(printOptionUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, -1));

        optionPanel.add(printPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 300));
        printPanel.setVisible(false);

        getContentPane().add(optionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 230, 220, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void printButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printButtonMouseClicked
        // TODO add your handling code here:
        makePrintBlock();
    }//GEN-LAST:event_printButtonMouseClicked

    private void mainPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseClicked
        // If there was a selected block before, clicking on the screen will deselect it
        if(lastBlockClicked != null) {
            lastBlockClicked.setBackground(lastBlockClicked.blockColor);
            
            //printPanel.setVisible(false);
            
        }
        
        // Used to indicate no blocks selected
        lastBlockClicked = null;
        
        refresh();
    }//GEN-LAST:event_mainPanelMouseClicked

    /**
     * Generic function used for reseting the location of the mouse after releasing
     * a block
     */
    private void blockMouseReleased(java.awt.event.MouseEvent evt) {                                    
        // Not neccessary, but a little housekeeping never hurt anyone
        blockPress = null;
        
        refresh();
    }                                   

    /**
     * Generic function used for capturing a mouse's location when initially 
     * clicking a block
     */
    private void blockMousePressed(java.awt.event.MouseEvent evt) {                                   
        // Get the initial point the object was clicked at relative to the objects top left corner
        // Used for smooth dragging
        blockPress = evt.getPoint();
        
        // Used for handling the menu for block customization
        Block jp = (Block)evt.getSource();
        
        if(lastBlockClicked != null) {
            lastBlockClicked.setBackground(lastBlockClicked.blockColor);
        }
        
        // Will highlight the most recently selected block in red
        lastBlockClicked = jp;
        jp.setBackground(Color.red);
        
        //hideAllOptionPanels();
        showOptionPanel();
        
        refresh();
    }                                  

    /**
     * Generic function used for following the mouse movement and relocating
     * the block selected
     */
    private void blockMouseDragged(java.awt.event.MouseEvent evt) {                                   
        // Get the "Block" or JPanel clicked
        javax.swing.JPanel blockClicked = (javax.swing.JPanel) evt.getSource();

        // Find where the object was clicked on screen relative to the mainPanel
        Point objectClicked = mainPanel.getMousePosition(true);
        
        // Necessary to prevent null reference exception when mouse goes off screen
        // will simply handle the mouse exiting the JPanel by not moving the block
        if(objectClicked == null)
            return;
        
        // Use this to keep the mouse where it was when the object was initially clicked
        // Makes for smooth dragging and a much nicer UI
        Point newPoint = new Point((int)(objectClicked.getX()-blockPress.getX()), 
                                   (int)(objectClicked.getY()-blockPress.getY()));

        blockClicked.setLocation(newPoint);
        
        addBlockLocation(blockClicked, newPoint);
        
        refresh();
    }
    
    /**
     * Creates a generic block with a set color and location
     */
    private void makeGenericBlock() {
        
        Block gen = new Block("generic");
        
        gen.setBackground(new java.awt.Color(255, 255, 0));
        gen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                blockMouseDragged(evt);
            }
        });
        gen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                blockMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                blockMouseReleased(evt);
            }
        });
        mainPanel.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));
        
        refresh();
    }
    
    /**
     * Creates a print block
     */
    private void makePrintBlock() {
        PrintBlock gen = new PrintBlock();
        
        gen.setBackground(gen.blockColor);
        gen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                blockMouseDragged(evt);
            }
        });
        gen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                blockMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                blockMouseReleased(evt);
            }
        });
        mainPanel.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, gen.blockWidth, gen.blockHeight));
        
        refresh();
    }
    
    /*
     * Will add the block specified to the global hashmap
     */
    public static void addBlockLocation(JPanel jp, Point po) {
        if(globalLocations.containsKey(jp)) {
            updateBlockLocation(jp, po);
            return;
        }
        
        globalLocations.put(jp, po);
    }
    
    /*
     * Will update the block specified to the global hashmap
     */
    public static void updateBlockLocation(JPanel jp, Point po) {
        globalLocations.replace(jp, po);
    }
    
    /*
     * This function should be executed after every action listener
     */
    public void refresh() {
        revalidate();
        repaint();
        refreshBlocks();
    }
    
    /*
     * This function will hide all the panels
     */
    public void hideAllOptionPanels() {
        printPanel.setVisible(false);
        //refresh();
    }
    
    /*
     * This function will show the correct option panel for the last block clicked
     */
    public void showOptionPanel() {
        if(lastBlockClicked instanceof PrintBlock) {
            printPanel.setVisible(true);
        }
        
        refresh();
    }
    
    /*
     * After repainting and revalidating the block locations are reset, this will undo that reset
     */
    public static void refreshBlocks() {
        
        for(Map.Entry e : globalLocations.entrySet()) {
            
            JPanel jp = (JPanel)e.getKey();
            Point po = (Point)e.getValue();
            
            jp.setLocation(po);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Blocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Blocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Blocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Blocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Blocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private static javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private static javax.swing.JPanel optionPanel;
    private javax.swing.JButton printButton;
    private static javax.swing.JTextField printOptionInput;
    private static javax.swing.JLabel printOptionLabel;
    private static javax.swing.JLabel printOptionLabel1;
    private static javax.swing.JButton printOptionUpdate;
    private static javax.swing.JPanel printPanel;
    // End of variables declaration//GEN-END:variables
}
