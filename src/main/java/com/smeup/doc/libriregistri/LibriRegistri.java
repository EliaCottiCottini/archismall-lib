package com.smeup.doc.libriregistri;

import com.smeup.entities.nuovo.ClasseDocumentale;

import java.util.Date;

public abstract class LibriRegistri extends ClasseDocumentale {
    protected Date dataDocumento;
    protected String oggettoDescrizione;
    protected int annoFiscaleDal;
    protected int annoFiscaleAl;
    protected String numeroDocumento;
}
