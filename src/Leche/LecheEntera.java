/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

import Postres.*;

public abstract class LecheEntera {
    public abstract void usarHelado();
    public abstract void usarPastel();
}


//LAS CLASES LecheDescremada Y LecheDeslactosada, ESTÁN EN UN ARCHIVO CADA UNO. EN LUGAR DE ESO, Y EN VISTA QUE SON CLASES HIJAS DE LA CLASE LecheEntera, 
//SE PUEDEN PONER TODO EN UN MISMO ARCHIVO.

	class LecheDescremada extends LecheEntera {
    
    @Override
    public void usarHelado() {
        System.out.println("Usando leche descremada");
    }

    @Override
    public void usarPastel() {
        System.out.println("Usando leche descremada");
    }
    
}

	class LecheDeslactosada extends LecheEntera {
    
    @Override
    public void usarHelado() {
        System.out.println("Usando leche deslactosada");
    }

    @Override
    public void usarPastel() {
        // Lanzar error No se puede usar en pastel
        throw new RuntimeException(this.getClass() + ": No se puede usar en pastel");
    }
    
}

