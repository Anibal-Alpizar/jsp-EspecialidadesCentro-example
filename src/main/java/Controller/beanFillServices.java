/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.LinkedList;
import javax.faces.model.SelectItem;
import Model.ServicesModel;

/**
 *
 * @author anibal
 */
public class beanFillServices {

    String serviceType = "0";
    LinkedList<SelectItem> listServices = new LinkedList();

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public LinkedList<SelectItem> getListServices() {

        LinkedList list = new LinkedList();

        if (serviceType.equals("1")) {
            ServicesModel objServicesModel = new ServicesModel();
            return objServicesModel.readServicesMedical();
        } else if (serviceType.equals("2")) {
            ServicesModel objServicesModel = new ServicesModel();
            return objServicesModel.readServicesEmergencies();
        } else if (serviceType.equals("3")) {
            ServicesModel objServicesModel = new ServicesModel();
            return objServicesModel.readServicesHospitalization();
        } else {
            list.add(new SelectItem("Digita un numero (1-3) y da enter"));
            return list;
        }

    }

    public void setListaMarca(LinkedList<SelectItem> listaMarca) {
        this.listServices = listaMarca;
    }

}
