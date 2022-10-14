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
public class GendersModel {

    LinkedList list = new LinkedList();

    public LinkedList<SelectItem> readGenders() {

        list.add(new SelectItem("Ambos"));
        list.add(new SelectItem("Masculino"));
        list.add(new SelectItem("Femenino"));
        return list;
    }

}
