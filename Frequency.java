package Arrays;

public class Frequency {
    static boolean isFind(int[] arr,int value){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == value){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 20, 10, 5, 20};
        int[] values = new int[list.length];

        System.out.print("Dizi : [");
        for(int x : list){
            System.out.print(x + ", ");
        }
        System.out.println("\b\b]");

        for (int i = 0; i < list.length; i++){
            int counter = 0;
            for(int j = 0; j < list.length;j++){
                if(isFind(values,list[i])){
                    values[i] = list[i];
                }
            }
            for(int j = 0; j< list.length;j++){
                if(list[i] == list[j]){
                    counter++;
                }
            }
            if(values[i] != 0){
                System.out.println(values[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
        }
    }
}
