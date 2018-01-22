import java.awt.Point;
import java.util.ArrayList;

public class DrawClient {

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
		    drawRefPoints(i+1);
            drawRefPointCircle(j);
        	drawArray(arr);
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			      drawRefPoints(i+1);
	              drawRefPointCircle(j);
				drawArray(arr);
			}
			arr[j + 1] = key;
	
		}

	}

	static ArrayList<CustomPoint> points;

	static int[] arr = { 1, 2, 3, 12, 10, 11, 2, 3, 4, 1, 15, 5, 3, 1, 20 };

	public static void drawRefPoints(int param) {
		double space = param * 0.05;
		StdDraw.filledRectangle(space, 0.7, 0.02, 0.01);

	}

	public static void drawRefPointCircle(int param) {
		double space = param * 0.05;
		StdDraw.filledCircle(space, 0.7, 0.02);

	}

	public static void drawArray(int[] arr) {
		try {
			Thread.sleep(500l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		StdDraw.clear();

		double cnt = 0;
		for (int t : arr) {
			cnt = cnt + 0.05;

			StdDraw.setYscale(0.5, 1);
			StdDraw.filledRectangle(cnt, 0.50, 0.01, 0.01 + t * 0.010);

		}

		//
		// double rectHeight = 0.01+arr[0]*0.010;
		// double rectHeight2 = 0.01+arr[1]*0.010;

		// double rectHeight3 = 0.01+arr[2]*0.010;
		// double rectHeight4 = 0.01+arr[3]*0.010;

		// StdDraw.filledRectangle(0.1, 0.0,0.01, rectHeight);
		// StdDraw.filledRectangle(0.2, 0.0,0.01, rectHeight2);

		// StdDraw.filledRectangle(0.3, 0.0,0.01, rectHeight3);
		// StdDraw.filledRectangle(0.4, 0.0,0.01, rectHeight4);

	}

	public static void main(String[] args) {
		Point point = new Point();
		point.setLocation(2, 54);
		StdDraw.setPenColor(StdDraw.BOOK_RED);
		StdDraw.setPenRadius(0.010);
		drawArray(arr);
		insertionSort(arr);
		// StdDraw.filledRectangle(2, 2, 1.01, rectHeight4);

	}
}
