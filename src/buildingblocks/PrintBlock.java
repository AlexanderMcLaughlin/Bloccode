/*
 * This class will be used for all print block objects
 */
package buildingblocks;

/**
 *
 * @author Alexander
 */
public class PrintBlock extends Block{
    
    //Simple constructor will call the super class' constructor with specific args
    PrintBlock() {
        super("print", 100, 100, new java.awt.Color(0,0,0));
    }
    
}
