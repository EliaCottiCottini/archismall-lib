package com.smeup.entities.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationOptions {
    @JsonProperty
    private Boolean passiveInvoices = true;
    @JsonProperty
    private Boolean activeInvoices = true;
    @JsonProperty
    private Boolean communications = true;

    public Boolean getPassiveInvoices() {
        return passiveInvoices;
    }

    public void setPassiveInvoices(Boolean passiveInvoices) {
        this.passiveInvoices = passiveInvoices;
    }

    public Boolean getActiveInvoices() {
        return activeInvoices;
    }

    public void setActiveInvoices(Boolean activeInvoices) {
        this.activeInvoices = activeInvoices;
    }

    public Boolean getCommunications() {
        return communications;
    }

    public void setCommunications(Boolean communications) {
        this.communications = communications;
    }
}
