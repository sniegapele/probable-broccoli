package class_diagram;

public class Registracija_service {
    Naudotojo_repository Naudotojas_repo;
    Prisijungimo_duomenys_repository Prisijungimo_duomenų_repo;
    Klausimas_repository Klausimas_repo;
    Atsakymas_repository Atsakymas_repo;

    Tipo_aprašas_repository Tipo_aprašas_repo;
    Reikšmės_aprašas_repository Reikšmės_aprašas_repo;

    void užiregistruoti_naudojant_slaptažodį() {
        // TODO ar galima palikti šitą kaip atskirą funkciją?
        //  Ar reik paskaidyt į duomenų persiuntimą į skirtingas lentas?
    }

    void užsiregistruoti_naudojant_facebook() {

    }

    void registracija_su_pakvietimu(){
        // TODO any parameters? is db ims insert statusui ir nedeletinam is pakvietimu??
        // sitas turi rupintis, kad is karto insertintu ir rekomendacija is kvietejo (jeigu jis dar vis klubo narys???)
    }

    void pakeisti_rolę(Integer Naudotojo_id, Integer Rolės_id) {
        // update Naudotojas - rolė
    }
}
