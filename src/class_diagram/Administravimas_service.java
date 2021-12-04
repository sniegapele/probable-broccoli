package class_diagram;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Administravimas_service {
    Sistemos_parametrai_repository Sistemos_parametrai_repo;
    Rezervacijos_grupė_repository Rezervacijos_grupė_repo;
    Rezervacijos_grupės_data_repository Rezeracijos_grupės_data_repo;
    Vasarnamis_repository Vasaramis_repo;
    Patogumas_repository Patogumas_repo;
    Papildoma_paslauga_repository Papildoma_paslauga_repo;
    Klausimas_repository Klausimas_repo;
    Naudotojo_repository Naudotojas_repo;
    Vasarnamio_rezervacija_repository Vasarnamio_rezervacija_repo;
    Nuopelnas_repository Nuopelnas_repo;
    Nario_mokestis_repository Nario_mokestis_repo;
    Mokėjimas_repository Mokėjimas_repo;
    Blokavimas_repository Blokavimas_repo;
    Pranešimas_repository Pranešimas_repo;

    Tipo_aprašas_repository Tipo_aprašas_repo;
    Reikšmės_aprašas_repository Reikšmės_aprašas_repo;


    void nustatyti_vasarnamių_rezervacijos_pradžią(Date data) {
    }

    void nustatyti_vasarnamių_rezervacijos_pabaigą(Date data) {
    }

    void nustatyti_sezono_pradžią(Date data) {
    }

    void nustatyti_sezono_pabaigą(Date data) {
    }

    void nustatyti_rezervacijos_grupių_skaičių(Integer sk) {
    }

    void nustatyti_maksimalią_atostogų_trukmę(Integer sk) {
    }

    void išskirstyti_narius_į_rezervacijos_grupes() {
        // + notif
    }

    void nustatyti_grąžinamą_dalį_atšaukus_rezeraciją(List<Integer> param) {
        // čia ale paduosim keturis atributus lentoj parametrų,
        // kurie nusakys,kiek laiko liko ir juose laikysim procentus
    }

    void pašalinti_vasarnamį(Integer vasarnamio_id) {
    }

    void redaguoti_vasarnamį(Vasarnamis v, List<Patogumas> p) {
        // įskaitant ir patogumus
    }

    void pridėti_vasarnamį(Vasarnamis v, List<Patogumas> p) {
        //įskaitant ir patogumus
    }

    void pridėti_papildomą_paslaugą(Papildoma_paslauga p) {
    }

    void redaguoti_papildomą_paslaugą(Papildoma_paslauga p) {
    }

    void pašalinti_papildomą_paslaugą(Integer id) {
    }

    void pridėti_klausimą_į_anketą(String klausimas) {
    }

    void paslėpti_klausimą(Integer id) {
    }

    void įkelti_narius_iš_CSV(File failas) {
        // tegul suka cikliuką ir prideda po vieną :)
    }

    void keisti_rekomendacijų_kiekį(Integer kiekis) {
        //įskaitant ir rolių update
    }

    void blokuoti_naudotoją(Integer naudotojo_id) {
    }

    void atblokuoti_naudotoją(Integer naudotojo_id) {
    }

    void atšaukti_rezervaciją(Integer rezervacijos_id) {
        // negrąžinti pinigų
    }

    void keisti_max_narių_skaičių(Integer kiekis) {
    }

    void keisti_nario_mokesčio_dydį(Integer mokestis) {
        // integer , nes taškai sveiki
    }

    void skirti_taškų(Integer naudotojo_id, Integer taškų_kiekis, String priežastis) {
    }

    List<Nario_mokestis> peržiūrėti_nario_mokesčio_mokėjimo_istoriją() {
        return null;
    }

    List<Mokėjimas> peržiūrėti_taškų_mokėjimo_istoriją() {
        return null;
    }

    List<Klubo_taškų_pirkimas> peržiūrėti_pirkimo_istoriją() {
        return null;
    }

    List<Blokavimas> peržiūrėti_blokavimus() {
        return null;
    }

    List<Nuopelnas> peržiūrėti_nuopelnus() {
        return null;
    }

    void pakeisti_taško_kainą(Float nauja_kaina) {
    }

    void patvirtinti_mokėjimą(Integer naudotojo_id, Integer taškų_kiekis, Double sumokėta_suma) {

    }

}
