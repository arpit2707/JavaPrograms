package JavaPrograms.JavaArray;
public class ArraySum{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+i;
        }
        System.out.print(sum);
    }
}