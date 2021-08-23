package com.mphasis.main.cui;

import java.io.*;

class Person implements Serializable{
    private static final long serialVersionUID=1l;
    int id;
    String name;
    int age;
    transient int value;

    public Person(int id, String name, int age, int value) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.value=value;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", value=" + value+
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here\
        Person person=new Person(1,"Allen",25,10);
        try(FileOutputStream fileOutputStream=new FileOutputStream("Objects.ser");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            FileInputStream fileInputStream=new FileInputStream("Objects.ser");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)) {
            objectOutputStream.writeObject(person);

            Object object= objectInputStream.readObject();
            System.out.println(object);
            /*if (object instanceof Person){
                Person person1=(Person) object;
                System.out.println(person1);
            }

             */
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
