package br.com.applicacao.web.managedbean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@RequestScoped
public class MenuMB {

	public String jsf() {

		return "/pages/jsfInit.xhtml?faces-redirect=true";
	}

	public String angular() {

		return "/angular-pages/init.xhtml?faces-redirect=true";
	}

	public void logout() throws IOException {

		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		session.invalidate();

		context.getExternalContext().redirect("http://www.google.com.br/");
	}

}
