package newcar;
public class carEngine {
    public String carenginetype;

    public void setenginetype(int type){

        if(type==1)
        {
            carenginetype="Petrol";
        }else if(type==2){
            carenginetype="disel";
        }else{
            carenginetype="gas";
        }
    }
    String getenginetype(){
        return carenginetype;
    }
}
