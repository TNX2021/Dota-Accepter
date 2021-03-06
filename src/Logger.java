import java.util.logging.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

class LogWindow extends JFrame {
    private int width;


    private int height;

    private JTextArea textArea = null;

    private JScrollPane pane = null;

    public LogWindow(String title, int width, int height) {
        super(title);
        setSize(width, height);
        textArea = new JTextArea();
        pane = new JScrollPane(textArea);
        getContentPane().add(pane);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method appends the data to the text area.
     *
     * @param data
     *            the Logging information data
     */
    public void showInfo(String data) {
        textArea.append(data);
        this.getContentPane().validate();
    }
}