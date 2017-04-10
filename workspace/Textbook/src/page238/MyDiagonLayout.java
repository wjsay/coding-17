package page238;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;

public class MyDiagonLayout implements LayoutManager { //对角线
	public void addLayoutComponent(String name, Component comp) {
		
	}
	
	public void removeLayoutComponent(Component comp) {
		
	}
	
	public Dimension preferredLayoutSize(Container parent) {
		Dimension d = null;
		Insets s = parent.getInsets();//容器四条边框尺寸
		Dimension dp = new Dimension(s.left + s.right, s.top + s.bottom);
		Component c;
		int n = parent.getComponentCount();
		
		for (int i = 0; i < n; ++i) {
			//计算组件及容器边框宽度之和及高度之和
			c = parent.getComponent(i);
			if(c.isVisible()) {
				d = c.getPreferredSize();
				dp.width += d.width;
				dp.height += d.height;
			}
		}
		return dp;
	}
	
	public Dimension minimumLayoutSize(Container parent) {
		Dimension d = null;
		Insets s = parent.getInsets(); //容器四条边框尺寸
		Dimension dp = new Dimension(0, 0);
		Component c;
		int n = parent.getComponentCount();
		for (int i= 0; i < n; ++i) {
			c = parent.getComponent(i);
			if (c.isVisible()) {
				d = c.getPreferredSize();
				if (d.width > dp.width)
					dp.width = d.width;
				if (d.height > dp.height)
					dp.height = d.height;
			}
		}
		dp.width += (s.left + s.right);
		dp.height += (s.top + s.bottom);
		return dp;
	}
	
	public void layoutContainer (Container parent) {
		//当第一次显示指定容器或该容器的大小发生变化时调用本方法
		int i;
		int n = parent.getComponentCount();
		Component c;
		Insets s = parent.getInsets();
		Dimension d;
		Dimension dp = parent.getSize();
		Dimension dr = preferredLayoutSize(parent);
		Dimension dc = new Dimension(s.left, s.right);
		Dimension dg = new Dimension(dp.width - dr.width, dp.height - dr.height);
		if (n > 1) {
			//计算组件之间的间距
			dg.width /= (n - 1);
			dg.height /= (n - 1);
		}
		for (i = 0; i < n; ++i) {
			c = parent.getComponent(i);
			if (c.isVisible()) {
				d = c.getPreferredSize();
				c.setBounds(dc.width, dc.height, d.width, d.height);
				dc.width += (dg.width + d.height);
				dc.height += (dg.height + d.height);
			}
		}
	}
}
