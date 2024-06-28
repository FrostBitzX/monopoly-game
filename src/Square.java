//StudentID: 6510450879
//Name: Mr.Yossawaj Bonsrithananon

public class Square {
    private String name;
    private int location;
    private int price;

    private Player owner;

    public Square(String locName, int location, int price) { //create each location in board
        name = locName;
        this.location = location;
        this.price = price;
        owner = null;

    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }

    public void setOwner(Player player) {
        owner = player;
    }
}
