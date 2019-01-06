import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Analytic {
	private int width;
	private int height;
	private int originX;//ԭ��X����
	private int originY;//ԭ��Y����
	private int UnitLength=100;//���ļ��
	private Drawer d;
	private Graphics2D g;
	public Analytic (Drawer d){
		this.d=d;
		this.width=d.getWidth();
		this.height=d.getHeight();
		this.originX=this.width/2;
		this.originY=this.height/2;
	}
	void DrawXoy() {
		Graphics2D g=(Graphics2D)d.getGraphics();
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(3.0f));
		g.drawLine(0, originY, width, originY);
		g.drawLine(originX, 0, originX, height);
		g.drawString("0",originX + 2,originY +12); //��ԭ������
		for(int i=1;i*UnitLength<width-50;i++)
		{
			g.drawLine(originX+i*UnitLength,originY-1,originX+i*UnitLength,originY-6);//��X�������С����
			g.drawLine(originX - i*UnitLength, originY-1, originX - i*UnitLength, originY-6);//��X�Ḻ���С����
//			g.drawString(String.valueOf(i), originX + i*UnitLength-3, originY + 12);  // x����������
//			g.drawString(String.valueOf(i*-1),originX - i*UnitLength-3, originY + 12);  // x�Ḻ������
			//��Y��
			g.drawLine(originX+1,originY+i*UnitLength,originX+6,originY+i*UnitLength);
			g.drawLine(originX+1,originY-i*UnitLength,originX+6,originY-i*UnitLength);
			g.drawString(String.valueOf(i), originX-12, originY - i*UnitLength-3);
			g.drawString(String.valueOf(i*-1), originX-12, originY + i*UnitLength-3);
		}
	}
	void DrawParabola(double a,double b,double c){
		Graphics2D g=(Graphics2D)d.getGraphics();
		g.setStroke(new BasicStroke(3.0f));
		Point2D temp1,temp2;
		double x,y;//���ǿ���������ֵ
		g.setColor(Color.BLACK);
		x = -1.0*originX/UnitLength;
		y = a*x*x+b*x+c;
		temp1 = new Point2D.Double(this.alterX(x * UnitLength), this.alterY(y * UnitLength));
		for(int i = 0 ; i < width; i++){
			y = a*x*x+b*x+c;
			x =x + 1.0/UnitLength;//ǰ��һ������
			System.out.print(y+"  ");
			System.out.println(this.alterY(y * UnitLength));
			if ( Math.abs(y) < originY){
			temp2 = new Point2D.Double(this.alterX(x * UnitLength), this.alterY(y * UnitLength));
			g.draw(new Line2D.Double(temp1, temp2));
			temp1 = temp2;
				}
			}
		}
	void  DrawInverse(double k) {
		Graphics2D g=(Graphics2D)d.getGraphics();
		g.setStroke(new BasicStroke(3.0f));
		Point2D temp1,temp2;
		double x,y;//���ǿ���������ֵ
		g.setColor(Color.BLACK);
		x = -1.0*originX/UnitLength;
		y = k/x;
		temp1 = new Point2D.Double(this.alterX(x * UnitLength), this.alterY(y * UnitLength));
		for(int i = 0 ; i < width; i++){
			y = k/x;
			x =x + 1.0/UnitLength;//ǰ��һ������
			System.out.print(y+"  ");
			System.out.println(this.alterY(y * UnitLength));
			if ( Math.abs(y) < originY){
			temp2 = new Point2D.Double(this.alterX(x * UnitLength), this.alterY(y * UnitLength));
			g.draw(new Line2D.Double(temp1, temp2));
			temp1 = temp2;
				}
			}	
	}
	void  Drawlinear(double k,double b) {
		Graphics2D g=(Graphics2D)d.getGraphics();
		g.setStroke(new BasicStroke(3.0f));
		Point2D temp1,temp2;
		double x,y;//���ǿ���������ֵ
		g.setColor(Color.BLACK);
		x = -1.0*originX/UnitLength;
		y = k*x+b;
		temp1 = new Point2D.Double(this.alterX(x * UnitLength), this.alterY(y * UnitLength));
		for(int i = 0 ; i < width; i++){
			y = k*x+b;
			x =x + 1.0/UnitLength;//ǰ��һ������
			System.out.print(y+"  ");
			System.out.println(this.alterY(y * UnitLength));
			if ( Math.abs(y) < originY){
			temp2 = new Point2D.Double(this.alterX(x * UnitLength), this.alterY(y * UnitLength));
			g.draw(new Line2D.Double(temp1, temp2));
			temp1 = temp2;
				}
			}	
	}
	private double alterX(double x){
		return  x + originX;
	}
	private double alterY(double y){
		return -1 *( y - originY);
	}
}
