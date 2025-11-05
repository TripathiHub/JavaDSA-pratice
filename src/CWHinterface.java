
interface camera{
    public void takeSnap();
    public void recordVideo();
    private void meth1(){
        System.out.println("meth1");
    }
    default public void greet(){
         meth1();//private method can be asseced
        System.out.println("good mroning");
        //we donot need to implement default method of interface
    }
}
interface wifi{
    public String[] getNetwork();
}
class mycellphone{
    public void callNumber(int phonenumber){
        System.out.println("calling " + phonenumber);
    }
    public void pickupcall(){
        System.out.println("connecting");
    }
}
class mysmartphone extends mycellphone implements camera,wifi {
    public void takeSnap(){
        System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("taking video");
    }
    public String[] getNetwork(){
        String[] networklist= {"harry","redmi 12c","ht 13"};
        return networklist;
    }
    public void connectNetwork(String network){
        System.out.println("connecting network " + network);
    }
}
public class CWHinterface
{
    public static void main(String[] args)
    {
       mysmartphone ms=new mysmartphone();
       camera cam1= new mysmartphone();
        ms.takeSnap();
       ms.recordVideo();
       String[] arr= ms.getNetwork();
       for(String item: arr){
           System.out.println(item);
       }
       ms.callNumber(962485);
       ms.pickupcall();
       ms.connectNetwork("redmi 12c");
       cam1.greet();
     //  cam1.getNetwork(); this is not allowed as cam1 is reference of camera only not mysmartphone
       cam1.takeSnap();//ploymorphisan where cam1 object can only uses method of camera
    }
}
