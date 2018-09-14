
public class student {
    String name;
    String id;
    int year;

    public student (String name, String id, int year){
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYear() {
        return year;
    }



    public String toString(){
        return (" " + this.getName() + " " + this.getId() + " " + this.getYear());

    }

    public static void main(String [] args){
        student student = new student("Kazybek","17BD120385", 2);
        System.out.println(student.toString());
    }

}
