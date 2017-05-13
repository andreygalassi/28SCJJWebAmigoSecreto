package br.fiap.t28scj.javaWeb.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

import br.fiap.t28scj.javaWeb.dao.GenericDao;
import br.fiap.t28scj.javaWeb.entity.Usuario;

@Results({ 
	@Result(name = "ok", location = "/menu.jsp"), 
	@Result(name = "erro", location = "/login.jsp"),
	@Result(name = "cadastro", location = "/cadUsuario.jsp")
})
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Action(value = "/login")
	public String listar() {
		GenericDao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
		return "ok";
	}
}
