package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    //tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogTest(){
        //Given
        String expectedName="puppy";
        Date expectedDate=new Date();
        int expectedId=1;
        Dog objdog=new Dog(expectedName,expectedDate,expectedId);
        //When
        String actualName=objdog.getName();
        Date actualDate=objdog.getBirthDate();
        int actualId=objdog.getId();
        //Then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate,actualDate);
        Assert.assertEquals(expectedId,actualId);

    }
    //tests for `speak`
    @Test
    public void speakTest(){
        String expected="bark!";
        Dog objDog=new Dog("puppy",new Date(),1);
        String actual=objDog.speak();
        Assert.assertEquals(expected,actual);

    }
    //Tests for `setBirthDate(Date birthDate)
    @Test
    public void setBirthdateTest(){
        Date oldDate=new Date();
        Dog objDog=new Dog("name",oldDate,1);
        long timeadj = 24 * 60 * 60 * 1000;
       // Date newDate=new SimpleDateFormat("dd/mm/yyyy").parse(oldDate);
        Date expectedDate=new Date(oldDate.getTime()+timeadj);
        objDog.setBirthDate(expectedDate);
        Date actualDate=objDog.getBirthDate();
        Assert.assertEquals(expectedDate,actualDate);
    }
    //tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Dog objDog=new Dog("name",new Date(),1);
        Food objFood=new Food();
        objDog.eat(objFood);
        int expected=1;
        int actual=objDog.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }
    //tests for `Integer getId()`
    @Test
    public void getId(){
        Dog objDog=new Dog("name",new Date(),1);
        int expected=1;
        int actual=objDog.getId();
        Assert.assertEquals(expected,actual);

    }
    //test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest(){
        Dog objDog=new Dog("name",new Date(),1);
        Assert.assertTrue(objDog instanceof Animal);
    }
    //test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest(){
        Dog objDog=new Dog("name",new Date(),1);
        Assert.assertTrue(objDog instanceof Mammal);
    }

}
