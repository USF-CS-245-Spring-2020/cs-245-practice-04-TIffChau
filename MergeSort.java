public class MergeSort implements SortingAlgorithm
{

	public void sort(int[] a) {
		int arr = a.length;
		if (arr < 2) {
	        return;
	    }

	    int left_size = a.length/2;
	    int right_size = a.length-left_size;
	    int [] left = new int[left_size];
	    int [] right = new int[right_size];
	    System.arraycopy(a, 0, left, 0, left_size-1);
		System.arraycopy(a, left_size, right, 0, right_size);
	    
	    sort(left);
	    sort(right);
	 
	    merge(a, left, right);
	}
	public void merge(int[] target, int[] left, int[] right) {
		int indexL = 0;
		int indexR = 0;
		int indexT = 0;
	    while (indexL < left.length && indexR < right.length) 
	    {
	        if (left[indexL] <= right[indexR]) 
	        {
	            target[indexT++] = left[indexL++];
	        }
	        else 
	        {
	            target[indexT++] = right[indexR++];
	        }
	    }
	    while (indexL < left.length) {
	        target[indexT++] = left[indexL++];
	    }
	    while (indexR < right.length) {
	        target[indexT++] = right[indexR++];
	    }
		
	}
}