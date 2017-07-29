public class ZeroFormatArray{

static int[] zeroFormat(int arr[]){
    
    if(arr.length == 0){
        return arr;
    }
    
    int low = 0, high = arr.length - 1;
    
    while(low < high){
        
        while(arr[high] == 0 && high > low){
            high--;
        }
        
        while(arr[low] != 0 && low < high){
            low++;
        }
        
        if(arr[low] == 0){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            System.out.println("--" + arr[low] + "--" + arr[high]);
            low++;
            high--;
        }
    }

    return arr;
}

public static void main(String args[]){
        int[] arr = {0,0,0,50, 56,33,0,44,67,32,0};
        int[] arrRes = zeroFormat(arr);

        for(int i=0; i < arrRes.length; i++){
            System.out.println(arrRes[i]);
        }
    }

}