package class_diagram;

import java.util.List;

public class Registracija_service {
    Naudotojo_repository Naudotojas_repo;
    Prisijungimo_duomenys_repository Prisijungimo_duomenų_repo;
    Klausimas_repository Klausimas_repo;
    Atsakymas_repository Atsakymas_repo;

    Tipo_aprašas_repository Tipo_aprašas_repo;
    Reikšmės_aprašas_repository Reikšmės_aprašas_repo;

    public class Registracijos_forma {
        String vardas;
        String pavardė;
        List<Naudotojo_service.Klausimas_atsakymas> atsakymai;
    }


    void užiregistruoti_naudojant_slaptažodį(Registracijos_forma forma, String password) {
    }

    void užsiregistruoti_naudojant_facebook(Registracijos_forma forma, String facebook_id) {

    }

    void registracija_su_pakvietimu(Registracijos_forma forma, String reiškmė, Integer pakvietimo_id) {
        // sitas turi rupintis, kad is karto insertintu ir rekomendacija is kvietejo (jeigu jis dar vis klubo narys???),
        // delete iš pakvietimų
    }

    void pakeisti_rolę(Integer Naudotojo_id, Integer Rolės_id) {
        // update Naudotojas - rolė
    }
}
