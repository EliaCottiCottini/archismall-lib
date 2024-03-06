# Definizione Oggetti

## Azienda e correlati
Le classi degli oggetti si trovano [qui](src/main/java/com/smeup/entities/nuovo)

```mermaid
classDiagram
direction BT
    class Abbonamento {
      + Date dataRichiestaCancellazione
      - String codiceCliente
      + boolean richiestaCancellazione
      + Date dataAttivazione
    }
    class Anagrafica {
      - String nome
      - String ragioneSociale
      - String piva
      - String codiceFiscale
      - String codice
      - String fileCartaIdentita
      - String codiceIpa
      - String fileCodiceFiscale
      - String codiceUfficio
      - String cognome
    }
    class Azienda {
      + String codEori
      + boolean admin
      + Indirizzo sedeFiscale
      + Indirizzo sedeOperativa
      + Licenza licenza
      + Abbonamento abbonamento
      + Consumi consumi
      + String fileVisura
      + DigitalSign firmaDigitale
      + boolean attivato
      + String fileContratto
      + TipoRegistrazione tipoRegistrazione
      + Indirizzo sedeLegale
      + boolean autorizzoTrattamentoDati
      + Anagrafica anagrafica
      + Anagrafica rappresentanteFiscale
      + String regimeFiscale
      + String codiceDestinatario
      + IscrizioneREA iscrizioneREA
      + boolean utenteTest
      + Anagrafica responsabileConservazione
      + boolean disabilitato
      + List~Contatto~ contatti
    }
    class ClasseDocumentale {
      # String idDocumento
      # String Oggetto
      # String TDocPdVId
      # String TDocRdVId
      # Anagrafica produttore
      # String Impronta
      - Contatto contatto
      # String responsabileConservazione
      # String idArchiPro
      # String FilePath
      # int Status
      # String username
      # String TDocFileId
      # Date data
      # String fileName
    }
    class Contatto {
      + String telefono
      + String email
    }
    class DigitalSign {
      - Date expireDate
      - String surname
      - String hostName
      - String alias
      - String name
      - String password
    }
    class Indirizzo {
      - String via
      - String cap
      - String numeroCivico
      - String provincia
      - String comune
      - String nazione
    }
    class Licenza {
      - String codiceRivenditore1
      - int numeroFattureAnnuali
      - String id
      - String codiceRivenditore2
      - int spazioAnnualeMB
      - String codiceProfilo
    }
    class Notifica {
      - String messaggio
    }
    class User {
      + Azienda azienda
    }
    
    Azienda "1" *--> "abbonamento 1" Abbonamento 
    Azienda "1" *--> "anagrafica 1" Anagrafica 
    Azienda "1" *--> "contatti *" Contatto 
    Azienda "1" *--> "firmaDigitale 1" DigitalSign 
    Azienda "1" *--> "sedeLegale 1" Indirizzo 
    Azienda "1" *--> "licenza 1" Licenza 
    ClasseDocumentale "1" *--> "produttore 1" Anagrafica 
    ClasseDocumentale "1" *--> "contatto 1" Contatto 
    Contatto  -->  Anagrafica 
    User "1" *--> "azienda 1" Azienda 
```
>TODO definire Entities

## Classi documentali
[Qui](src/main/java/com/smeup/doc)
> TODO definire Entity