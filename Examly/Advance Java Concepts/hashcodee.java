import java.util.*;
public class hashcodee {
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Map <Employee, String> map = new HashMap<Employee, String>();
        map.put(e1, "Anmol");
        map.put(e2, "Abhijeet");

        System.out.println(map.size());
    }    
}
class Employee
{
    int id;
    public void Employee(int id)
    {
        this.id=id;
    }
}