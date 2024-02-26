import enums.Direction;
import enums.LampType;
import enums.PaintColor;
import model.*;

// Bir sınıfın başka bir sınıfı içermesine bileşim yani composition denir.
// Bir sınıf başka bir sınıf içerdiğinde iç içe geçmiş diye bir olay yoktur.
// bir sınıfın başka bir sınıfın özelliklerini ve davranışlarını kullanabilmesini sağlar.
//
public class Main {
    public static void main(String[] args) {



        Lamp lamp1  = new Lamp(LampType.NEON, true, 100);
        lamp1.turnOn();
        System.out.println("************************");
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        ceiling.create();
        System.out.println("************************");
        Bed bed = new Bed("Double",2,2,2,2);
        System.out.println(bed.toString() );
        System.out.println("************************");
        Wall northWall =   new Wall(Direction.NORTH);
        Wall southWall = new Wall(Direction.SOUTH);
        Wall eastWall = new Wall(Direction.EAST);
        Wall westWall = new Wall(Direction.WEST);

        Wall[] walls = {northWall,southWall,eastWall,westWall};

        System.out.println("************************");
        Bedroom bedroom = new Bedroom(northWall, southWall, westWall,
                eastWall, ceiling,lamp1,
                new Carpet(3,2,PaintColor.BLUE),
                "Ebeveyn",bed,new Wardrobe(1,3,20) );
        System.out.println(bedroom);

        bedroom.createBedroom();
    }
}