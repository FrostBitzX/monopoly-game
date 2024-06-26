//StudentID: 6510450879
//Name: Mr.Yossawaj Bonsrithananon

public class Square {
    private String name;
    private int location;
    private int price;

    public  Square(String locName, int location, int price){ //create each location in board
        name = locName;
        this.location = location;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public int getLocation() {
        return location;
    }
}
