import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> stud=new ArrayList<Student>();
        stud.add(new Student("Catalin"));
        stud.add(new Student("Diana"));
        stud.add(new Student("Iana"));
        System.out.println(stud);
        System.out.println(stud.get(1));

        Set<Student> students=new HashSet<Student>();
        Student x=new Student("Catalin");
        students.add(x);
        Student y=new Student("Diana");
        students.add(y);
        Student z=new Student("Diana");
        students.add(z);
        Student w=new Student("Iana");
        students.add(w);
        System.out.println(students);
        System.out.println(students.contains(x));

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
        System.out.println(w.hashCode());


        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("A",2019);
        map.put("Cata",10500);
        map.put("A",200);
        System.out.println(map);
        System.out.println(map.get("Cata"));
    }
}
