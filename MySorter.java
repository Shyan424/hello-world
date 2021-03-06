public class MySorter {
	public double[] sort(double[] d) {
		if (d.length == 0) {  // ddddddddddddddddddddd
			double[] d2 = {}; // cccccccccccccc
			return d2;
		} else if(smallZero(d)) {	//dddddddddddddddddddddddddddddddd
			return d;
		} else {
			for (int i = 0; i < d.length - 1; i++) {
				for (int j = 0; j < d.length - i - 1; j++) {
					if (d[j] > d[j + 1]) {
						swap(d, j, j + 1);
					}
				}
			}
			return d;
		}

	}
	
	public boolean smallZero(double d[]) {
		for(int i = 0; i < d.length; i++) {
			if (d[i] < 0) {
				return true;
			}
		}
		return false;
	}

	public void swap(double d[], int k, int s) {
		double temp = d[k];
		d[k] = d[s];
		d[s] = temp;
	}
}