class OuterClass {
    int x = 5;
    class InnerClass {
      int y = 7;
    }
}
class Main{
    public static void main(String [ ] args){

      OuterClass myOuter = new OuterClass();
      OuterClass.InnerClass myInner = myOuter.InnerClass();
      System.out.println(myOuter.x + myInner.y);

    }

}