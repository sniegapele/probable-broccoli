package class_diagram;

public class Rezervacija_service {
    Vasarnamis_repository Vasarnamis_repo;
    Vasarnamio_rezervacija_repository Vasarnamio_rezervacija_repo;
    Patogumas_repository Patogumas_repo;
    Mokėjimas_repository Mokėjimas_repo;
    Sistemos_parametrai_repository Sistemos_parametrai_repo;
    Naudotojo_repository Naudotojas_repo;

    Tipo_aprašas_repository Tipo_aprašas_repo;
    Reikšmės_aprašas_repository Reikšmės_aprašas_repo;

    void rezervuoti_vasarnamį() {
        // tikrina visus conditionus IR SUMOKA
        // insert rezervacija
        // insert mokėjimas
    }

    void peržiūrėti_vasarnamių_informaciją() {
    }

    void peržiūrėti_vasarnamio_informaciją() {
    }

    void ieškoti_vasarnamių_pagal_vietą() {
    }

    void ieškoti_vasarnamių_pagal_vietų_skaičių() {
    }

    void ieškoti_vasarnamių_pagal_patogumus() {
    }

    void atšaukti_rezervaciją() {
        // įskaitant pinigų grąžinimą
    }

    void peržiūrėti_asmenines_rezervacijas() {
    }

    void rezervuoti_papildomą_paslaugą(){
        // SUMOKA
        // insert rezervacija
        // insert mokėjimas
    }
}
