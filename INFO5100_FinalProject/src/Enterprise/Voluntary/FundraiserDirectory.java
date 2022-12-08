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
public class FundraiserDirectory {

    public List<FundRaiser> fundRaiseList;

    public FundraiserDirectory() {
        fundRaiseList = new ArrayList<>();
    }

    public List<FundRaiser> getFundRaiseList() {
        return fundRaiseList;
    }

    public void setFundRaiseList(List<FundRaiser> fundRaiseList) {
        this.fundRaiseList = fundRaiseList;
    }

}
