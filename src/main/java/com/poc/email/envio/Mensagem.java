package com.poc.email.envio;

import java.util.List;

public class Mensagem {
    
    private String remetente;

    List<String> destinatarios;

    private String assunto;

    private String corpoMensagem;


    public Mensagem(String remetente, List<String> destinatarios, String assunto, String corpoMensagem) {
        this.remetente = remetente;
        this.destinatarios = destinatarios;
        this.assunto = assunto;
        this.corpoMensagem = corpoMensagem;
    }

    public String getRemetente() {
        return this.remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public List<String> getDestinatarios() {
        return this.destinatarios;
    }

    public void setDestinatarios(List<String> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public String getAssunto() {
        return this.assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCorpoMensagem() {
        return this.corpoMensagem;
    }

    public void setCorpoMensagem(String corpoMensagem) {
        this.corpoMensagem = corpoMensagem;
    }
    
}
