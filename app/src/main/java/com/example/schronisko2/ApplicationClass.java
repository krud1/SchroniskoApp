package com.example.schronisko2;

import android.app.Application;

import com.example.schronisko2.Objects.AnimalObject;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<AnimalObject> animals;

    @Override
    public void onCreate() {
        super.onCreate();

        animals = new ArrayList<AnimalObject>();
        animals.add(new AnimalObject(0, "Bilusia", "10 lat", "bilusia1", "Samica", "Bilusia trafiła do nas po stracie opiekunki. Dziewuszka od dnia przyjęcia bardzo źle znosi pobyt w schronisku. Jest bardzo smutna i odrobinę osowiała. Bilusia na widok ręki człowieka wyciągniętej w jej stronę jednak nagle się ożywia i stara się zaczerpnąć jak najwięcej bliskości jakby to miał by być je ostatni kontakt z dwunożnym w życiu. Jest bardzo delikatna w kontaktach i nie przejawia ani grama agresji. Bilusia to cudowna, zrównoważona koteczka nadająca się do praktycznie każdego domu, czy to z dziećmi czy innymi zwierzętami. Pięknie załatwia się do kuwety a jej aksamitne futerko jest zawsze gotowe do głaskania. Czegóż pragnąć więcej?"));
        animals.add(new AnimalObject(1, "Mela", "Nieznany", "mela", "Samica", "Mela trafiła do nas po śmierci właściciela. Jest przekochaną, kontaktową koteczką, która potrzebuje kontaktu z człowiekiem. Bardzo źle znosi pobyt w schronisku. Śpi skulona w kącie i próbuje sobie sama stworzyć ciepło na wzór domowego. Gdy tylko usłyszy otwierającą się klateczkę natychmiast podbiega i wtula się najmocniej jak może. Mela uwielbia delikatne mizianie, mocniejsze głaskanie ją bardzo peszy i obawia się krzywdy ze strony człowieka. Mela to bardzo czysta koteczka. Bezbłędnie korzysta z kuwety. Poszukujemy dla Meli nowego, cudownego domu, który zadba o nią należycie i wynagrodzi jej samotny, zimny pobyt w schronisku."));
        animals.add(new AnimalObject(2, "Kiera", "1 rok", "kiera1", "Samica", "Kiera wraz z rodzeństwem i mamusią została znaleziona na ul. Westerplatte w Zielonej Górze. Jest przerażoną koteczką, która obawia się kontaktu z człowiekiem. Potrzebuje ogromu czasu i pracy aby poczuć się bezpiecznie i móc w pełni człowiekowi zaufać. W sytuacjach, w których nie czuje się komfortowo- ucieka. Potrafi korzystać z kuwety. Poszukujemy dla Kierze spokojnego domku, który pokaże jej dobrą stronę świata i przekona, że człowiek jej nie skrzywdzi."));
        animals.add(new AnimalObject(3, "Cytrynka", "2 lata", "cytrynka1", "Samica", "Cytrynka to przepiękna, delikatna koteczka. Na widok człowieka od razu podbiega do krat i prosi o zwrócenie na nią uwagi. Gdy dwunożny wyciągnie do niej rękę natychmiast ociera się o nią z gracją zbliżając się do piersi odwiedzającego. Cytrynka jest kotkiem typowo nakolankowym, który najprawdopodobniej w domu będzie cieniem opiekuna. Jak na prawdziwą kocią pannę przystało zachowuje czystość. Dla Cytrynki poszukujemy opiekuna, który zadba o nią należycie i nigdy już nie zostawi jej samej."));
        animals.add(new AnimalObject(4, "Lucynka", "7 miesięcy", "lucynka1", "Samica", "Lucynka trafiła z ul. Westerplatte w Zielonej Górze. Jest małą, kochaną kluseczką, która potrzebuje dłuższej chwili by zaufać i zacząć się spoufalać. W sytuacjach stresujących stosuje metodę ucieczki i jeszcze się nie zdarzyło by kogoś zaatakowała. Lucynka jest kotkiem czystym, korzystającym bezbłędnie z kuwety. Dla małej poszukujemy spokojnego domu, który poprowadzi ją za łapkę przez życie i pokaże, że nie ma się czego bać."));
    }
}
