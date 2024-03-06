package com.smeup.entities.nuovo;

import java.util.List;

public class Azienda {//TODO tutte le classi collegate saranno collegamenti tramite id con le entities, oppure come embedded values (stile mysql)
    public Anagrafica anagrafica;
    public List<Contatto> contatti;
    public Anagrafica rappresentanteFiscale;//TODO deve contenere dati riguardo la nascita?
    public Anagrafica responsabileConservazione;//TODO come rappresentante fiscale
    public Indirizzo sedeLegale;
    public Indirizzo sedeAmministrativa;
    public Licenza licenza;
    public String regimeFiscale;
    public String codiceDestinatario;
    public Abbonamento abbonamento;
    public boolean autorizzoTrattamentoDati;
    public boolean disabilitato;//indica se viene disabilitato da noi TODO vedi se necessario
    public boolean attivato;//indica se il profilo è stato attivato dopo la registrazione TODO vedi se necessario
    public boolean admin;
    public boolean utenteTest;//TODO pensare se servira ancora
    public DigitalSign firmaDigitale;
}
