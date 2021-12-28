import java.awt.*;
import java.awt.event.*;
class Fdemo extends Frame implements ActionListener
{
  Button b1[];
  int i,j,k=0;
  int x =100;
  int y=100;
  int w=100;
  int h=100;
  boolean  p = false;
  boolean q = false;
  Fdemo()
  {
		Font f =new Font ("blackadder",Font.ITALIC,40);
		setFont (f);
		setLayout(null);
		b1 = new Button[9];
		for(i =0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b1[k] = new Button("");
				add(b1[k]);
				b1[k].setSize(w,h);				
				b1[k].setLocation(x,y);		
                b1[k].addActionListener(this);				
				x = x+100;
				k++;
			}
			x=100;
			y = y+100;
		}
  }
  public void paint(Graphics g)
  {
	  if(p)
	  {
	    g.drawString("Player 1 is winner",100,70);
	  }
     if(q)
	  {
	    g.drawString("Player 2 is winner",100,70);
	  }
  }
	int c =0;
	public void actionPerformed(ActionEvent e)
	{
	   	
	 Button b = (Button)e.getSource();
	 	
	  if(c%2==0)
	 {
		b.setLabel("0"); 
	 }
	 else
	 {
		 b.setLabel("X");
	 }
	 if((b1[0].getLabel()=="0"&&b1[1].getLabel()=="0"&&b1[2].getLabel()=="0")||
	   (b1[3].getLabel()=="0"&&b1[4].getLabel()=="0"&&b1[5].getLabel()=="0")||
	   (b1[6].getLabel()=="0"&&b1[7].getLabel()=="0"&&b1[8].getLabel()=="0")||
	   (b1[0].getLabel()=="0"&&b1[4].getLabel()=="0"&&b1[8].getLabel()=="0")||
	   (b1[2].getLabel()=="0"&&b1[4].getLabel()=="0"&&b1[6].getLabel()=="0")||
	   (b1[0].getLabel()=="0"&&b1[3].getLabel()=="0"&&b1[6].getLabel()=="0")||
	   (b1[1].getLabel()=="0"&&b1[4].getLabel()=="0"&&b1[7].getLabel()=="0")||
	   (b1[2].getLabel()=="0"&&b1[5].getLabel()=="0"&&b1[8].getLabel()=="0"))
	   {
		 p = true;
		 repaint();
		 setEnabled(false);
	   }
	else if((b1[0].getLabel()=="X"&&b1[1].getLabel()=="X"&&b1[2].getLabel()=="X")||
	  (b1[3].getLabel()=="X"&&b1[4].getLabel()=="X"&&b1[5].getLabel()=="X")||
	  (b1[6].getLabel()=="X"&&b1[7].getLabel()=="X"&&b1[8].getLabel()=="X")||
	  (b1[0].getLabel()=="X"&&b1[4].getLabel()=="X"&&b1[8].getLabel()=="X")||
	  (b1[2].getLabel()=="X"&&b1[4].getLabel()=="X"&&b1[6].getLabel()=="X")||
	  (b1[0].getLabel()=="X"&&b1[3].getLabel()=="X"&&b1[6].getLabel()=="X")||
	  (b1[1].getLabel()=="X"&&b1[4].getLabel()=="X"&&b1[7].getLabel()=="X")||
	  (b1[2].getLabel()=="X"&&b1[5].getLabel()=="X"&&b1[8].getLabel()=="X"))
	 {
		 q = true;
		 repaint();
		 setEnabled(false);
	 }
	 b.removeActionListener(this);
	 c++;
 }
}

class tic_tac_toe
{
public static void main(String [] ar)
{
Fdemo f =new Fdemo();
f.setVisible(true);
f.setSize(500,500);
Color sky = new Color(0,181,226);
f.setBackground(sky);
f.setLocationRelativeTo(null);
}
}
