import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.createForm();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    }

    static class GUI {
        Actions actions = new Actions();
        JFrame jFrame = new JFrame("Page viewer");
        JPanel jPanelUrl = new JPanel();
        JTextField jTextFieldUrl = new JTextField(15);
        JLabel jLabelUrl = new JLabel("Input URL");
        JLabel jLabelStart = new JLabel("Timer before Start");
        JLabel jLabelEnd = new JLabel("Timer after End");
        JPanel jPanelTime = new JPanel();
        JTextField jTextFieldStartTime = new JTextField(5);
        JTextField jTextFieldStopTime = new JTextField(5);
        JButton buttonStart = new JButton("Start");
        JTextField jTextFieldLogin = new JTextField(10);
        JPasswordField jPasswordField = new JPasswordField(10);
        JPanel jPanelButton = new JPanel();
        JPanel jPanelTextArea = new JPanel();
        JTextArea jTextArea = new JTextArea("", 30, 40);

        public JTextField getjTextFieldStartTime() {
            return jTextFieldStartTime;
        }

        public JTextField getjTextFieldStopTime() {
            return jTextFieldStopTime;
        }

        public JTextField getjTextFieldLogin() {
            return jTextFieldLogin;
        }

        public JPasswordField getjPasswordField() {
            return jPasswordField;
        }

        public JTextField getTextField() {
            jTextFieldUrl.getText();
            return this.jTextFieldUrl;
        }

        public void createForm() {
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setSize(400, 200);
            jFrame.setLocationRelativeTo(null);
            jFrame.setLayout(new FlowLayout());
            jTextFieldUrl.setText("https://yoip.ru");
            jPanelUrl.add(jTextFieldUrl);
            jPanelUrl.add(jLabelUrl);
            jTextFieldStartTime.setText("3");
            jTextFieldStopTime.setText("6");
            jPanelTime.add(jLabelStart);
            jPanelTime.add(jTextFieldStartTime);
            jPanelTime.add(jLabelEnd);
            jPanelTime.add(jTextFieldStopTime);
            jTextArea.setEditable(false);
            jTextArea.setLineWrap(true);
            jTextArea.setWrapStyleWord(true);
            buttonStart.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("START");
                    while (true)
                        openURL();
                }
            });
            jPanelButton.add(buttonStart);
            jPanelTextArea.add(new JScrollPane(jTextArea));



            jFrame.add(jPanelUrl);
            jFrame.add(jPanelTime);
            jFrame.add(jPanelButton);
            jFrame.setVisible(true);


        }

        void openURL() {
            actions.startTorService();
            System.out.println(jTextFieldUrl.getText());
            actions.connectSelenide(jTextFieldUrl.getText(),
                    Integer.parseInt(jTextFieldStartTime.getText()),
                    Integer.parseInt(jTextFieldStopTime.getText()));
            actions.restartTorService();
        }

    }
}
