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
public class HospitalDirectory {

    private List<Hospitals> HospitalList;

    public HospitalDirectory() {
        HospitalList = new ArrayList<>();
    }

    public List<Hospitals> getHospitalList() {
        return HospitalList;
    }

    public void setHospitalList(List<Hospitals> HospitalList) {
        this.HospitalList = HospitalList;
    }

}
