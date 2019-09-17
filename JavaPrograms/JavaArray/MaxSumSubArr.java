package JavaPrograms.JavaArray;
public class MaxSumSubArr{
    public static void main(String args[]) {
        int arr[]={10,-5,-3,4,2,12,-8,-12,19};
	    int max_far=0,current_max=0,index=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        current_max=current_max+(arr[i]);
	        if(current_max>max_far)
	        {
	            max_far=current_max;
	            index=i;
	        }
	    }
	    System.out.println("max sub is"+max_far);
	    int current_max1=0;
	    System.out.println("index is"+index);
	    for(int j=index;index>=0;index--)
	    {
	        current_max1=current_max1+arr[index];
	       
	        if(current_max1>=max_far)
	        {
	            System.out.println("index is"+index);
	            return;
	        }
	    }
		System.out.println("Hello World");
    }
}