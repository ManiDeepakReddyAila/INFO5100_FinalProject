/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Medical;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pranitha
 */
public class BloodBankDirectory {

    public List<BloodBank> bloodBankDirectory;

    public BloodBankDirectory() {
        bloodBankDirectory = new ArrayList<>();
    }

    public List<BloodBank> getBloodBankDirectory() {
        return bloodBankDirectory;
    }

    public void setBloodBankDirectory(List<BloodBank> bloodBankDirectory) {
        this.bloodBankDirectory = bloodBankDirectory;
    }

}
