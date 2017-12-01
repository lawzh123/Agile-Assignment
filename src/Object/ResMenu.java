/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author User
 */
public class ResMenu {
    private String FoodName;
    private double foodPrice;
    private String description;
    
    public ResMenu(String FoodName, double foodPrice, String description) {
        this.FoodName = FoodName;
        this.foodPrice = foodPrice;
        this.description = description;
    }

    public ResMenu(String FoodName, double foodPrice) {
        this.FoodName = FoodName;
        this.foodPrice = foodPrice;
        description="";
    }
    

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
