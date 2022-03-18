import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

public class DependecyVerifyTest {

    @Rule
    public MockitoRule MockitoRule = MockitoJUnit.rule();

    @Mock
    private Dependency dependency;


    @Test
    public void testSimpleVerify(){
        //Nunca se ha ejecutado
        verify(dependency, never()).getClassNameUpperCase();
        dependency.getClassNameUpperCase();

        //Exactamente una vez
        verify(dependency, times(1)).getClassNameUpperCase();

        //Como minimo una vez
        verify(dependency, atLeast(1)).getClassNameUpperCase();
        dependency.getClassNameUpperCase();

        //como maximo 2 veces
        verify(dependency, atMost(2)).getClassNameUpperCase();
    }

    @Test
    public void testParameters(){
        dependency.addTwo(3);

        //Una vez con el parametro 3
        verify(dependency, times(1)).addTwo(3);
        dependency.addTwo(4);

        //Dos veces con cualquier parametro
        verify(dependency, times(2)).addTwo(anyInt());
    }
}
