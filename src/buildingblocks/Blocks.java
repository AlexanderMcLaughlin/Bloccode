/*
 * The main GUI for the IDE
 */
package buildingblocks;

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

        printButton.setText("Make New Print Block");
        printButton.setActionCommand("makeBlock");
        printButton.setMaximumSize(new java.awt.Dimension(100, 23));
        printButton.setMinimumSize(new java.awt.Dimension(100, 23));
        printButton.setPreferredSize(new java.awt.Dimension(100, 23));
        printButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printButtonMouseClicked(evt);
            }
        });
        getContentPane().add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 150, -1));

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
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainScrollPane.setViewportView(mainPanel);

        getContentPane().add(mainScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void printButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printButtonMouseClicked
        // TODO add your handling code here:
        makePrintBlock();
    }//GEN-LAST:event_printButtonMouseClicked

    /**
     * Generic function used for reseting the location of the mouse after releasing
     * a block
     */
    private void blockMouseReleased(java.awt.event.MouseEvent evt) {                                    
        // Not neccessary, but a little housekeeping never hurt anyone
        blockPress = null;
    }                                   

    /**
     * Generic function used for capturing a mouse's location when initially 
     * clicking a block
     */
    private void blockMousePressed(java.awt.event.MouseEvent evt) {                                   
        // Get the initial point the object was clicked at relative to the objects top left corner
        // Used for smooth dragging
        blockPress = evt.getPoint();
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
        
        revalidate();
        repaint();
        refreshBlocks();
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
        
        revalidate();
        repaint();
        refreshBlocks();
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
    private static javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JButton printButton;
    // End of variables declaration//GEN-END:variables
}
