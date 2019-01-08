package presentation;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import logic.Analytic;
import logic.Xoy_model;

import javax.swing.JFrame;

import logic.Analytic;

public class Drawer extends JFrame implements MouseMotionListener,MouseListener{
    private Color Brushcolor;//��ˢ��ɫ
	private int Clickcount;//���������������
	private Analytic a;
	Drawer(){
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();//��ȡ��Ļ�ߴ�
		addMouseMotionListener(this);
		addMouseListener(this);
		setLayout(null);//���޲���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,800);
		setVisible(true);
		Brushcolor=Color.BLACK;//��ˢ��ʼ��ɫΪ��ɫ
		Clickcount=0;
		a=new Analytic(this);
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
		Graphics g=this.getGraphics();
		g.clearRect(0, 0, 1200, 800);
		Xoy_model xoymod=new Xoy_model(e.getX(),e.getY(),300,300,300,300);
		System.out.println(e.getX());
		System.out.println(e.getY());
		a.DrawXoy(xoymod);
		a.DrawParabola(xoymod,2, 0, 0);
		a.DrawInverse(xoymod,1);
		a.Drawlinear(xoymod,1, 0);
		System.out.println("good");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}
