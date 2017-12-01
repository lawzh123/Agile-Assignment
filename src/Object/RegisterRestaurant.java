package Object;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterRestaurant {
    private String OwnerName;
    private String OwnerIC;
    private String OwnerPhone;
    private String OwnerGender;
    
    private String ResName;
    private String ResType;
    private String ResAddress;
    private String ResPhone;
    private String ResMenuID;

    public RegisterRestaurant(){
        
    }
    public RegisterRestaurant(String OwnerName, String OwnerIC, String OwnerPhone, String OwnerGender, 
            String ResName, String ResType, String ResAddress, String ResPhone) {
        this.OwnerName = OwnerName;
        this.OwnerIC = OwnerIC;
        this.OwnerPhone = OwnerPhone;
        this.OwnerGender = OwnerGender;
        this.ResName = ResName;
        this.ResPhone = ResPhone;
        this.ResAddress = ResAddress;
        this.ResType = ResType;
        this.ResMenuID = GenerateMenuID();
    }
    public RegisterRestaurant(String OwnerName, String OwnerIC, String OwnerPhone, String OwnerGender, 
            String ResName, String ResType, String ResAddress, String ResPhone, String ResMenuID) {
        this.OwnerName = OwnerName;
        this.OwnerIC = OwnerIC;
        this.OwnerPhone = OwnerPhone;
        this.OwnerGender = OwnerGender;
        this.ResName = ResName;
        this.ResPhone = ResPhone;
        this.ResAddress = ResAddress;
        this.ResType = ResType;
        this.ResMenuID = ResMenuID;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public String getOwnerIC() {
        return OwnerIC;
    }

    public void setOwnerIC(String OwnerIC) {
        this.OwnerIC = OwnerIC;
    }

    public String getOwnerPhone() {
        return OwnerPhone;
    }

    public void setOwnerPhone(String OwnerPhone) {
        this.OwnerPhone = OwnerPhone;
    }

    public String getOwnerGender() {
        return OwnerGender;
    }

    public void setOwnerGender(String OwnerGender) {
        this.OwnerGender = OwnerGender;
    }

    public String getResName() {
        return ResName;
    }

    public void setResName(String ResName) {
        this.ResName = ResName;
    }

    public String getResPhone() {
        return ResPhone;
    }

    public void setResPhone(String ResPhone) {
        this.ResPhone = ResPhone;
    }

    public String getResAddress() {
        return ResAddress;
    }

    public void setResAddress(String ResAddress) {
        this.ResAddress = ResAddress;
    }

    public String getResType() {
        return ResType;
    }

    public void setResType(String ResType) {
        this.ResType = ResType;
    }

    public String getResMenuID() {
        return ResMenuID;
    }

    public void setResMenuID(String ResMenuID) {
        this.ResMenuID = ResMenuID;
    }
    @Override
    public String toString(){
        
        return "Menu ID: "+ResMenuID+"\nOwner Information :\n------------------\nOwner name: "+OwnerName+"\nOwner Gender: "+OwnerGender+"\nOwner IC: "+OwnerIC+"\nOwner phone: "+OwnerPhone+
        "\n\nRestaurant information :\n------------------\nRestaurant name: "+ResName+"\nRestaurant type: "+ResType+"\nRestaurant address: "+ResAddress+"\nRestaurant phone: "+ResPhone;
    }
    
    //this function generate Menu ID using date and time
    public String GenerateMenuID(){
        DateFormat dateFormat = new SimpleDateFormat("MMyyyydd");
        Date date = new Date();
        return dateFormat.format(date)+String.format("%04d",(int)(Math.random()*9999)+1);
    }
    
}
