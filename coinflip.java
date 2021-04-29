
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

public class CoinFlip implements ActionListener
{
    public static JFrame jFrame;
    public static JPanel jpanel;
    private final JButton button;
    public JLabel label2;
    public JLabel label1;
    public JLabel label3;
    public int Clicks = 0;

    public CoinFlip()
    {
        jpanel = new JPanel();
        label1 = new JLabel();
        button = new JButton("Click Here");
        jpanel.setBorder(BorderFactory.createEmptyBorder(150, 150, 50, 150));
        jpanel.setLayout(new GridLayout(0, 1));
        jpanel.setBackground(Color.gray);
        jpanel.setBounds(40,80,200,200);
        
        button.setSize(200, 80);
        button.setAlignmentX(200);
        button.setAlignmentY(200);
        button.addActionListener((ActionListener) this);

        jpanel.add(button);
        jpanel.add(label1);
        
        JFrame jframe = new JFrame();
        jframe.add(jpanel, BorderLayout.NORTH);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(200, 200);
        jframe.setTitle("Coin Flip App");
        jframe.setResizable(false);
        jframe.pack();
        jframe.setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Random random = new Random();
        int side = random.nextInt(2);
        Clicks++;

        if(side == 1)
        {
        label1.setText("Heads");
        }
        else
        {
        label1.setText("Tails");
        }
        System.out.println(Clicks);
    }
    public static void main(String[] args)
    {
        new CoinFlip();
    }
}
