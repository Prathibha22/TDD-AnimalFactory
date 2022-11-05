package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest(){
       String expectedName="cat1";
       Date expectedDate=new Date();
       int expectedId=1;
       Cat objCat=new Cat(expectedName,expectedDate,expectedId);
       CatHouse.clear();
       CatHouse.add(objCat);
       Cat objActualCat=CatHouse.getCatById(1);
       String actualName=objActualCat.getName();
       Date actualDate=objActualCat.getBirthDate();
       int actualId=objActualCat.getId();
      Assert.assertEquals(expectedName,actualName);
      Assert.assertEquals(expectedDate,actualDate);
      Assert.assertEquals(expectedId,actualId);

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatByIdTest(){
        CatHouse.clear();
        Cat objCat=new Cat("cat1",new Date(),1);
        CatHouse.add(objCat);
        Cat expectedCat=null;
        CatHouse.remove(1);
        Cat actualCat=CatHouse.getCatById(1);
        Assert.assertEquals(expectedCat,actualCat);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatByObjTest(){
        CatHouse.clear();
        Cat objCat=new Cat("cat1",new Date(),1);
        CatHouse.add(objCat);
        Cat expectedCat=null;
        CatHouse.remove(objCat);
        Cat actualCat=CatHouse.getCatById(1);
        Assert.assertEquals(expectedCat,actualCat);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest(){
        CatHouse.clear();
        Cat objCat=new Cat("cat1",new Date(),1);
        CatHouse.add(objCat);
        Cat objActualCat=CatHouse.getCatById(1);
        Assert.assertEquals(objCat,objActualCat);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        CatHouse.clear();
        Cat objCat=new Cat("cat1",new Date(),1);
        CatHouse.add(objCat);
        CatHouse.add(objCat);
        int expected=2;
        int actual=CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }

}
