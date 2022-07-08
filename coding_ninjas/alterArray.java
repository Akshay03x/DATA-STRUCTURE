public class alterArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int j=0,temp=0;
        for(int i=1;i<4;i++){
            if((i-j)==1){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

                if((j=i+2)>arr.length){
                    break;
                }
                else{
                    j=j+2;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}