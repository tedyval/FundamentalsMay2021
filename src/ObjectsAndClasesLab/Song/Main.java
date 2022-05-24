package ObjectsAndClasesLab.Song;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Songs> songInList = new ArrayList<>();
        String typeList;
        String name;
        String time;

        for (int i = 0; i <n ; i++) {
            String[] characteristics = scanner.nextLine().split("_");
            typeList = characteristics[0];
            name = characteristics[1];
            time = characteristics[2];
            Songs song = new Songs(typeList,name,time);
            songInList.add(song);
        }

        String command = scanner.nextLine();
        if(command.equals("all")){
            songInList.forEach(song -> System.out.println(song.getName()));
        }else{
            songInList.stream().filter(song -> song.getTypeList().equals(command)).collect(Collectors.toList()).forEach(song -> System.out.println(song.getName()));

        }

    }
}
