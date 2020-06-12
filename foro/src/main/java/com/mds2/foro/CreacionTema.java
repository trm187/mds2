package com.mds2.foro;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextField;

//import Package.Lista_Tema_V_Usuario_Reg;

public class CreacionTema extends Creacion_tema_ventana implements View {
	private TextField _tituloTema;
	private TextField _subtituloTema;
	private RichTextArea _descripcion;
	private Button _enviar;
	private Button _cancelar;
	public Lista_Tema_V_Usuario_Reg _unnamed_Lista_Tema_V_Usuario_Reg_;
	iUsuario iUsr = new DB_Main();
	
	
	public CreacionTema(int aIdSeccionPropietaria, int aIdTemaPropietario) {
		
		this._enviar = crearTema;
		this._cancelar = cancelarCreacionTema;
		this._tituloTema = titulo;
		
		this._subtituloTema = subtitulo;
		this._descripcion = textoTema;
		
		_enviar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				System.out.println(_tituloTema.getValue());
				try {
					enviar(aIdSeccionPropietaria, aIdTemaPropietario);
					UI.getCurrent().getNavigator().addView(_tituloTema.getValue(), new Usuario_registrado(new Lista_Mensaje(aIdTemaPropietario)));
					UI.getCurrent().getNavigator().navigateTo(_tituloTema.getValue());
					
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});	
		
		_cancelar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				cancelar();
			}
			
		});	
		
		
	}
	
	//LA DESCRIPCION NO EXISTE EN VD 
	public void enviar(int aIdSeccionPropietaria, int aIdTemaPropietario) throws PersistentException {
		iUsr.crearTema(_tituloTema.getValue(), _subtituloTema.getValue(), _descripcion.getValue(), aIdSeccionPropietaria, aIdTemaPropietario);
	}

	public void cancelar() {
		UI.getCurrent().getNavigator().navigateTo("cancelarCreacionTema");
	}
}