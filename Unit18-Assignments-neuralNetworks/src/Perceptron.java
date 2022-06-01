
public class Perceptron {
	private int threshold;
	private double learningRate;
	private double[] weights;
	private double bias;
	
	public Perceptron(int numberInputs, int threshold, double learningRate)
	{
		this.threshold = threshold;
		this.learningRate = learningRate;
		this.weights = new double[numberInputs];
		for(int n = 0; n < numberInputs; n++)
		{
			this.weights[n] = 0.0;
		}
		this.bias = 0.0;
		System.out.print("Initial weights: " + arrayToString(this.weights));
		System.out.print("\n");
		System.out.print("Initial bias: " + this.bias + "\n");
		System.out.print("Threshold: " + this.threshold + "\n");
		System.out.print("Learning rate: " + this.learningRate + "\n");
	}
	
	public int predict(int[] inputs)
	{
		double z = this.bias;
		
		for(int n = 0; n < this.weights.length; n++)
		{
			z += inputs[n] * this.weights[n];
		}
		
		System.out.println("z = " + inputs[0] + " * " + this.weights[0] + " + " + inputs[1] + " * " + this.weights[1] + " = " + z);
		
		int activation;
		
		if(z > 0)
		{
			activation = 1;
		}
		
		else
		{
			activation = 0;
		}
		
		return activation;
	}
	
	public void train(int[][] trainingInputs, int[] labels)
	{
		for(int i = 0; i < this.threshold; i++)
		{
			System.out.println("----- Training Iteration: " + i + " -----");
			
			for(int n = 0; n < labels.length; n++)
			{
				int[] inputs = trainingInputs[n];
				int label = labels[n];
				System.out.println("Current inputs, weights, bias: " + arrayToString(inputs) + " " + arrayToString(this.weights) + " " + this.bias);
				int yhat = this.predict(inputs);
				System.out.println("Activation(yhat) = " + yhat);
				int error = label - yhat;
				System.out.println("Error = " + label + " - " + yhat + " = " + error);
				
				for(int k = 0; k < inputs.length; k++)
				{
					this.weights[k] += this.learningRate * error * inputs[k];
				}
				
				this.bias += this.learningRate * error;
				System.out.println("Updated Weights: " + arrayToString(this.weights));
				System.out.println("Updated Bias: " + this.bias);
				System.out.println();
			}
		}
	}
	
	public static String arrayToString(int[] array)
	{
		if(array.length == 0)
		{
			return "[]";
		}
		
		String result = "[" + array[0];
		
		for(int n = 0; n < array.length; n++)
		{
			result += ", " + array[n];
		}
		
		result += "]";
		
		return result;
	}
	
	public static String arrayToString(double[] array)
	{
		if(array.length == 0)
		{
			return "[]";
		}
		
		String result = "[" + array[0];
		
		for(int n = 0; n < array.length; n++)
		{
			result += ", " + array[n];
		}
		
		result += "]";
		
		return result;
	}
}
