/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.LinkedList;
import javax.faces.model.SelectItem;

/**
 *
 * @author anibal
 */
public class ServicesModel {

    LinkedList list = new LinkedList();

    public LinkedList<SelectItem> readServicesMedical() {

        list.add(new SelectItem("Servicios Médicos"));
        return list;
    }

    public LinkedList<SelectItem> readServicesHospitalization() {
        list.add(new SelectItem("Servicios Hospitalización"));
        return list;
    }

    public LinkedList<SelectItem> readServicesEmergencies() {
        list.add(new SelectItem("Servicios Urgencias"));
        return list;
    }

}
