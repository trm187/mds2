package com.mds2.foro;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class PerfilUsuarioRegMod extends PerfilUsuarioRegGenerico {
	//private Button _amonestar;
	public UsuarioAmonestado _unnamed_UsuarioAmonestado_;

	public PerfilUsuarioRegMod() {
		
		interaccionarSancionAdmin.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
			//	navigator.navigateTo("crearSeccion");
				UI.getCurrent().getNavigator().navigateTo("eliminarSeccion");
			}
			
		});
		
	}
	
	public void amonestar() {
		throw new UnsupportedOperationException();
	}
}