import java.io.PrintStream;

class MaxPlotArea {
	
	PrintStream standardOut = System.out;
	int width = 10;	
	

	public int maxPlotArea(int input[]) {
		int maxArea = -1;
		int minLength = input[0];
		for (int i = 0; i < input.length; i++) {
			int number = input[i];
			if (number < minLength)
				minLength= number;
					}
		maxArea = width * minLength * 4;
		return maxArea;

	}

	public static void main(String[] args) {
		
		
		int length[]={30,40,25,20};
		MaxPlotArea ref=new MaxPlotArea();
		int maxArea=ref.maxPlotArea(length);
//		System.out.println(maxArea);
//		System.err.print(maxArea);
		ref.standardOut.println(maxArea);
		
		}

}