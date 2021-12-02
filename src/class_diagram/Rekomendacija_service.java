package class_diagram;

public class Rekomendacija_service {
    Rekomendacija_repository Rekomendacija_repository;
    Pakvietimas_repository Pakvietimas_repo;

    Tipo_aprašas_repository Tipo_aprašas_repo;
    Reikšmės_aprašas_repository Reikšmės_aprašas_repo;

    void patvirtinti_rekomendaciją(Integer Kandidato_id) {
        // updatins rekomendaciją
    }

    void suteikti_rekomendaciją(Integer kandidato_id) {
        // cia kai patvirtinam kazka is sistemos
    }

    void pakviesti_narį(String el_paštas) {
        // mail + insertas
    }

    void prašyti_rekomendacijos(String email) {
        // prideda naują eilutę į rekomendacijas su tipu "laukiama"
    }
}
