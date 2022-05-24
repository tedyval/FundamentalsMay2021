package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Piece> pieces = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("\\|");
            String piece = data[0];
            String composer = data[1];
            String key = data[2];
            Piece currentPiece = new Piece(piece,composer,key);
            pieces.put(piece,currentPiece);
        }

        String input2 = scanner.nextLine();
        while(!input2.equals("Stop")){
          String[] commandParts = input2.split("\\|");
          String command = commandParts[0];
          String piece = commandParts[1];
          switch(command){
              case "Add":
                  String composer = commandParts[2];
                  String key = commandParts[3];
                  if(!pieces.containsKey(piece)){
                      Piece currentPiece = new Piece(piece,composer,key);
                      pieces.put(piece,currentPiece);
                      System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                  }else{
                      System.out.printf("%s is already in the collection!%n",piece);
                  }
                  break;
              case "Remove":
                  if(pieces.containsKey(piece)){
                      pieces.remove(piece);
                      System.out.printf("Successfully removed %s!%n",piece);
                  }else{
                      System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                  }

                  break;
              case "ChangeKey":
                  String newKey = commandParts[2];
                  if(pieces.containsKey(piece)){
                  pieces.get(piece).setKey(newKey);
                      System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
                  }else{
                      System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                  }

                  break;

          }


            input2 = scanner.nextLine();
        }

        pieces.entrySet().stream().sorted((e1,e2)-> {
            int result = e1.getValue().getPiece().compareTo(e2.getValue().getPiece());
            if(result == 0){
                result = e1.getValue().getComposer().compareTo(e2.getValue().getComposer());
                return result;
            }
            return  result;
        }).forEach(e-> System.out.printf("%s -> Composer: %s, Key: %s%n",e.getValue().getPiece(),e.getValue().getComposer(),e.getValue().getKey()));









    }
}

class Piece{
    String piece;
    String composer;
    String key;

  public Piece(String piece, String composer,String key){
      this.piece = piece;
      this.composer = composer;
      this.key = key;
  }

    public String getPiece() {
        return piece;
    }

    public String getComposer(){
      return this.composer;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
