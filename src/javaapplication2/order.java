/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author KiewMing
 */
import java.util.ArrayList;
import java.util.List;

public class order {
    private List<Object> orderList = new ArrayList<>();
    
    private String orderID;
    private String orderDate;
    private String orderTime;
    private String name;
    private String contactNumber;
    private String address;
    private String food1;
    private String food2;
    private String food3;
    private String food4;
    private String food5;
    private String food6;
    private String food7;
    private String food8;
    private String food9;
    private String food10;

    public order() {
    }
    
    
    public order(String orderID, String orderDate, String orderTime, String name, String contactNumber, String address, String food1, String food2, String food3, String food4, String food5, String food6, String food7, String food8, String food9, String food10) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
        this.food1 = food1;
        this.food2 = food2;
        this.food3 = food3;
        this.food4 = food4;
        this.food5 = food5;
        this.food6 = food6;
        this.food7 = food7;
        this.food8 = food8;
        this.food9 = food9;
        this.food10 = food10;
    }



    public String getOrderID() {
        return orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getFood1() {
        return food1;
    }

    public String getFood2() {
        return food2;
    }

    public String getFood3() {
        return food3;
    }

    public String getFood4() {
        return food4;
    }

    public String getFood5() {
        return food5;
    }

    public String getFood6() {
        return food6;
    }

    public String getFood7() {
        return food7;
    }

    public String getFood8() {
        return food8;
    }

    public String getFood9() {
        return food9;
    }

    public String getFood10() {
        return food10;
    }


    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFood1(String food1) {
        this.food1 = food1;
    }

    public void setFood2(String food2) {
        this.food2 = food2;
    }

    public void setFood3(String food3) {
        this.food3 = food3;
    }

    public void setFood4(String food4) {
        this.food4 = food4;
    }

    public void setFood5(String food5) {
        this.food5 = food5;
    }

    public void setFood6(String food6) {
        this.food6 = food6;
    }

    public void setFood7(String food7) {
        this.food7 = food7;
    }

    public void setFood8(String food8) {
        this.food8 = food8;
    }

    public void setFood9(String food9) {
        this.food9 = food9;
    }

    public void setFood10(String food10) {
        this.food10 = food10;
    }

    
    
}
