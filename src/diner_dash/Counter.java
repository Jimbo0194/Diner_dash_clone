package diner_dash;

/**
 *
 * @author luisdiegomontealegrebadilla
 */
public class Counter {
    
    private int secs;
    private int mins;
    
    public Counter(String time){
        String[] sep = time.split(":");
        this.mins = Integer.valueOf(sep[0]);
        this.secs = Integer.valueOf(sep[1]);
    }
    
    public  Counter decreaser(){ //decreases minutes and seconds, fucntioning as a timer
        if(secs > mins){
            secs--;
        }else{
            secs = 59;
            mins--;
        }
        return this;
    }
    
    public String time_format(){
        return String.format("%02d:%02d", mins, secs); //formats counter time printing
    }
         
}
 