public class QuickSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		qs(a,0,a.length-1);
	}
	public void qs(int [] a, int start, int end)
	{
		if(start<end)
		{
			return;
		}
		//int pivot = partition; 
		int p = partition(a,start,end);
		qs(a,start,p-1);
		qs(a,p+1,end);
	}

	public int partition(int [] a, int start, int end)
	{
		int pivot = start;
		int left = start+1;
		int right = end;
		while(left < right)
		{
			while(left<end && a[left]<a[pivot])
			{
				++left;
			}
			while(right>=left && a[right]>a[pivot])
			{
				--right;
			}
			if(left<right)
			{
				swap(a,left,right);
			}
			swap(a,right,pivot);
			return right;
		}
		return left;
	}
	public void swap(int [] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}