/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Voluntary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saideepak
 */
public class NGODirectory {

    public List<NGO> ngoList;

    public NGODirectory() {
        ngoList = new ArrayList<>();
    }

    public List<NGO> getNgoList() {
        return ngoList;
    }

    public void setNgoList(List<NGO> ngoList) {
        this.ngoList = ngoList;
    }

}
