public class C1{
    String name;
    int age;
    public C1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String Name){
        this.name = Name;
    }

    public void setAge(int Age){
        this.age = Age;
    }

    public boolean isAdult(){
        return age >= 18;
    }

    public String toString(){
        return String.format("%s,%d",name,age);
    }

    public static void main(String[] args) {
        C1 o = new C1("Anna", 21);
        System.out.println(o.getAge());
        System.out.println(o.isAdult());
        o.setAge(17);
        System.out.println(o.isAdult());
        System.out.println(o.toString());
    }
}
