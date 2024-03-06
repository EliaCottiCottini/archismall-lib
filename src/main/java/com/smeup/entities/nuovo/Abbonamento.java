package com.smeup.entities.nuovo;

import java.util.Date;

public class Abbonamento {
    public Date dataAttivazione;
    //la data di scadenza non serve perché di norma il cliente scade se qualcuno lo fa scadere
    public boolean richiestaCancellazione;
    public Date dataRichiestaCancellazione;
    private String codiceCliente;//random o compilato a mano (zerod)
}
