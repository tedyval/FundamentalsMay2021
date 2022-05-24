package MapAdditional;

import java.util.*;


public class Snowwhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Dwarf> colorToDwarf = new LinkedHashMap<>();

        while (!input.equals("Once upon a time")) {
            String[] data = input.split(" <:> ");
            String name = data[0];
            if(!name.matches("^([^ <:>]+)$")){
                input = scanner.nextLine();
                continue;
            }
            String color = data[1];
            if(!color.matches("^([^ <:>]+)$")){
                input = scanner.nextLine();
                continue;
            }
            int physics = Integer.parseInt(data[2]);
            StringBuilder str = new StringBuilder();
            str.append(color).append(name);
            String colorName = str.toString();

            if (!colorToDwarf.containsKey(colorName)) {
                Dwarf currentDwarf = new Dwarf(name, color, physics);
                colorToDwarf.put(colorName, currentDwarf);
            } else if (colorToDwarf.containsKey(colorName)) {
                int newPhysics = Math.max(colorToDwarf.get(colorName).getPhysics(), physics);
                colorToDwarf.get(colorName).setPhysics(newPhysics);

            }


            input = scanner.nextLine();
        }


        colorToDwarf.entrySet().stream().sorted((e1, e2) -> {
            int result = Integer.compare(e2.getValue().getPhysics(), e1.getValue().getPhysics());
            if (result == 0) {
                result = e1.getValue().getColor().compareTo(e2.getValue().getColor());
                return result;
            }
            return result;
        }).forEach(k -> System.out.printf("(%s) %s <-> %d%n", k.getValue().getColor(), k.getValue().getName(), k.getValue().getPhysics()));


    }
}

class Dwarf {
    String name;
    String color;
    int physics;

    public Dwarf(String name, String color, int physics) {
        this.name = name;
        this.color = color;
        this.physics = physics;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }
}

