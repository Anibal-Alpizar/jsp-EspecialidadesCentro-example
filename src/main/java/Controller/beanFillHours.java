/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HoursModel;
import java.util.LinkedList;
import javax.faces.model.SelectItem;

/**
 *
 * @author anibal
 */
public class beanFillHours {

    String message = "";
    LinkedList<SelectItem> listHours = new LinkedList();

    public String getMessage() {
        if (listHours.equals("Hora Exacta")) {
            message = "Hora Exacta";
        } else {
            message = "Hora Aproximada";
        }
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LinkedList<SelectItem> getListHours() {
        HoursModel objHoursModel = new HoursModel();
        return objHoursModel.readHours();
    }

    public void setListHours(LinkedList<SelectItem> listHours) {
        this.listHours = listHours;
    }
}
