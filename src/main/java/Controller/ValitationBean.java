/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author anibal
 */
public class ValitationBean {

    String code = "";
    String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return code.equals("2680") ? "AREA DE SALUD TALAMANCA" : "CENTRO DE SALUD NO VALIDO";

    }

    public void setMessage(String message) {
        this.message = message;
    }


}
