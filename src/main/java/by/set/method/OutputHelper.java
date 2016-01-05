package by.set.method;

public class OutputHelper {
	private IOutputGenerator outputGenerator;
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
		System.out.println("Dependency Injection on setter method!");
	}
	
	public void generatorOutput() {
		System.out.println("String property of [msg] injected value is ["+msg+"]");
		outputGenerator.generatorOutput();
	}

	/*

	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
		System.out.println("Dependency Injection on setter method!");
	}*/
	
	
}
