import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Drawer extends JFrame implements MouseMotionListener,MouseListener{
    private Color Brushcolor;//��ˢ��ɫ
	private int Clickcount;//���������������
	
	Drawer(){
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();//��ȡ��Ļ�ߴ�
		addMouseMotionListener(this);
		addMouseListener(this);
		setLayout(null);//���޲���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(screenSize.width,screenSize.height);
		setVisible(true);
		Brushcolor=Color.BLACK;//��ˢ��ʼ��ɫΪ��ɫ
		Clickcount=0;
	}
	
	public static void main(String[] args) {
		new Drawer();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// �϶������Բ�α�ˢ�����켣
		Graphics g=this.getGraphics();
		g.setColor(Brushcolor);
		
		g.fillOval(e.getX(), e.getY(), 10, 10);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
