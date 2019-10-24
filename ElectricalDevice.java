
package kiemtra;

public class ElectricalDevice {
    protected String manufacture;
    protected int price;
    protected String id;
    protected boolean switcher;
    
    public ElectricalDevice(String manufacture, int price, String id, boolean switcher){
        this.manufacture = manufacture;
        this.price = price;
        this.id = id;
        this.switcher = switcher;
    }
    
    public String manufacture(){
        return manufacture;
    }
    
    public int getprice(){
        return price;
    }
    
    public String getid(){
        return id;
    }
    
    public boolean getswitcher(){
        return switcher;
    }
    
    public void setid(String x){
        id = x;
    }
    
    public void setmanufacture(String x){
        manufacture = x;
    }
    
    public void setprice(int x){
        price = x;
    }
    
    public void setswitcher(boolean x){
        switcher = x;
    }
    public void turnOn() {
          throw new UnsupportedOperationException();    
    }

 
    public void turnOff() {
          throw new UnsupportedOperationException(); 
       
    }
    
    public void upDate(){
        
    }
    
  
    @Override
    public String toString(){
        return "nha san xuat: " + manufacture
                + "\n" + "gia ban: " + price
                + "\n" + "ma id: " + id
                +"\n" + "cong tac: " + switcher;
    
    }
}
    
    
        
    
    
    
    
   
            


