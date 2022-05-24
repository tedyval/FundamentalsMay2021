package ObjectsAndClasesLab.Song;

public class Songs {

    private String typeList;
    private String name;
    private String time;
    public Songs(String typeList, String name, String time){
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getTypeList(){
        return this.typeList;
    }

    @Override
    public String toString() {
        return String.format("%s%n",this.typeList);
    }

    public String getName(){
        return this.name;
    }
}
