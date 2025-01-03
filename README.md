# valgdata-api
Spring-applikasjon som serverer valgdata

## Oppsett

For å kjøre applikasjonen lokalt trenger du å opprette en run-configuration i Intellij som setter miljøvariableler for applikasjonen. 
Dette vil sørge for at applikasjonen vet hvilken gcp-bøtte den skal gå i mot, hvilke credentials den skal bruke for å få tilgang, og litt penere logger i konsollen:

Åpne prosjektet i Intellij.

Gå til Run -> Edit Configurations... fra toppmenyen. I dialogboksen Run/Debug Configurations, klikk på +-knappen eller velg typen "Spring".

Gi konfigurasjonen et navn (f.eks. ValgdataApplicationLocal). I seksjonen Environment variables, klikk på + for å legge til en ny miljøvariabel. Her trenger du tre:
* ENV = local
* GOOGLE_APPLICATION_CREDENTIALS_JSON = *Finnes på GCP (Må være JSON)*
* VALGDATA_BUCKET_NAME = dataprodukter-nibas-dev-075c

Sett java-version som termurin21, og modul lik valgdata.main. Sett class lik: "no.kartverket.valgdata.ValgdataApplication"

Trykk "Apply" og deretter "Ok"
