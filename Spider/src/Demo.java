
public class Demo {
	private Object data;

	public Demo(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	public static void main(String[] args) {
		Demo d = new Demo(100);
		d.setData("Hello");
		System.out.println(d.getData());
		Demo d2 = new Demo("Hello");
		d2.setData(23.436);
		System.out.println(d2.getData());
	}

}
