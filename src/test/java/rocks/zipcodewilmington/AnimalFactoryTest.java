package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    //Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        String expectedName="Dog1";
        Date expectedDate=new Date();
        int expectedId=0;
        Dog obj= AnimalFactory.createDog(expectedName,expectedDate);
        String actualName=obj.getName();
        Date actualDate=obj.getBirthDate();
        int actualId=obj.getId();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate,actualDate);
        Assert.assertEquals(expectedId,actualId);
    }
    //Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        String expectedName="Cat1";
        Date expectedDate=new Date();
        int expectedId=0;
        Cat obj= AnimalFactory.createCat(expectedName,expectedDate);
        String actualName=obj.getName();
        Date actualDate=obj.getBirthDate();
        int actualId=obj.getId();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate,actualDate);
        Assert.assertEquals(expectedId,actualId);
    }
}
