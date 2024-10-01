
abstract class A{
    public abstract void show();
        
}
public class demo3 {
    public static void main(String[] args) {
        
        A obj=new A()
      {
        public void show(){
            System.out.println("in new show");
        }
        public void config(){
            System.out.println("in config");
        }
      };
        obj.show();
    }
}
