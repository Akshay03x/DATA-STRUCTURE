public class selectionSort{

    public static void sortArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    min_index=j;
                }
            }
            if(min_index!=i){
                arr[min_index]=arr[i];
                arr[i]=min;
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,62,34,8,0};
        sortArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}