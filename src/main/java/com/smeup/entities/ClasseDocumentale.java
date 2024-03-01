package com.smeup.entities;

import java.util.Date;

public class ClasseDocumentale {
    protected String username;
    protected Anagrafica produttore;//TODO questa potrebbe essere contatto
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
