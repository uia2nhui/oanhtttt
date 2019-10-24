
package kiemtra;

import java.util.Vector;
class Switcher implements Switchable{
    private Vector devices[];
    private boolean state;
    public Switcher(){
        
    }
    public boolean getState(){
        return state;
    }
    public void setState(boolean x){
        state=x;
    }
    public void addDevice(){
        
    }
    @Override
    public void turnOn(){
        
    }
    @Override
    public void turnOff(){
        
    }
}


