package class_diagram;

import java.util.Date;
import java.util.List;

public class Rezervacija_service {
    Vasarnamis_repository Vasarnamis_repo;
    Vasarnamio_rezervacija_repository Vasarnamio_rezervacija_repo;
    Patogumas_repository Patogumas_repo;
    Mokėjimas_repository Mokėjimas_repo;
    Sistemos_parametrai_repository Sistemos_parametrai_repo;
    Naudotojo_repository Naudotojas_repo;

    Tipo_aprašas_repository Tipo_aprašas_repo;
    Reikšmės_aprašas_repository Reikšmės_aprašas_repo;

    void rezervuoti_vasarnamį(Integer naudotojo_id, Integer vasarnamio_id, Date pradžia, Date pabaiga, Integer kaina) {
        // tikrina visus conditionus IR SUMOKA
        // insert rezervacija
        // insert mokėjimas
    }

    List<Vasarnamis> peržiūrėti_vasarnamius() {
        return null;
    }

    public class Vasarnamio_info {
    }

    Vasarnamio_info peržiūrėti_vasarnamio_informaciją(Integer vasarnamio_id) {
        return null;
    }

    List<Vasarnamis> ieškoti_vasarnamių_pagal_vietą(String vieta) {
        return null;
    }

    List<Vasarnamis> ieškoti_vasarnamių_pagal_vietų_skaičių(Integer vietos) {
        return null;
    }

    List<Vasarnamis> ieškoti_vasarnamių_pagal_patogumus(List<Patogumas> p) {
        return null;
    }

    void atšaukti_rezervaciją(Integer rezervacijos_id) {
        // įskaitant pinigų grąžinimą
    }

    List<Vasaramio_rezervacija> peržiūrėti_asmenines_rezervacijas(Integer naudotojo_id) {
        return null;
    }

    List<Papildoma_paslauga> peržiūrėti_papildomas_paslaugas() {
        return null;
    }

    void rezervuoti_papildomą_paslaugą(Integer naudotojo_id, Integer paslaugos_id) {
        // SUMOKA
        // insert rezervacija
        // insert mokėjimas
    }
}
