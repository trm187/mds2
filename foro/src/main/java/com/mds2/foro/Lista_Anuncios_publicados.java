package com.mds2.foro;

import java.util.Vector;
//import Package.Anuncio;

import org.orm.PersistentException;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Anuncios_publicados extends Lista_Anuncios_publicados_ventana{
	private Button _eliminarAnuncio;
	public Sistema_de_publicidad _unnamed_Sistema_de_publicidad_;
	public Vector<AnuncioClase> _list_Anuncio = new Vector<AnuncioClase>();

	iAdministrador iUsr = new DB_Main();
	
	public Lista_Anuncios_publicados() {
		this._eliminarAnuncio = eliminarAnuncio;
		
		_eliminarAnuncio.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				try {
					eliminarAnuncio();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public void eliminarAnuncio() throws NumberFormatException, PersistentException {
		iUsr.eliminarAnuncio(Integer.parseInt(this.getId()), false);
	}
}