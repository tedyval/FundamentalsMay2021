package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Hero> heroes = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] heroesData = input.split(" ");
            String name = heroesData[0];
            int hp = Integer.parseInt(heroesData[1]);
            int mp = Integer.parseInt(heroesData[2]);
            Hero currentHero = new Hero(name,hp,mp);
            heroes.put(name,currentHero);
        }

        String input2 = scanner.nextLine();
        while(!input2.equals("End")){
            String[] commandParts  = input2.split(" - ");
            String command = commandParts[0];
            String name = commandParts[1];
            switch(command){
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandParts[2]);
                    String spell = commandParts[3];
                    if(mpNeeded <= heroes.get(name).getMp()){
                        heroes.get(name).setMp(heroes.get(name).getMp() - mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",name,spell,heroes.get(name).getMp());
                    }else{
                        System.out.printf("%s does not have enough MP to cast %s!%n",name,spell);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];
                    if((heroes.get(name).getHp() - damage) > 0){
                        heroes.get(name).setHp(heroes.get(name).getHp() - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",name,damage,attacker,heroes.get(name).getHp());
                    }else{
                        System.out.printf("%s has been killed by %s!%n",name,attacker);
                        heroes.remove(name);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(commandParts[2]);
                    int newAmount =(heroes.get(name).getMp() + amount);
                    int amountToBeSet = 0;
                    if(newAmount > 200){
                        amountToBeSet = 200;
                        System.out.printf("%s recharged for %d MP!%n",name,Math.abs(heroes.get(name).getMp()-200));
                    }else{
                        amountToBeSet = newAmount;
                        System.out.printf("%s recharged for %d MP!%n",name,amount);
                    }
                    heroes.get(name).setMp(amountToBeSet);

                    break;
                case "Heal":
                    int amount1 = Integer.parseInt(commandParts[2]);
                    int newSum = heroes.get(name).getHp() + amount1;
                    int amountTooBeSet = 0;
                    if(newSum > 100){
                       amountTooBeSet = 100;
                        System.out.printf("%s healed for %d HP!%n",name,Math.abs(heroes.get(name).getHp()-100));
                    }else{
                        amountTooBeSet = newSum;
                        System.out.printf("%s healed for %d HP!%n",name,amount1);
                    }
                    heroes.get(name).setHp(amountTooBeSet);

                    break;

            }
            input2 = scanner.nextLine();
        }

        heroes.entrySet().stream().sorted((e1,e2) -> {
            int result = Integer.compare(e2.getValue().getHp(),e1.getValue().getHp());
            if(result == 0){
                return e1.getValue().getName().compareTo(e2.getValue().getName());
            }
            return  result;
        }).forEach(e-> {
            System.out.printf("%s%n",e.getValue().getName());
            System.out.printf("  HP: %d%n",e.getValue().getHp());
            System.out.printf("  MP: %d%n",e.getValue().getMp());
        });






    }
}

class Hero{
    String name;
    int hp;
    int mp;

 public Hero(String name, int hp, int mp){
     this.name = name;
     this.hp = hp;
     this.mp = mp;
 }

 public String getName(){
     return this.name;
 }


    public void setMp(int points) {
     this.mp = points;
    }

    public int getMp() {
     return this.mp;
    }

    public int getHp() {
     return this.hp;
    }

    public void setHp(int points) {
     this.hp = points;
    }
}
