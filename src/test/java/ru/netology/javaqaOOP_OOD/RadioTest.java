package ru.netology.javaqaOOP_OOD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    // Установка номера радиостанции
    @Test
    void shouldSetRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    // Установка номера радиостанции с превышением диапазона
    @Test
    void shouldSetNegMaxRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    // Установка номера радиостанции выходящее за нижний предел
    @Test
    void shouldSetNegMinRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    // Увеличение номера станции на 1
    @Test
    void shouldSetIncreaseRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        rad.nextRadioStation();

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    // Уменьшение номера станции на 1
    @Test
    void shouldSetDecreaseRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        rad.prevRadioStation();

        int expected = 4;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    // Циклическое переключение станции с 9 на 0 радиостанцию
    @Test
    void shouldSetNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    // Циклическое переключение станции с 0 на 9 радиостанцию
    @Test
    void shouldSetPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    // Установка значения громкости
    @Test
    void shouldSetCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Установка значения громкости превышающее верхний предел
    @Test
    void shouldGetNegCurrentMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Установка значения громкости выходящее за нижний предел
    @Test
    void shouldSetNegCurrentMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Увеличение громкости на 1
    @Test
    void shouldSetIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(98);
        rad.incrementVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Увеличение значения громкости на 1 с превышением диапазона
    @Test
    void shouldSetNegIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.incrementVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Уменьшение громкости на 1
    @Test
    void shouldSetDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(2);
        rad.decrementVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Уменьшение значения громкости на 1 с превышением нижней границы диапазона
    @Test
    void shouldSetNegDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decrementVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}

