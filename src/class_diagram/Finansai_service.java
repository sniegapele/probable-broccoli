package class_diagram;

public class Finansai_service {
    Naudotojo_repository Naudotojas_repo;
    Nario_mokestis_repository Nario_mokestis_repo;
    Sistemos_parametrai_repository Sistemos_parametrai_repo;
    Mokėjimas_repository Mokėjimas_repo;

    Tipo_aprašas_repository Tipo_aprašas_repo;
    Reikšmės_aprašas_repository Reikšmės_aprašas_repo;

    void sumokėti_nario_mokestį() {
        // update naudotojas lentoj (sunm su neigiama suma)
        // insert i nario_mokestis
    }

    void peržiūrėti_nesumokėto_mokesčio_info() {
        // kvies nario_mokescio perziura ir atsaiciuos trukstamus
    }

    void pirkti_taškų() {
        //update naudotojas
        //insert mokejimas ???
    }

    //TODO review
    Integer peržiūrėti_turimų_taškų_kiekį() {
        return 0;
    }
}
