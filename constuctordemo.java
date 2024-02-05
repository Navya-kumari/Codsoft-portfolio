
class Students{
    int id;
    int age;

    Students(int id,int age){
        this.id=id;
        this.age=age;
        System.out.println("Hello world");
    }
}

public class constuctordemo{
    public static void main (String[]args){
        Students obj = new Students(id: 5 , age:19);

    }
}