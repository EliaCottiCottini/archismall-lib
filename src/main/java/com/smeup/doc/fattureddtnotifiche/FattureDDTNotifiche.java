package com.smeup.doc.fattureddtnotifiche;

import com.smeup.doc.Anagrafica;
import com.smeup.doc.ClasseDocumentale;

import java.util.Date;

public class FattureDDTNotifiche extends ClasseDocumentale {
    protected Anagrafica fornitore;
    protected Anagrafica cliente;
    protected Date dataDocumento;
    protected int annoIva;//anno
    protected int periodoEsercizio;//Periodo di Esercizio
    protected String numeroDocumento;
}
