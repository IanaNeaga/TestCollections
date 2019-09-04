public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object object){
        if(object!=null&&object instanceof Student){
            return name.equals(((Student)object).name);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
