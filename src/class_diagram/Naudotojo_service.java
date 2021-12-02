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

    void gauti_naudotojo_duomenis(Integer naudotojo_id) {
        // TODO koks čia return tipas? Idėja,kad returnina viską sujoininus
        //  iš visų lentų (Naudotojas, klausimas, atsakymas,blokavimas)
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

    void atnaujinti_atsakymus_į_klausimus(Integer Naudotojo_id) {
        // TODO man atrodo, kad galbūt logiška būtų pasiimt kokį nors klausimų listą,
        //  tuomet atnaujintų reikšmių listą ir tada šitas metodas updatintų viską po vieną,
        //  bet no idea kaip tai užrašyt per parametrus
    }

    void gauti_naudotojų_sąrašą() {
        // TODO return List<Naudotojas>?? bet būtų geriau rodyt daugiau info
    }

    void rasti_naudotoją(String tekstas) {
        // paduoda vardą/pavardę
        // TODO ką returninam? būtų geriau rodyt daugiau, kaip ir kituose profiliuose
    }

    List<Naudotojas> gauti_kandidatų_sąrašą() {
        // gal pridedam daugiau infonei tik šitas tipas - no idea, bet tuomet mums reik susiderint su UI
        // TODO apibrėžiant tipą pažiūrėti su UI, ką returnina kandidatų sąraše
        return null;
    }

    void išsiregistruoti() {
        // pateikiamas prasymas
    }

    void atšaukti_išsiregistravimą() {

    }
}
