package com.felipecampanaro.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.felipecampanaro.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
