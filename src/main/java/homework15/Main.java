package homework15;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Тут Все Красиво
*⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣀⣀⣠⣤⣤⣄⣀⣀⣀⡀
⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⠤⠖⠊⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠙⠲⢤⡀
⠄⠄⠄⠄⠄⠄⠄⡤⠊⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⢦⡀
⠄⠄⠄⠄⠄⠄⡜⠄⠄⠄⠄⠄⠄⢀⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⢢⠄⠄⠄⠄⠄⢳
⠄⠄⠄⠄⠄⣸⠁⠄⠄⠄⠄⠄⠄⠄⠱⡀⠄⠄⠄⠄⠄⠄⠄⡀⠈⠄⡀⠄⠄⠄⠈⡇
⠄⠄⠄⠄⠄⡏⠄⠄⠄⠄⠄⠄⠄⠄⡰⠁⠄⠄⠄⠄⠄⠄⠄⠘⡆⡜⠁⠄⠄⠄⠄⢧⡀
⠄⠄⠄⠄⠄⡇⠄⠄⠄⠄⠄⠄⠄⠸⡀⠄⠄⠄⠄⠄⣀⣤⡂⠄⠇⠱⠄⡀⠄⠄⠄⠄⡇
⠄⠄⠄⠄⠄⢇⠄⠄⠄⠄⠄⠄⠄⠄⠈⢄⡀⢠⣟⢭⣥⣤⠽⡆⠄⡶⣊⣉⣲⣤⢀⡞
⠄⠄⠄⠄⠄⠘⣆⠄⠄⠄⠄⠄⠄⡀⠄⠐⠂⠘⠄⣈⣙⡡⡴⠄⠄⠙⣄⠙⣛⠜⠘⣆
⠄⠄⠄⠄⠄⠄⠈⢦⡀⠄⠄⠄⢸⠁⠄⠄⠄⠄⠄⠄⠄⠊⠄⠄⠄⠄⡸⠛⠄⠄⠄⢸
⠄⠄⠄⠄⠄⠄⠄⠄⠈⠓⠦⢄⣘⣄⠄⠄⠄⠄⠄⠄⠄⡠⠄⠄⠄⠄⣇⡀⠄⠄⣠⠎
⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣸⠁⠈⡟⠒⠲⣄⠄⠄⡰⠇⠖⢄⠄⠄⡹⡇⢀⠎
⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡇⠄⠄⡇⠄⠄⠹⠄⡞⠄⠄⢀⠤⣍⠭⡀⢱⢸
⠄⠄⠄⠄⠄⠄⢀⣀⣀⣠⠞⠄⠄⢠⡇⠄⠄⠄⠄⠁⠄⢴⠥⠤⠦⠦⡼⠄⢸
⣀⣤⣴⣶⣿⣿⡟⠁⠄⠋⠄⠄⠄⢸⠁⠄⠄⠄⠄⠄⠄⠄⠑⣠⢤⠐⠁⠄⢸
⣿⣿⣿⣿⣿⡟⠄⠄⠄⠄⠄⠄⠄⢸⡀⠄⠄⠄⠄⠄⠄⠄⠄⠬⠥⣄⠄⠄⠈⠲⡄
⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠙⠦⣄⠄⠄⠄⠄⠄⠄⠄⠄⠈⢳⠄⠄⢀⣿⡀
⣿⣿⣿⣿⣿⣧⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠙⠒⠦⠤⢤⣄⣀⣠⠤⢿⣶⣶⣿⣿⣿⣶⣤⡀
⣿⣿⣿⣿⣿⣿⣷⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡼⠁⠄⠄⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣄
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⣤⣤⣀⣀⣀⣀⣀⣀⣀⣤⣤⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
* */

public class Main {
    public static void main(String[] args) {

        StreamTask streamTask = new StreamTask();

        streamTask.firstStreamTask();

        streamTask.secondStreamTask();

        streamTask.thirdStreamTask();

        streamTask.fourthStreamTask();

        streamTask.fifthStreamTask();

        streamTask.sixthStreamTask();

        StreamTask.seventhStreamTask();


    }
}
