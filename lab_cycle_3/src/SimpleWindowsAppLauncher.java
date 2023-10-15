import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SimpleWindowsAppLauncher extends JFrame {
    public SimpleWindowsAppLauncher() {
        setTitle("Simple Windows App Launcher");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton notepadButton = new JButton("Notepad");
        JButton calculatorButton = new JButton("Calculator");
        JButton wordpadButton = new JButton("WordPad");

        notepadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                launchApp("notepad.exe");
            }
        });

        calculatorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                launchApp("calc.exe");
            }
        });

        wordpadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                launchApp("write.exe"); // WordPad
            }
        });

        JPanel panel = new JPanel();
        panel.add(notepadButton);
        panel.add(calculatorButton);
        panel.add(wordpadButton);
        add(panel);
    }

    private void launchApp(String appName) {
        try {
            Runtime.getRuntime().exec(appName);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error launching the application.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleWindowsAppLauncher().setVisible(true);
            }
        });
    }
}

