/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Warehouse;

import Enterprise.Warehouse.FoodMarketRetailers;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pranitha
 */
public class FoodMarketRtlDirectory {

    public List<FoodMarketRetailers> foodMarketList;

    public FoodMarketRtlDirectory() {
        foodMarketList = new ArrayList<>();
    }

    public List<FoodMarketRetailers> getFoodMarketList() {
        return foodMarketList;
    }

    public void setFoodMarketList(List<FoodMarketRetailers> foodMarketList) {
        this.foodMarketList = foodMarketList;
    }
}
