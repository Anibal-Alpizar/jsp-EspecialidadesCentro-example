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
public class HoursModel {

    LinkedList list = new LinkedList();

    public LinkedList<SelectItem> readHours() {

        list.add(new SelectItem("Hora Exacta"));
        list.add(new SelectItem("Hora en Punto"));
        return list;
    }

}
