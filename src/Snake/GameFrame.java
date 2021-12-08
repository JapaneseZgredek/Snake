package Snake;

import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        this.add(new GamePanel());  // Adding Panel to our Frame
        this.setTitle("Snake Game"); //Setting title
        this.setResizable(false); // our frame wont be resizable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // our application will close when we close the window
        this.pack(); // this will pack around our components that we add to the frame
        this.setVisible(true); // shows window on our screen
        this.setLocationRelativeTo(null); // window will appear in the center of our window
    }
}
