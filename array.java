class Myarray{
    public static void main () {
        int [ ] array = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0;i<array.length;i++){
           sum +=array[i];
        }
        System.out.println(sum);
    }
}