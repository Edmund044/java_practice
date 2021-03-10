class sth {

    public static void  main (String [ ] ss) {
       try {
           int [ ] numbers = {1,2,3,4,5};
           System.out.println(numbers[10]);
       }
       catch (Exception e){
            System.out.println("Something went wrong!!");
            //throw e;
            // throw new ArrayIndexOutOfBoundsException("Error");
       }
       finally{
           System.out.println("Executed successfully");
       }

    }
}