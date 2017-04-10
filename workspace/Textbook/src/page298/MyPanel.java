package page298;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;
import java.awt.Point;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JFrame {
	private Vector<Vector<Point>> vectorSet = 
			new Vector<Vector<Point>>();
	
	public MyPanel() {
		addMouseListener (new MouseListener(){
			public void mouseClicked(MouseEvent e){
				
			}
			
			public void mouseEntered(MouseEvent e) {
				
			}
			
			public void mouseExited(MouseEvent e) {
				
			}
			
			public void mousePressed(MouseEvent e) {
				Point p = new Point(e.getX(), e.getY());
				Vector<Point> v = new Vector<Point>();//新的笔画
				v.add(p);
				vectorSet.add(v);
			}
			
			public void mouseReleased(MouseEvent e) {
				
			}
		}//实现接口MouseListener的内部类结束
	); //addMouseListener方法调用结束
		
		addMouseMotionListener(new MouseMotionListener(){
			public void mouseMoved(MouseEvent e){
				
			}
			
			public void mouseDragged(MouseEvent e) {
				Point p = new Point(e.getX(), e.getY());
				int n = vectorSet.size() - 1;
				Vector<Point> v = vectorSet.get(n);
				v.add(p);//添加笔画中间点或终点
				repaint();
			} //方法mouseDragged结束
		});//addMouseMotionListener方法调用结束
	} //MyPanel构造方法结束
	
	protected void paintComponent(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());//清除背景
		Vector<Point> v;
		Point s, t;
		int i, j, m;
		int n = vectorSet.size();
		for (i = 0; i < n; ++i) {
			v = vectorSet.get(i);
			m = v.size() - 1;
			for (j = 0; j < n; ++j) {
				s = (Point)v.get(j);
				t = (Point)v.get(j + 1);
				g.drawLine(s.x, s.y, t.x, t.y);
			}
		}
		
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(250, 120);
	}
}
