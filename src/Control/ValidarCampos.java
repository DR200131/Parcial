/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Sensor;
import DAO.*;

/**
 *
 * @author Usuario
 */
public class ValidarCampos {

    public void crear(Sensor sensor){
        SensDAO dao = new SensDAO();
        dao.crear(sensor);
    }
}
