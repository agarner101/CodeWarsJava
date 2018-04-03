package freddy_types;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by andrewgarner on 4/3/18.
 */
public class FreddyTest extends TestCase {

    //---- Solution 0 ----
    public void testSolve1A() throws Exception {
        assertEquals("The quick brown fox jumps over the lZY DOG.",
                Freddy.solve1("The quick brown fox jumps over the lazy dog."));
    }

    public void testSolve1B() throws Exception {
        assertEquals("",
                Freddy.solve1("aAaaaaAaaaAAaAa"));
    }

    public void testSolve1C() throws Exception {
        assertEquals("The end of the institution, mINTENnce, ND dministrTION OF GOVERNMENT, IS TO SECURE THE EXISTENCE OF THE BODY POLITIC, TO PROTECT IT, nd to furnish the individuLS WHO COMPOSE IT WITH THE POWER OF ENJOYING IN Sfety ND TRnquillity their nTURl rights, ND THE BLESSINGS OF LIFE: nd whenever these greT OBJECTS re not obtINED, THE PEOPLE Hve  RIGHT TO lter the government, ND TO Tke meSURES NECESSry for their sFETY, PROSPERITY nd hPPINESS.",
                Freddy.solve1("The end of the institution, maintenance, and administration of government, is to secure the existence of the body politic, to protect it, and to furnish the individuals who compose it with the power of enjoying in safety and tranquillity their natural rights, and the blessings of life: and whenever these great objects are not obtained, the people have a right to alter the government, and to take measures necessary for their safety, prosperity and happiness."));
    }

    //---- Solution 0 ----
    public void testSolve0A() throws Exception {
        assertEquals("The quick brown fox jumps over the lZY DOG.",
                Freddy.solve0("The quick brown fox jumps over the lazy dog."));
    }

    public void testSolve0B() throws Exception {
        assertEquals("",
                Freddy.solve0("aAaaaaAaaaAAaAa"));
    }

    public void testSolve0C() throws Exception {
        assertEquals("The end of the institution, mINTENnce, ND dministrTION OF GOVERNMENT, IS TO SECURE THE EXISTENCE OF THE BODY POLITIC, TO PROTECT IT, nd to furnish the individuLS WHO COMPOSE IT WITH THE POWER OF ENJOYING IN Sfety ND TRnquillity their nTURl rights, ND THE BLESSINGS OF LIFE: nd whenever these greT OBJECTS re not obtINED, THE PEOPLE Hve  RIGHT TO lter the government, ND TO Tke meSURES NECESSry for their sFETY, PROSPERITY nd hPPINESS.",
                Freddy.solve0("The end of the institution, maintenance, and administration of government, is to secure the existence of the body politic, to protect it, and to furnish the individuals who compose it with the power of enjoying in safety and tranquillity their natural rights, and the blessings of life: and whenever these great objects are not obtained, the people have a right to alter the government, and to take measures necessary for their safety, prosperity and happiness."));
    }

}