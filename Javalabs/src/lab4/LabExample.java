package lab4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LabExample extends JFrame
{
    JLabel Result = new JLabel("Result: 0 X 0");
    JLabel LastScorer = new JLabel("Last Scorer: N/A");
    Label Winner = new Label("Winner: DRAW");
    JButton ACMilan = new JButton("AC Milan");
    JButton RealMadrid = new JButton("Real Madrid");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    int mad=0,real=0;
    LabExample()
    {
        super("Lab4");
        setLayout(new BorderLayout());
        setSize(420,140);
        add(LastScorer, BorderLayout.NORTH);
        add(Winner, BorderLayout.SOUTH);
        add(Result, BorderLayout.CENTER);
        add(ACMilan, BorderLayout.WEST);
        add(RealMadrid, BorderLayout.EAST);
        LastScorer.setFont(fnt);
        ACMilan.setFont(fnt);
        RealMadrid.setFont(fnt);
        Winner.setFont(fnt);
        Result.setFont(fnt);

        ACMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    mad++;
                    LastScorer.setText("Last Scorer: AC Milan");
                    if(mad>real) Winner.setText("Winner: AC Milan");
                    else if(mad==real) Winner.setText("Winner: DRAW");
                    else Winner.setText("Winner: Real Madrid");
                    Result.setText("Result: "+mad+" X "+real);
            }
        });
        RealMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                real++;
                LastScorer.setText("Last Scorer: Real Madrid");
                if(mad>real) Winner.setText("Winner: AC Milan");
                else if(mad==real) Winner.setText("Winner: DRAW");
                else Winner.setText("Winner: Real Madrid");
                Result.setText("Result: "+mad+" X "+real);
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new LabExample();
    }
}