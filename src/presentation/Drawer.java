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
    private Color Brushcolor;//笔刷颜色
	private int Clickcount;//鼠标点击次数计数器
	private Analytic a;
	Drawer(){
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();//获取屏幕尺寸
		addMouseMotionListener(this);
		addMouseListener(this);
		setLayout(null);//暂无布局
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,800);
		setVisible(true);
		Brushcolor=Color.BLACK;//笔刷初始颜色为黑色
		Clickcount=0;
		a=new Analytic(this);
	}
	
	public static void main(String[] args) {
		new Drawer();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// 拖动鼠标用圆形笔刷画出轨迹
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
