import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Mousekey" width=300 height=100>
  </applet>
*/

public class Mousekey extends Applet implements KeyListener,MouseListener
{
  String msg=" ";
  public void init()
  {
    addKeyListener(this);
    addMouseListener(this);
  }
  public void keyPressed(KeyEvent k)
  {
    showStatus("Key Pressed");
  }
  public void keyReleased(KeyEvent k)
  {
    showStatus("Key Released");
  }
  public void keyTyped(KeyEvent k)
  {
    msg=msg+k.getKeyChar();
    repaint();
  }
  public void mouseClicked(MouseEvent e)
  {
    showStatus("Mouse Clicked");
  }
  public void mouseEntered(MouseEvent e)
  {
    showStatus("Mouse Entered");
  }
  public void mouseExited(MouseEvent e)
  {
    showStatus("Mouse Exited");
  }
  public void mousePressed(MouseEvent e)
  {
    showStatus("Mouse Pressed");
  }
  public void mouseReleased(MouseEvent e)
  {
    showStatus("Mouse Released");
  }
  public void mouseDragged(MouseEvent e)
  {
    Graphics g=getGraphics();
    g.setColor(Color.PINK);
    g.fillOval(e.getX(),e.getY(),20,20);
  }
  public void paint(Graphics g)
  {
    g.drawString(msg,20,40);
  }
}
  
