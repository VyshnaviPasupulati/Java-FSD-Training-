
public class NewDemo<V> {
	private V data;

	public V getData() {
		return data;
	}

	public void setData(V data) {
		this.data = data;
	}

	public NewDemo(V data) {
		super();
		this.data = data;
	}
	public static void main(String[] args) {
		NewDemo<String> d1 = new NewDemo<String>("Hello");
		//d1.setData(1000);
		
		NewDemo<Integer> d2 = new NewDemo<Integer>(1000);
		System.out.println(d2.getData() + d2.getData());
		
	}
	

}
