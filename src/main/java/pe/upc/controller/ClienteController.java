package pe.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.entity.Cliente;
import pe.upc.service.IClienteService;

@Named
@RequestScoped
public class ClienteController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IClienteService cService;
	private Cliente cliente;
	List<Cliente>listaClientes;
	
	@PostConstruct
	public void init() {
		this.listaClientes = new ArrayList<Cliente>();
		this.cliente = new Cliente();
		this.listar();
	}
	public String nuevoCliente() {
		this.setCliente(new Cliente());
		return "cliente.xhtml";
	}
	public void insertar() {
		try {
			cService.insertar(cliente);
			limpiarCliente();
			} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listar() {
		try {
			listaClientes = cService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void eliminar(Cliente cliente) {
		try {
			cService.eliminar(cliente.getIdCliente());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarCliente() {
		this.init();
	}
	public IClienteService getcService() {
		return cService;
	}
	public void setcService(IClienteService cService) {
		this.cService = cService;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
}

