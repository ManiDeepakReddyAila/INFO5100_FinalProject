/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise.Warehouse;

import Enterprise.Warehouse.TransportAgencies;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pranitha
 */
public class TransportAgenciesDirectory {

    public List<FoodMarketRetailers> transportAgenciesList;

    public TransportAgenciesDirectory() {
        transportAgenciesList = new ArrayList<>();
    }

    public List<FoodMarketRetailers> getTransportAgenciesList() {
        return transportAgenciesList;
    }

    public void setTransportAgenciesList(List<FoodMarketRetailers> transportAgenciesList) {
        this.transportAgenciesList = transportAgenciesList;
    }
}
