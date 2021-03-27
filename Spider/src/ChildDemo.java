
public class ChildDemo<V, P> extends NewDemo<V> {
	private P temp;

	public ChildDemo(V data, P temp) {
		super(data);
		this.temp = temp;
	}

	public P getTemp() {
		return temp;
	}

	public void setTemp(P temp) {
		this.temp = temp;
	}
	public static void main(String[] args) {
		ChildDemo<String, Integer> cd = new ChildDemo<String, Integer>("Hello", 1000);
		System.out.println(cd.getData() + cd.getTemp());
	}

}
