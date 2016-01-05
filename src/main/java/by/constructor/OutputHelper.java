package by.constructor;

public class OutputHelper {
	private IOutputGenerator outputGenerator;

	public void outputGenerator() {
		outputGenerator.generatorOutput();
	}

	public OutputHelper(IOutputGenerator outputGenerator) {
		System.out.println("Dependency Injection by constructor");
		this.outputGenerator = outputGenerator;
	}
}
