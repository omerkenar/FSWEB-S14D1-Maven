import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        //silindir için
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());


        //Havuz alanı için
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());


        //developers package için
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(1, "ömer", 2000);
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(2,"umut", 2250);

        MidDeveloper midDeveloper = new MidDeveloper(1,"hatice", 4000);

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(1, "yusuf",6000);

        HRManager hrManager = new HRManager(1,"fahri",10000,
                       new JuniorDeveloper[2], new MidDeveloper[2], new SeniorDeveloper[2]);


        System.out.println(juniorDeveloper.toString());
        juniorDeveloper.work();
        System.out.println(juniorDeveloper1.toString());
        juniorDeveloper1.work();
        System.out.println(seniorDeveloper.toString());
        seniorDeveloper.work();
        System.out.println(midDeveloper.toString());
        midDeveloper.work();
        System.out.println(hrManager.toString());
        hrManager.work();

        hrManager.addEmployee(0, juniorDeveloper);
        hrManager.addEmployee(1, juniorDeveloper1);
        hrManager.addEmployee(0,midDeveloper);
        hrManager.addEmployee(0, seniorDeveloper);

        System.out.println(hrManager.toString());
    }
}