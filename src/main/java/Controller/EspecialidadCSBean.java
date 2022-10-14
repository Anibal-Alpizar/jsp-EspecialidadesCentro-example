package Controller;

import javax.faces.context.FacesContext;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author anibal
 */
public class EspecialidadCSBean {

    String servicio;
    String especialidad;
    String sexo;

    String message;

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

//    public String getParameter() {
//        return message = "Codigo: " + FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("code");
//    }

}
