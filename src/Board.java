//StudentID: 6510450879
//Name: Mr.Yossawaj Bonsrithananon

import java.util.ArrayList;
import java.util.List;

public class Board {
    public static final int BOARD_SIZE = 40;
    private final List<Square> squares;
    public Board() {
        squares = new ArrayList<>();

        squares.add(new Square("Go",0,0)); //start
        squares.add(new Square("GSB @BTS Kaset",1,80)); //ธนาคารออมสิน bts เกษตร
        squares.add(new Square("Community Chest",2,0));
        squares.add(new Square("Kaset Hall",3,120)); //หอประชุม
        squares.add(new Square("Income Tax",4,0));
        squares.add(new Square("Sam Buraphachan Monument",5,60)); //อนุสาวรีย์ สามบูรพาจารย์
        squares.add(new Square("Office of Promotion and Training",6,100)); //อาหารวิทยบริการ
        squares.add(new Square("Chance",7,0));
        squares.add(new Square("7-11 @KU-books",8,200)); //7-11 ข้างศูนย์หนังสือ มก.
        squares.add(new Square("Home economics sector",9,140)); //ภาควิชาคหกรรมฯ

        squares.add(new Square("Jail / Just Visiting",10,0));
        squares.add(new Square("Faculty of Economics",11,180)); //คณะเศรษฐศาสตร์
        squares.add(new Square("Faculty of Business Administration",12,220)); //คณะบริหารฯ
        squares.add(new Square("OCS",13,180)); //สำนักบริการคอมพิวเตอร์
        squares.add(new Square("Shop cooperative",14,120)); //สหกรณ์ร้านค้า
        squares.add(new Square("KU History Hall",15,170)); //หอประวัติ มก.
        squares.add(new Square("Bureau of Agricultural Museums and Culture",16,300)); //สำนักพิพิธภัณฑ์และวัฒนธรรมการเกษตร
        squares.add(new Square("Community Chest",17,0));
        squares.add(new Square("Royal Project Foundation",18,350)); //มูลนิธิ โครงการหลวง
        squares.add(new Square("Sports Bureau",19,260)); //สำนักการกีฬา

        squares.add(new Square("Free Parking",20,0));
        squares.add(new Square("Tennis Court",21,80)); //สนามเทนนิส
        squares.add(new Square("Chance",22,0));
        squares.add(new Square("College of the Environment",23,120)); //วิทยาลัยสิ่งแวดล้อม
        squares.add(new Square("Faculty of Architecture",24,220)); //คณะสถาปัตยกรรมศาสตร์
        squares.add(new Square("Satitkaset School",25,100)); //โรงเรียนสาธิตแห่งมหาวิทยาลัยเกษตรศาสตร์
        squares.add(new Square("Faculty of Education",26,200)); //คณะศึกษาศาสตร์
        squares.add(new Square("Faculty of Agro-Industry",27,140)); //คณะอุตสาหกรรมเกษตร
        squares.add(new Square("KU-Green",28,180)); //ku-green
        squares.add(new Square("Chakkraphan Pensiri Building",29,220)); //อาคารจักรพันธ์เพ็ญศิริ

        squares.add(new Square("Go To Jail",30,0));
        squares.add(new Square("Central cafeteria 1",31,80)); //โรงอาหารกลาง 1
        squares.add(new Square("Faculty of Humanities",32,330)); //คณะมนุษยศาสตร์
        squares.add(new Square("Community Chest",33,0));
        squares.add(new Square("Faculty of Social Sciences",34,60)); //คณะสังคมศาสตร์
        squares.add(new Square("Library",35,100)); //หอสมุด
        squares.add(new Square("Chance",36,0));
        squares.add(new Square("Faculty of Engineering",37,140)); //คณะวิศวกรรมศาสตร์
        squares.add(new Square("Luxury Tax",38,0));
        squares.add(new Square("Faculty of Science",39,400)); //คณะวิทยาศาสตร์

    }
    public Square getSquare(Square location, int rollTotal) {
        int index = (location.getLocation() + rollTotal) % Board.BOARD_SIZE;
        return squares.get(index);
    }

    public Square initSquare(){
        return squares.get(0);
    }
}
