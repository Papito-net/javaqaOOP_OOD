package ru.netology.javaqaOOP_OOD;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Radio {

    private int radioStationsCount = 10;
    private int currentRadioStation;
    private int currentVolume = 0;

    // Конструктор с одним параметром для установки желаемого количества радиостанций
    public Radio(int radioStationsCount) {
        if (radioStationsCount > 0) {
            this.radioStationsCount = radioStationsCount;
        } else {
            this.radioStationsCount = 10; // Если указали 0 или минус, то ставим 10
        }
    }

    // Установка номера радиостанции в диапазоне от 0 до 9
    public void setCurrentRadioStation(int newRadioStation) {
        int maxStationIndex = this.radioStationsCount - 1; // Максимальный номер (например, 9 при 10 станциях)

        // При указании чисда меньше 0 или больше максимального номера радиостанции — игнорируем ввод
        if (newRadioStation < 0 || newRadioStation > maxStationIndex) {
            return;
        }
        this.currentRadioStation = newRadioStation;
    }

    // Метод установки громкости, контролируя выход за диапазон значений от 0 до 100
    public void setCurrentVolume(int newVolume) {
        if (newVolume > 100) {
            this.currentVolume = 100;
        } else if (newVolume < 0) {
            this.currentVolume = 0;
        } else {
            this.currentVolume = newVolume;
        }
    }

    // Циклическое переключение станции с 0 на 9 радиостанцию
    public void prevRadioStation() {
        int maxStationIndex = this.radioStationsCount - 1;

        if (currentRadioStation > 0) {
            currentRadioStation--; // Уменьшаем на 1
        } else {
            currentRadioStation = maxStationIndex; // Переход на последнюю радиостанцию, на 9 если их всего 10
        }
    }

    // Циклическое переключение станции с 9 на 0 радиостанцию
    public void nextRadioStation() {
        int maxStationIndex = this.radioStationsCount - 1;

        if (currentRadioStation < maxStationIndex) {
            currentRadioStation++; // Увеличиваем на 1
        } else {
            currentRadioStation = 0; // Переход на первую радиостанцию, на 0
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