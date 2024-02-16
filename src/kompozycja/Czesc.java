package kompozycja;

class Czesc {
    String nazwa;

    Uzytkownik ulubioneUzytkowni;
    Czesc(String nazwa) {
        this.nazwa = nazwa;
    }

    String wybrana(){

        return nazwa;
    }

}
