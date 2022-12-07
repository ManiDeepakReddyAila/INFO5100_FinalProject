/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Government;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pranitha
 */
public class GovernmentDirectory {

    private List<Government> governmentList;

    public GovernmentDirectory() {
        governmentList = new ArrayList<>();
    }

    public List<Government> getGovernmentList() {
        return governmentList;
    }

    public void setGovernmentList(List<Government> governmentList) {
        this.governmentList = governmentList;
    }

}
