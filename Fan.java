
package kiemtra;

class Fan extends ElectricalDevice {

    protected String speed;

    protected boolean swing; 

    public Fan(String manufacture, int price, String id, boolean switcher) {
        super(manufacture, price, id, switcher);
    }
 
    public String getSpeed() {
        return speed;
    }

    public boolean isSwing() {
        return swing;
    }

    public void setSwing(boolean swing) {
        this.swing = swing;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void incSpeed() {
        System.out.println("toc do quay cua quat la 1000 vong/phut");
    }

    
    public void upDate() {
    }
}
