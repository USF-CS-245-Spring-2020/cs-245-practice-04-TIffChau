public class QuickSort implements SortingAlgorithm {
	public void sort(int[] a) 
	{
		qs(a,0,a.length-1);
	}
	
	public void qs(int[] a, int start, int end) 
	{
		if(start > end)
		{
			return;
		}
		if(start < end) 
		{
			int p = partition(a, start, end);
			qs(a, start, p-1);
			qs(a, p+1, end);
		}
	}
	
	public int partition(int[] a, int start, int end) {
		if(start < end) {
			int pivot = start;
			int left = start + 1;
			int right = end;
			while(left < right) {
				while(left < end && a[left] <= a[pivot])
					++left;
				while(right >= left && a[right] > a[pivot])
					--right;
				if(left < right)
					swap(a, left, right);				
			}
			if(a[right] < a[pivot])
				swap(a, right, pivot);
			return right;
		}
		return start;
	}
	
	public void swap(int[] a, int left, int right) {
		int temp=a[left];
		a[left]=a[right];
		a[right]=temp;
		
	}

}