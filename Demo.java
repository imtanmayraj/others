abstract class Car{
    public abstract void drive();
    public abstract void fly();



    public  void playmusic(){
        System.out.println("play music");
    }
}

abstract class WagonR extends Car{

    // public void fly(){
    //     System.out.println("flying...");
    // }
    public void drive()
    {
        System.out.println("driving");
    }
}
class UpdateWagonR extends WagonR{
    public void fly(){
        System.out.println("flying");
    }
}
public class Demo{
    public static void main(String a[]){
        Car obj=new UpdateWagonR();
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}