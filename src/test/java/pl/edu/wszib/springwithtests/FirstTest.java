package pl.edu.wszib.springwithtests;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)

public class FirstTest {

    @BeforeClass
    public static void przedWszystkimi (){

    }

    @Before
    public void przed(){

    }

    @Test
    public void test(){

        List list = Mockito.mock(ArrayList.class);
        Mockito.when(list.size()).thenReturn(1);
        Assert.assertEquals("nie ma jednego elementu",1, list.size());


//        Assert.assertEquals("cos poszło nie tak", true, false);
    }

    @After
    public void po(){

    }

    @AfterClass
    public static void poWszystkim(){

    }
}
