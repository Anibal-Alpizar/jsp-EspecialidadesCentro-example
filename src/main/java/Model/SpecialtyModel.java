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
public class SpecialtyModel {

    LinkedList list = new LinkedList();

    public LinkedList<SelectItem> readSpecialtyCardiology() {

        list.add(new SelectItem("Cardiología"));
        return list;
    }

    public LinkedList<SelectItem> readSpecialtyGeneral() {
        list.add(new SelectItem("Medicina General"));
        return list;
    }

    public LinkedList<SelectItem> readSpecialtyPsychology() {
        list.add(new SelectItem("Psicología"));
        return list;
    }
}
