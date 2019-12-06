/*
 * This class will be used in the main GUI creation for holding data about
 * the different blocks that will be available to create
 */
package buildingblocks;

/**
 * Available constructors include:
 * one with only the type of block
 * one with the type of block and its height and width
 * and one with type, height, width, and color
 * 
 * @author Alexander
 */
public class Block extends javax.swing.JPanel{
    String blockType;
    int blockHeight;
    int blockWidth;
    
    java.awt.Color blockColor;
    
    Block(String blockType) {
        this.blockType = blockType;
    }
    
    Block(String blockType, int blockHeight, int blockWidth) {
        this.blockType = blockType;
        this.blockHeight = blockHeight;
        this.blockWidth = blockWidth;
    }
    
    Block(String blockType, int blockHeight, int blockWidth, java.awt.Color blockColor) {
        this.blockType = blockType;
        this.blockHeight = blockHeight;
        this.blockWidth = blockWidth;
        this.blockColor = blockColor;
    }
    
}
