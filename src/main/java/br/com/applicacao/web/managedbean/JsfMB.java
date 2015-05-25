package br.com.applicacao.web.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class JsfMB {

	private String valor;

	public String getValor() {

		return valor;
	}

	public void setValor(String valor) {

		this.valor = valor;
	}

}
