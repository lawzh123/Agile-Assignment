/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agiledeliverymen;

/**
 *
 * @author 8Users
 */
public class DeliveryMen {
        private String name;
        private String status;
        private String location;
public DeliveryMen(){}

    public DeliveryMen(String name, String status, String location) {
        this.name = name;
        this.status = status;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
        
}
