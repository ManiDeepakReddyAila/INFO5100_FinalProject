/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Warehouse;

import Enterprise.Warehouse.ClothingChain;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pranitha
 */
public class ClothingChainDirectory {

    public List<ClothingChain> clothingChainList;

    public ClothingChainDirectory() {
        clothingChainList = new ArrayList<>();
    }

    public List<ClothingChain> getClothingChainList() {
        return clothingChainList;
    }

    public void setclothingChainList(List<ClothingChain> clothingChainList) {
        this.clothingChainList = clothingChainList;
    }
}
