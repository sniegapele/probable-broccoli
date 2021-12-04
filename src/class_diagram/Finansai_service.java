package class_diagram;

import java.util.List;

public class Finansai_service {
    Naudotojo_repository Naudotojas_repo;
    Nario_mokestis_repository Nario_mokestis_repo;
    Sistemos_parametrai_repository Sistemos_parametrai_repo;
    Mokėjimas_repository Mokėjimas_repo;

    Tipo_aprašas_repository Tipo_aprašas_repo;
    Reikšmės_aprašas_repository Reikšmės_aprašas_repo;

    void sumokėti_nario_mokestį(Integer naudotojo_id) {
        // update naudotojas lentoj (sum su neigiama suma)
        // insert i nario_mokestis
    }

    List<Nario_mokestis> peržiūrėti_nario_mokesčio_info() {
        // kvies nario_mokescio perziura ir atskaiciuos trukstamus
        return null;
    }

    void pirkti_taškų(Integer naudotojo_id, Integer taškų_kiekis) {
        //update naudotojas
        //insert pirkimas
    }
}
