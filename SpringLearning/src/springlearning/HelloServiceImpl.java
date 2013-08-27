package springlearning;

public class HelloServiceImpl implements HelloService {
	private String greeting;
	
	@Override
	public String getGreeting() {
		return "hello " + greeting;
	}
	
	public void setGreeting(String greeting){
		this.greeting = greeting;
		System.out.println("…Ë÷√ greeting  Ù–‘");
	}

}
