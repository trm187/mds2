package com.mds2.foro;

import com.vaadin.navigator.View;

//import Package2.iBanner_Usuario_registrado;

public class Banner_Usuario_registrado extends Banner_general implements View {
//	private Button _soporte;
//	public iBanner_Usuario_registrado _iBanner_Usuario_registrado;
	public Sistema_de_tickets_vista_usuario_registrado _sistema_de_tickets_vista_usuario_registrado;

	public Banner_Usuario_registrado() {
		
		soporte.setVisible(true);
		
	}
	
	public void soporte() {
		throw new UnsupportedOperationException();
	}
}