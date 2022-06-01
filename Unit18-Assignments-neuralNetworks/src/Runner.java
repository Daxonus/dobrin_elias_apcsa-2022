
public class Runner {
	public static void main(String[] args)
	{
		int[][] inputMatrix = new int[4][2];
		inputMatrix[0][0] = 1;
		inputMatrix[0][1] = 1;
		inputMatrix[1][0] = 1;
		inputMatrix[1][1] = 0;
		inputMatrix[2][0] = 0;
		inputMatrix[2][1] = 1;
		inputMatrix[3][0] = 0;
		inputMatrix[3][1] = 0;
		
		int[] labels = new int[4];
		labels[0] = 1;
		labels[1] = 0;
		labels[2] = 0;
		labels[3] = 0;
		
		Perceptron perceptron = new Perceptron(2, 10, 1.0);
		perceptron.train(inputMatrix, labels);
		int a = 1;
		int b = 1;
		int[] inputs = new int[2];
		inputs[0] = a;
		inputs[1] = b;
		System.out.print("----- Input -----" + Perceptron.arrayToString(inputs) + "\n");
		int output = perceptron.predict(inputs);
		System.out.print("----- Output -----" + output + "\n");
	}
}
