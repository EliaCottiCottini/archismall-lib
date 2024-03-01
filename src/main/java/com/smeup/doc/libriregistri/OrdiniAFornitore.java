package com.smeup.doc.libriregistri;

import com.smeup.doc.Anagrafica;

import java.util.Date;

public class OrdiniAFornitore extends LibriRegistri {
    private Anagrafica destinatario;
    private Anagrafica contribuente;
    private Anagrafica mittente;
    private int annoIva;
    private int annoOrdineAcquisto;
    private String numeroOrdine;
    private Date dataOrdine;
}
