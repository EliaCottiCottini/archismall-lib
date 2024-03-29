package com.smeup.doc.fattureddtnotifiche;

import com.smeup.entities.nuovo.Anagrafica;
import com.smeup.entities.nuovo.ClasseDocumentale;

import java.util.Date;

public abstract class FattureDDTNotifiche extends ClasseDocumentale {
    protected Anagrafica fornitore;
    protected Anagrafica cliente;
    protected Date dataDocumento;
    protected int annoIva;//anno
    protected int periodoEsercizio;//Periodo di Esercizio
    protected String numeroDocumento;
}
