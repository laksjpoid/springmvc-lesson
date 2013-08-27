package springlearning;

public class MyBean {
	private String name;
	private int value;
	private HelloService hello;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public HelloService getHello() {
		return hello;
	}
	public void setHello(HelloService hello) {
		this.hello = hello;
	}
	
}
