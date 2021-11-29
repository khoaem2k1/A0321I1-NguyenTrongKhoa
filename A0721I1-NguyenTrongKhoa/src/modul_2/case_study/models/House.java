package case_study.models;

public class House extends Facility{
    private int toilet;
    private String furniture;

    public House() {
    }

    public House(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, int toilet, String furniture) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.toilet = toilet;
        this.furniture = furniture;
    }

    public int getToilet() {
        return toilet;
    }

    public void setToilet(int toilet) {
        this.toilet = toilet;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    @Override
    public String toString() {
        return "House{" +
                "idFacility='" + getIdFacility() +
                ", nameService='" + getNameService() +
                ", areaUse=" + getAreaUse() +
                ", rentalPrice=" + getRentalPrice() +
                ", rentalPeopleMax=" + getRentalPeopleMax() +
                ", styleRental='" + getStyleRental()+
                "toilet=" + toilet +
                ", furniture='" + furniture + '\'' +
                '}';
    }
}
