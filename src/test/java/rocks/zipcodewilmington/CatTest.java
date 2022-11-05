package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
//import sun.util.calendar.BaseCalendar;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
  //  tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        Cat cat=new Cat("OldName",new Date(),1);
        String expected="NewName";
        cat.setName(expected);
        String actual=cat.getName();
        Assert.assertEquals(expected,actual);
    }
    //tests for `speak`
    @Test
    public void speakTest(){
        String expected="meow!";
        Cat cat=new Cat("name",new Date(),1);
        String actual= cat.speak();
        Assert.assertEquals(expected,actual);
    }
    //Create tests for `setBirthDate(Date birthDate)
    @Test
    public void setDateTest() {
        Date oldDate = new Date();
        Cat cat = new Cat("cat", oldDate, 1);
        long timeadj = 24 * 60 * 60 * 1000;
        Date expected = new Date(oldDate.getTime() + timeadj);
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    //tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Cat objCat=new Cat("name",new Date(),1);
        Food objfood =new Food();
        objCat.eat(objfood);
        objCat.eat(objfood);
        int expected=2;
        int actual=objCat.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }
    //test to check Animal inheritance;
    @Test
    public void animalInheritanceTest(){
        Cat objCat=new Cat("name",new Date(),1);
        boolean actual=false;
        if(objCat instanceof Animal){
             actual=true;
        }
        Assert.assertTrue(actual);
    }

    //test to check Mammal inheritance
    @Test
    public void mammalInheritanceTest(){
        Cat objCat=new Cat("name",new Date(),1);
        boolean actual=false;
        if(objCat instanceof Mammal){
            actual=true;
        }
        Assert.assertTrue(actual);
    }

}
