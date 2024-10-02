class A{
    int age;

    public void show(){
        System.out.println("in show -A");
    }   
}
public class demo2 {
    public static void main(String[] args) {
        
        A obj=new A(){
            public void show(){
                System.out.println("in show NEW");
            }
        };
        obj.show();

        
    }
}
