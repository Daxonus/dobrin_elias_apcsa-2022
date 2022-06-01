
public class Perceptron {
	private double threshold;
	private double learningRate;
	private double[] weights;
	private double bias;
	
	public Perceptron(int numberInputs, double threshold, double learningRate)
	{
		this.threshold = threshold;
		this.learningRate = learningRate;
		this.weights = new double[numberInputs];
		for(int n = 0; n < numberInputs; n++)
		{
			this.weights[n] = 0.0;
		}
		this.bias = 0.0;
		System.out.print("Initial weights: ");
		for(int n = 0; n < numberInputs; n++)
		{
			System.out.print("" + this.weights[n] + " ");
		}
		System.out.print("\n");
		System.out.print("Initial bias: " + this.bias + "\n");
		System.out.print("Threshold: " + this.threshold + "\n");
		System.out.print("Learning rate: " + this.learningRate + "\n");
		
		
	}
}
