package task26;

public class TV {
    private Channel[] channels; // набор каналов
    private int countOfChannels; // количество добавленных каналов

    public TV() {
        this.channels = new Channel[10]; // создаем массив для максимум 10 каналов
        this.countOfChannels = 0; // изначально каналов нет
    }

    public void addChannel(Channel channel) { // добавляет канал в телевизор

    }

    public void runChannel(int channelNumber) { // запускает канал с нужным номером
        channels[channelNumber].showProgram();
    }
}
