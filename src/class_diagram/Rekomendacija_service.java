package class_diagram;

public class Rekomendacija_service {
    Naudotojo_repository Naudotojas_repo;
    Rekomendacija_repository Rekomendacija_repo;
    Pakvietimas_repository Pakvietimas_repo;
    Pranešimas_repository Pranešimas_repo;

    Tipo_aprašas_repository Tipo_aprašas_repo;
    Reikšmės_aprašas_repository Reikšmės_aprašas_repo;

    void patvirtinti_rekomendaciją(Integer nario_id, Integer Kandidato_id) {
        // updatins rekomendaciją
    }

    void suteikti_rekomendaciją(Integer nario_id, Integer kandidato_id) {
        // cia kai patvirtinam kazka is sistemos
    }

    void pakviesti_narį(Integer nario_id, String el_paštas) {
        // mail + insertas
    }

    void prašyti_rekomendacijos(Integer kandidato_id, String email) {
        // prideda naują eilutę į rekomendacijas su tipu "laukiama"
    }
}
