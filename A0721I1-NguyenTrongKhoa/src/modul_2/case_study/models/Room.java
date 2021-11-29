package case_study.models;

public class Room extends Facility{
    private int table;
    private  int chair;
    private  int bed;

    public Room() {
    }

    public Room(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, int table, int chair, int bed) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.table = table;
        this.chair = chair;
        this.bed = bed;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public int getChair() {
        return chair;
    }

    public void setChair(int chair) {
        this.chair = chair;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idFacility='" + getIdFacility() + '\'' +
                ", nameService='" + getNameService() + '\'' +
                ", areaUse=" + getAreaUse() +
                ", rentalPrice=" + getRentalPrice() +
                ", rentalPeopleMax=" + getRentalPeopleMax() +
                ", styleRental='" + getStyleRental() + '\'' +
                "table=" + table +
                ", chair=" + chair +
                ", bed=" + bed +
                '}';
    }
}
