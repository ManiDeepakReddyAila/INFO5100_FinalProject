/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Government;

import java.util.List;

/**
 *
 * @author pranitha
 */
public class Government {

    private String stakeHolders;
    private List<String> ministers;

    public String getStakeHolders() {
        return stakeHolders;
    }

    public void setStakeHolders(String stakeHolders) {
        this.stakeHolders = stakeHolders;
    }

    public List<String> getMinisters() {
        return ministers;
    }

    public void setMinisters(List<String> ministers) {
        this.ministers = ministers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    private String country;
}
