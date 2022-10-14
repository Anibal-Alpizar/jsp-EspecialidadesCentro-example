/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.LinkedList;
import javax.faces.model.SelectItem;
import Model.GendersModel;

/**
 *
 * @author anibal
 */
public class beanFillGenders {

    LinkedList<SelectItem> listGenders = new LinkedList();

    public LinkedList<SelectItem> getListGenders() {

        GendersModel objGendersModel = new GendersModel();
        return objGendersModel.readGenders();
    }
}
