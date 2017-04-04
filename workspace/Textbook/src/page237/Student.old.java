package page237;

import java.io.Serializable;

public class Student implements Serializable {
	static final long serialVersionUID = 123456L;
	String name;
	int id;
	int height;
	
	public Student (String name, int id, int height) {
		this.name = name;
		this.id = id;
		this.height = height;
	}
	
	public void output() {
		System.out.println("������" + name);
		System.out.println("ѧ�ţ�" + id);
		System.out.println("��ߣ�" + height);
	}
}
