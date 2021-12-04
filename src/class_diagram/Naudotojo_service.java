package class_diagram;

import java.util.List;

public class Naudotojo_service {
    Naudotojo_repository Naudotojas_repo;
    Klausimas_repository Klausimas_repo;
    Atsakymas_repository Atsakymas_repo;
    Prisijungimo_duomenys_repository Prisijungimo_duomenys_repo;
    Rekomendacija_repository Rekomendacija_repo;
    Išsiregistravimas_repository Išsiregistravimas_repo;
    Blokavimas_repository Blokavimas_repo;


    Tipo_aprašas_repository Tipo_aprašas_repo;
    Reikšmės_aprašas_repository Reikšmės_aprašas_repo;

    public class Naudotojo_duomenys {
        Naudotojas naudotojas;
        List<Klausimas_atsakymas> atsakymai;
        boolean blokuotas;
    }

    public class Klausimas_atsakymas {
    }

    Naudotojo_duomenys gauti_naudotojo_duomenis(Integer naudotojo_id) {
        // TODO koks čia return tipas? Idėja,kad returnina viską sujoininus
        //  iš visų lentų (Naudotojas, klausimas, atsakymas, blokavimas)
        return null;
    }

    Integer gauti_gautų_rekomendacijų_skaičių() {
        return 0;
    }

    void redaguoti_slaptažodį(Integer Naudotojo_id, String Nauja_reikšmė) {
        // update Prisijungimo_duomenys
    }

    void redaguoti_naudotojo_duomenis(Integer Naudotojo_id, String Vardas, String Pavardė) {
        // update Naudotojas
    }

    void atnaujinti_atsakymus_į_klausimus(Integer Naudotojo_id, Integer klausimo_id, String atsakymas) {
    }

    List<Naudotojas> gauti_naudotojų_sąrašą() {
        return null;
    }

    List<Naudotojas> rasti_naudotoją(String tekstas) {
        // paduoda vardą/pavardę
        return null;
    }

    List<Naudotojas> gauti_kandidatų_sąrašą() {
        return null;
    }

    void išsiregistruoti(Integer naudotojo_id) {
        // pateikiamas prasymas
    }

    void atšaukti_išsiregistravimą(Integer naudotojo_id) {

    }
}
