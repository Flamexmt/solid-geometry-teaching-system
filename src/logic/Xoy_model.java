package logic;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D;

public class Xoy_model {
	double originX;//原点x坐标对应屏幕的位置
	double originY;//原点y坐标对应屏幕的位置
	double LeftX;//x轴左半长度
	double RightX;//x轴右半长度
	double UpY;//y轴上半长度
	double DownY;//y轴下半长度
	Point2D Xstart,Xend,Ystart,Yend;
	public Xoy_model(double originX,double originY,double LeftX,double RightX,double UpY,double DownY) {
		this.originX=originX;
		this.originY=originY;
		this.LeftX=LeftX;
		this.RightX=RightX;
		this.UpY=UpY;
		this.DownY=DownY;
		this.Xstart=new Point2D.Double(originX-LeftX, originY);
		this.Xend=new Point2D.Double(originX+RightX, originY);
		this.Yend=new Point2D.Double(originX, originY+UpY);
		this.Ystart=new Point2D.Double(originX, originY-DownY);


	}
	public Xoy_model() {
		
	}
	public double getOriginX() {
		return originX;
	}
	public void setOriginX(double originX) {
		this.originX = originX;
	}
	public double getOriginY() {
		return originY;
	}
	public void setOriginY(double originY) {
		this.originY = originY;
	}
	public double getLeftx() {
		return LeftX;
	}
	public void setLeftx(double leftx) {
		LeftX = leftx;
	}
	public double getRightX() {
		return RightX;
	}
	public void setRightX(double rightX) {
		RightX = rightX;
	}
	public double getUpY() {
		return UpY;
	}
	public void setUpY(double upY) {
		UpY = upY;
	}
	public double getDownY() {
		return DownY;
	}
	public void setDownY(double downY) {
		this.DownY = downY;
	}
	public Point2D getXstart() {
		return Xstart;
	}
	public void setXstart(Point2D xstart) {
		Xstart = xstart;
	}
	public Point2D getXend() {
		return Xend;
	}
	public void setXend(Point2D xend) {
		Xend = xend;
	}
	public Point2D getYstart() {
		return Ystart;
	}
	public void setYstart(Point2D ystart) {
		Ystart = ystart;
	}
	public Point2D getYend() {
		return Yend;
	}
	public void setYend(Point2D yend) {
		Yend = yend;
	}
	
	
}
