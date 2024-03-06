package com.smeup.entities.nuovo;

import java.util.List;

//TODO tutte le classi collegate saranno collegamenti tramite id con le entities, oppure come embedded values (stile mysql)
public class Azienda {
    //TODO modo di aggiungere configurazione personalizzata, o aggiungiamo campi qua, o con una tabella che contiene le variabili di configurazione degli utenti
    //penso a opzioni di notifica, al fatto che sia un azienda di test o admin ecc...
    //TODO possiamo aggiungere opzioni agli utenti?
    public TipoRegistrazione tipoRegistrazione;//persona fisica, azienda
    public Anagrafica anagrafica;
    public Anagrafica rappresentanteFiscale;//o legale rappresentante TODO da verificare che non servano info su residenza nascita ecc...
    public Anagrafica responsabileConservazione;//opzionale, può coincidere con rappresentante fiscale no info aggiuntive nascita ecc...
    public Indirizzo sedeLegale;//opzionale, solitamente coincide con quella fiscale/amministrativa
    public Indirizzo sedeFiscale;
    public Indirizzo sedeOperativa;//opzionale
    public String fileVisura;//solo se si registra un azienda
    public String codEori;//opzionale (ad oggi, forse diventerà obbligatorio, regole AdE)
    public IscrizioneREA iscrizioneREA;
    public String fileContratto;
    public Licenza licenza;//fare riferimento alle licenze esistenti TODO separare licenze per fatturazione e conservazione
    public Abbonamento abbonamento;
    public DigitalSign firmaDigitale;
    public String regimeFiscale;
    public String codiceDestinatario;//viene assegnato solo se il cliente usa la fatturazione

    //TODO inizio parametri di configurazione
    //non sono solo questi, bisogna rispondere alla domanda sopra per decidere se metterli qua o no
    public boolean autorizzoTrattamentoDati;
    public boolean disabilitato;//indica se viene disabilitato da noi TODO vedi se necessario
    public boolean attivato;//indica se il profilo è stato attivato dopo la registrazione TODO vedi se necessario
    public boolean admin;
    public boolean utenteTest;//TODO pensare se servira ancora
    //TODO fine parametri di configurazione

    public List<Contatto> contatti;//serve una rubrica TODO la metterei nella collection dell'azienda
    public Consumi consumi;
}
