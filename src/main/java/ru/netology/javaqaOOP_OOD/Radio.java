package ru.netology.javaqaOOP_OOD;

public class Radio {

    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int currentVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    // Установка номера радиостанции в диапазоне от 0 до 9
    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation > 9) {
            this.currentRadioStation = 9;
        } else if (newRadioStation < 0) {
            this.currentRadioStation = 0;
        } else {
            this.currentRadioStation = newRadioStation;
        }
    }

    // Циклическое переключение станции с 0 на 9 радиостанцию
    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--; // Уменьшаем на 1
        } else {
            currentRadioStation = 9; // Переход на 9
        }
    }

    // Циклическое переключение станции с 9 на 0 радиостанцию
    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++; // Увеличиваем на 1
        } else {
            currentRadioStation = 0; // Переход на 0
        }
    }


    // Метод установки громкости, игнорируя выход за диапазон значений от 0 до 100
    public void setCurrentVolume(int newVolume) {
        if (newVolume > 100) {
            this.currentVolume = 100;
        } else if (newVolume < 0) {
            this.currentVolume = 0;
        } else {
            this.currentVolume = newVolume;
        }
    }

    // Метод увеличения звука на 1
    public void incrementVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    // Метод уменьшения звука на 1
    public void decrementVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}