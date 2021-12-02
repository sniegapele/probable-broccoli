package class_diagram;

public class Rekomendacija_repository {
    Integer gauti_gautų_rekomendacijų_skaičių(Integer Kandidato_id) {
        return 0;
    }

    void patvirtinti_rekomendaciją(Integer nario_id, Integer kandidato_id) {
        // updatina statusą
    }

    void pridėti_rekomendaciją(Integer nario_id, Integer tipas, Integer kandidato_id) {
        // insertina naują eilutę, tipas atskiria prašymus nuo patvirtinimų
    }

    void pridėti_naują_pakvietimą(Integer nario_id, String el_paštas) {
        // insert į pakvietimas
    }
}
