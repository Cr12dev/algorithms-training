package github.cr12dev.poo;

public class Person {

    /*  Atributos */
    protected String name; //Nombre
    private int age; //Numerico | Edad
    private String id;

    /*  Constructor */
    public Person(String name, int age, String id){
        this.name = name;
        this.setAge(age);
        this.id = id;
    }

    /*  Output metodo   */
    public void saludar() {
        System.out.println("Hola soy " + name + ", tengo " + age + "años y mi id es " + id);
    }

    /*  Getter  */
    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /*  Setter */
    public void setAge(int age){
        /*Se verifica si la edad es mayor a 0*/
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no validad");
        }
    }

    public void setName(String name){
        this.name = name;
        if (name == " "){
            System.out.println("Añada un nombre valido");
        } else {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        var person = new Person("Cr12", 17, "32jhh2");

        person.saludar();

        /*  Cambiar de edad */
        person.setAge(67);
        System.out.println("Se cambio la edad a " + person.getAge() + " años");

        /*  Cambiar de nombre */
        /*
        *
        * person.setAge(67);
        * System.out.println("Se cambio la edad a " + person.getAge() + " años");
        *
        * */


    }

}
