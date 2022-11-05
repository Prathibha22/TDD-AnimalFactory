package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest(){
        String expectedName="Dog1";
        Date expectedDate=new Date();
        int expectedId=1;
        Dog objDog=new Dog(expectedName,expectedDate,expectedId);
        DogHouse.clear();
        DogHouse.add(objDog);
        Dog objActualDog=DogHouse.getDogById(1);
        String actualName=objActualDog.getName();
        Date actualDate=objActualDog.getBirthDate();
        int actualId=objActualDog.getId();
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate,actualDate);
        Assert.assertEquals(expectedId,actualId);

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogByIdTest(){
        DogHouse.clear();
        Dog objDog=new Dog("Dog1",new Date(),1);
        DogHouse.add(objDog);
        Dog expectedDog=null;
        DogHouse.remove(1);
        Dog actualDog=DogHouse.getDogById(1);
        Assert.assertEquals(expectedDog,actualDog);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogByObjTest(){
        DogHouse.clear();
        Dog objDog=new Dog("Dog1",new Date(),1);
        DogHouse.add(objDog);
        Dog expectedDog=null;
        DogHouse.remove(objDog);
        Dog actualDog=DogHouse.getDogById(1);
        Assert.assertEquals(expectedDog,actualDog);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){
        DogHouse.clear();
        Dog objDog=new Dog("Dog1",new Date(),1);
        DogHouse.add(objDog);
        Dog objActualDog=DogHouse.getDogById(1);
        Assert.assertEquals(objDog,objActualDog);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int actualNUmber=1;

        // When
        DogHouse.add(animal);

        // Then
        int expectedNumber=DogHouse.getNumberOfDogs();
        Assert.assertEquals(actualNUmber,expectedNumber);
    }
}
