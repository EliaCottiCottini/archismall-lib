
package com.smeup.entities.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private String Id;
    private OrganizationData organizationData;
    private Boolean isCreatedInTDoc = false;
    private Boolean notificationsDisabled = false;
    private Map<String, Boolean> classiDocumentali = new HashMap<String, Boolean>() {{
        put("mail_pec", false);
        put("libro_contabile", false);
        put("registro_contabile", false);
        put("fatture_attive", true);
        put("notifiche_sdi", true);
        put("certificazione_unica", false);
        put("ordini_a_fornitore", false);
        put("manuali", false);
        put("registro_riepilogativo_iva", false);
        put("fattura_passiva", true);
        put("fattura_elettronica_attiva", true);
        put("fattura_elettronica_attiva_notifiche", true);
        put("fattura_elettronica_passiva", true);
        put("fattura_elettronica_passiva_notifiche", true);
        put("fattura_gse", true);
        put("fattura_gse_notifiche", true);
        put("ddt_attivo", false);
        put("ddt_passivo", false);
        put("modello_dichiarativo", false);
        put("modello_versamento", false);
        put("bollette", false);
        put("lul", false);
        put("altro_documento", false);
        put("libro_giornale", false);
        put("giornali_schede_magazzino", false);
        put("libro_inventari", false);
        put("libro_mastro", false);
        put("altri_registri", false);
        put("registro_fatture_acquisto", false);
        put("registro_fatture_vendita", false);
        put("libro_cespiti", false);
        put("libro_registri_iva", false);
        put("modello_f23_f24", false);
        put("modello_770", false);
        put("modello_730", false);
        put("cm", false);
        put("cmr", false);
        put("pod", false);
        put("bilanci", false);
        put("documenti_bancari", false);
        put("schede_cliniche", false);
    }};
    private String last_differences = "";
    private HashMap<String, List<AnnoPrecedente>> previousYears = new HashMap<String, List<AnnoPrecedente>>();
    //TODO vedere se serve ancora, era stata aggiunta per dare possibilita ai clienti di scrivere l'anagrafica che volevano, solo per invio tramite API
    private Boolean overrideAnagraficaFatturazione = true;
    private Boolean canUseFatturaPA;//TODO
    private Boolean canUseConservazione;//TODO
    private Boolean canUseArchiSync;//TODO
    private Boolean canUseArchiPro;//TODO
    private NotificationOptions notificationOptions = new NotificationOptions();//TODO dare agli utenti le opzioni di notifica, non all'azienda (?)
}
