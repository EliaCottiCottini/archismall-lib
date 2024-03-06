package com.smeup.entities.nuovo;

import java.util.Date;

//TODO le classi collegate qua DEVONO essere parte dello stesso oggetto (stile mongodb)
public abstract class ClasseDocumentale {
    //TODO trovare un modo di creare una history legata al documento (per conservazione)
    protected String username;
    protected Anagrafica produttore;//TODO potrebbe essere Contatto
    private Contatto contatto;// mi serve per lo schema
    protected Date data;
    protected String TDocFileId;
    protected String TDocPdVId;
    protected String TDocRdVId;
    protected String FilePath;
    protected String fileName;
    protected String idDocumento;//ID Documento
    protected String Impronta;//hash
    protected String Oggetto;//classe documentale
    protected String responsabileConservazione;
    protected String idArchiPro;
    protected int Status;
}
