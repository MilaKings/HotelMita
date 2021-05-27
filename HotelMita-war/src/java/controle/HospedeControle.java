/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidades.Hospede;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import modelo.HospedeFacade;

/**
 *
 * @author thais
 */
@Named(value = "hospedeControle")
@SessionScoped
public class HospedeControle implements Serializable {

    @EJB
    private HospedeFacade hospedeFacade;
    private Hospede hospede = new Hospede();

    /**
     * Creates a new instance of HospedeControle
     */
    public HospedeControle() {
    }

    public Hospede getHospede() {
        return hospede;
    }
    
    public List<Hospede> findAll() {
        return this.hospedeFacade.findAll();
    }
    
    public String inserirHospede() {
        this.hospedeFacade.create(hospede);
        this.hospede = new Hospede();
        return "index";
    }
    
    public String removerHospede() {
        this.hospedeFacade.remove(hospede);
        return "index";
    }
    
}
