enum Status{
    Running,Failed,Pending,success;
    //enum is class and all r objects

}

public class enumexample {
    public static void main(String[] args) {
        int i=5;
        // Status s=Status.Running;
        Status[] ss=Status.values();
        // System.out.println(s);
        // System.out.println(s.ordinal());

        for(Status s:ss){
            System.out.println(s + " : "+s.ordinal());
        }
        
    }
}
