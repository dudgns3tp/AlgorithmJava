package String_And_Array;

public class MoveZeros {
    public static void main(String []args){
        int input[] = {0,3,2,0,8,5};
        //1 0의 개수 체크
        int cnt =0;
        int result = 0;
        for(int i=0; i<input.length; i++){
            if(input[i]==0){
                cnt++;
            }
        }

        for(int i=0; i<input.length; i++){
            if(input[i]==0 || (result==cnt)){
                Move(input, i);
                result++;
            }
        }

        for(int i=0; i<input.length; i++)
            System.out.print(input[i]+" ");
    }
    static void swap(int[] arr, int index1, int index2){
        int temp;
        temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
    }

    static void Move(int[] input, int index){
        int len = input.length;
        int distance = len - index - 1;
        for(int i= index; i<distance; i++){
            swap(input,i,i+1);
        }
    }
}
