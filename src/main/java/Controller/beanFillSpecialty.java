/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.SpecialtyModel;
import java.util.LinkedList;
import javax.faces.model.SelectItem;

/**
 *
 * @author anibal
 */
public class beanFillSpecialty {

    String specialtyType = "0"; 
    LinkedList<SelectItem> listSpecialties = new LinkedList();

    public String getSpecialtyType() {
        return specialtyType;
    }

    public void setSpecialtyType(String specialtyType) {
        this.specialtyType = specialtyType;
    }

    public void setListSpecialties(LinkedList<SelectItem> listSpecialties) {
        this.listSpecialties = listSpecialties;
    }

    public LinkedList<SelectItem> getListSpecialties() {

        LinkedList list = new LinkedList();

        if (specialtyType.equals("1")) {
            SpecialtyModel objSpecialtiesModel = new SpecialtyModel();
            return objSpecialtiesModel.readSpecialtyCardiology();
        } else if (specialtyType.equals("2")) {
            SpecialtyModel objSpecialtiesModel = new SpecialtyModel();
            return objSpecialtiesModel.readSpecialtyGeneral();
        } else if (specialtyType.equals("3")) {
            SpecialtyModel objSpecialtiesModel = new SpecialtyModel();
            return objSpecialtiesModel.readSpecialtyPsychology();
        } else {
            list.add(new SelectItem("Digita un numero (1-3) y da enter"));
            return list;
        }
    }

}
