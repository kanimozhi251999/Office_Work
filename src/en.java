import java.util.ArrayList;
import java.util.List;

//Assignment 3
public class en {
    public static void namelist(List<String> na)
    {
        //int a= na.length;
        System.out.println("Names:"+na);
    }

    public static void main(String args[]){
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Kani");
        fruitList.add("Anu");
        fruitList.add("Raj");
        fruitList.add("Abija");
        namelist(fruitList);

    }
}
