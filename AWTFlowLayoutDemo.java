import java.awt.*;
import java.awt.event.*;

public class AWTFlowLayoutDemo extends Frame {
    public AWTFlowLayoutDemo() {
        //Frame title
        setTitle("This is my first Frame");
        setSize(600, 400);
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0)); // No spacing between rows
        setLocationRelativeTo(null);

        // Create MenuBar and Menus
        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("File");
        Menu font = new Menu("Font");
        Menu color = new Menu("Color");
        menuBar.add(file);
        menuBar.add(font);
        menuBar.add(color);
        setMenuBar(menuBar);

        // --- First Panel (White with dropdown) ---
        Panel panel1 = new Panel();
        panel1.setBackground(Color.WHITE);
        panel1.setPreferredSize(new Dimension(600, 70));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20)); // Padding inside panel

        Choice dropdown = new Choice();
        dropdown.add("Choose");
        dropdown.add("MR");
        dropdown.add("Miss");
        dropdown.add("Mrs");

        panel1.add(dropdown);

        // --- Second Panel (Red) ---
        Panel panel2 = new Panel();
        panel2.setBackground(Color.RED);
        panel2.setPreferredSize(new Dimension(600, 70));

        // --- Third Panel (Green) ---
        Panel panel3 = new Panel();
        panel3.setBackground(Color.GREEN);
        panel3.setPreferredSize(new Dimension(600, 70));

        // --- Fourth Panel (Green again) ---
        Panel panel4 = new Panel();
        panel4.setBackground(Color.GREEN);
        panel4.setPreferredSize(new Dimension(600, 70));

        // Add panels to frame
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        // Handle window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }
    public class Demo
    {
         
         public static void main(String[] args) {
        new AWTFlowLayoutDemo();
        
    }




    
}
