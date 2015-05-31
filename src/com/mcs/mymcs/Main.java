package com.mcs.mymcs;

import javax.swing.SwingUtilities;

/**
 * The Main class.
 * @author Wilsonator5000
 */
public class Main {

    public Main() {
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main();
        });
    }
}
