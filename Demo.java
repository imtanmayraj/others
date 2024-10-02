enum Status{
	Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {

    	Status s=Status.Pending;
    	
    	switch(s)
    	{
    		case Running:
    			System.out.println("All Good");
    			break;
    			
    		case Failed:
    			System.out.println("Try Again");
    			break;
    			
    		case Pending:
    			System.out.println("Please Wait");
    			break;
    		
    		default:
    			System.out.println("Done");
    			break;
    	}
    	
    	// if(s==Status.Running)
    	// 	System.out.println("All Good");
    	// else if(s==Status.Failed)
    	// 	System.out.println("Try Again");
    	// else if ( s==Status.Pending)
    	// 	System.out.println("Please Wait");
    	// else
    	// 	System.out.println("Done");
    	
    }
}



// abstract class Car{
//     public abstract void drive();
//     public abstract void fly();



//     public  void playmusic(){
//         System.out.println("play music");
//     }
// }

// abstract class WagonR extends Car{

//     // public void fly(){
//     //     System.out.println("flying...");
//     // }
//     public void drive()
//     {
//         System.out.println("driving");
//     }
// }
// class UpdateWagonR extends WagonR{
//     public void fly(){
//         System.out.println("flying");
//     }
// }
// public class Demo{
//     public static void main(String a[]){
//         Car obj=new UpdateWagonR();
//         obj.drive();
//         obj.playmusic();
//         obj.fly();
//     }
// }

